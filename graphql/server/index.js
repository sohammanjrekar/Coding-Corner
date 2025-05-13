const { ApolloServer } = require("@apollo/server");
const { expressMiddleware } = require("@apollo/server/express4");
const express = require("express");
const cors = require("cors");
const axios = require("axios");

async function startApolloServer() {
  const app = express();

  const server = new ApolloServer({
    typeDefs: `
      type User {
        id: ID!
        name: String!
        username: String!
        email: String!
        phone: String!
        website: String!
      }

      type Todo {
        id: ID!
        title: String!
        completed: Boolean
        user: User
      }

      type Query {
        getTodos: [Todo]
        getAllUsers: [User]
        getUserByid(id: ID!): User
      }
    `,
    resolvers: {
      Todo: {
        user: async (todo) => {
          if (!todo.userId) return null;
          try {
            const res = await axios.get(
              `https://jsonplaceholder.typicode.com/users/${todo.userId}`
            );
            return res.data;
          } catch (err) {
            console.error(
              `Failed to fetch user for todo ${todo.id}`,
              err.message
            );
            return null;
          }
        },
      },
      Query: {
        getTodos: async () => {
          const res = await axios.get(
            "https://jsonplaceholder.typicode.com/todos"
          );
          return res.data; // optional: limit output
        },
        getAllUsers: async () => {
          const res = await axios.get(
            "https://jsonplaceholder.typicode.com/users"
          );
          return res.data;
        },
        getUserByid: async (parent, { id }) => {
          const res = await axios.get(
            `https://jsonplaceholder.typicode.com/users/${id}`
          );
          return res.data;
        },
      },
    },
  });

  await server.start();

  app.use("/graphql", cors(), express.json(), expressMiddleware(server));

  app.listen(8000, () =>
    console.log("🚀 Server ready at http://localhost:8000/graphql")
  );
}

startApolloServer();
