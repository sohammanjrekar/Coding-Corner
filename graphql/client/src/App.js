import "./App.css";
import { useQuery, gql } from "@apollo/client";

const query = gql`
  query {
    getTodos {
      id
      title
      completed
      user {
        id
        name
      }
    }
  }
`;
function App() {
  const { loading, data } = useQuery(query);
  if (loading) return <p>Loading...</p>;
  return (
    <div className="App">
      <ul className="divide-y divide-gray-200 px-4">
        {data.getTodos.map((todo) => (
          <li
            key={todo.id}
            className="p-4 bg-red-200 rounded-lg shadow-md mb-4"
          >
            <div className="flex items-center">
              <input
                type="checkbox"
                checked={todo.completed}
                readOnly
                className="h-4 w-4 text-blue-600"
              />
              <label className="ml-3 block text-gray-900">
                <span className="text-lg font-medium">{todo.title}</span>
                <br />
                <span className="block text-sm font-light text-gray-500">
                  By: {todo.user?.name || "Unknown"}
                </span>
              </label>
            </div>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
