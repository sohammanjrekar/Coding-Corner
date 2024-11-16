let p=fetch("https://goweather.herokuapp.com/weather/Ny")
p.then((value)=>{
    return value;
}).then((value)=>{
   console.log(value);
   
})
// Network Request Example:
// - Network requests often involve asynchronous operations and can result in errors such as network issues or server errors.

// Syntax for Network Request:
async function fetchData() {
    try {
        const response = await fetch('https://example.com/api/data');
        if (!response.ok) {
            throw new Error('Failed to fetch data. Status: ' + response.status);
        }
        const data = await response.json();
        console.log('Data fetched successfully:', data);
    } catch (error) {
        console.error('Error fetching data:', error.message);
    }
}

// Call the fetchData function
fetchData();