// Asynchronous function using async/await
async function fetchData() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Data fetched");
        }, 2000);
    });
}

// Function to demonstrate async/await
async function main() {
    try {
        const data = await fetchData();
        console.log(data);
    } catch (error) {
        console.error("An error occurred:", error);
    }
}

// Call the async function
main();
