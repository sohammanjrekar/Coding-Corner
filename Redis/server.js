const express = require('express');
const client = require('./client');
const axios = require('axios').default;

const app = express();

app.get("/", async (req, res) => {
    try {
        const cacheValue =await client.get("todos");
        if(cacheValue) return  res.json(cacheValue);


        const { data } = await axios.get('https://jsonplaceholder.typicode.com/todos');



        await client.set("todos",JSON.stringify(data));
        await client.expire("todos",30)
        return res.json(data);
    } catch (error) {
        console.error("Error fetching data:", error.message);
        return res.status(500).json({ error: "Internal Server Error" });
    }
});

app.listen(9000, () => {
    console.log("Server is running on port 9000");
});
