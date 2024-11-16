import { useEffect, useState } from 'react'
import './App.css'
import axios from 'axios'

function App() {
  const [jokes, setJokes] = useState([])

  useEffect(() => {
    axios.get('/api/jokes')
      .then((res) => {
        console.log(res.data)
        setJokes(res.data.jokes) // Assuming the jokes array is nested under 'jokes' key in the response
      })
      .catch((err) => {
        console.log('error in fetch:', err)
      })
  }, []) // Empty dependency array to run the effect only once

  return (
    <div className='container'>
      <h1>{jokes.length}</h1>
      <ol>
        {
          jokes.map((joke) => (
            <li key={joke.id}>
              <p>Question :{joke.question}</p>
              <p>Ans: {joke.answer}</p>
            </li>
          ))
        }</ol>
    </div>
  )
}

export default App
