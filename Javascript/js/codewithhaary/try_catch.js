// try {
//     // Block of code to try
//     // This code may potentially throw an error
//     // If an error occurs within this block, it will be caught by the catch block
// } catch (error) {
//     // Block of code to handle the error
//     // This block is executed if an error occurs in the try block
//     // The error object contains information about the error, which can be used for logging or further processing
// } finally {
//     // Optional block of code that is always executed regardless of whether an error occurred or not
//     // This block is useful for cleanup tasks that need to be performed regardless of the outcome of the try block
// }


try {
    // Attempt to execute this code
    console.log("Inside try block");
    // This code will throw an error
    nonExistentFunction(); // This function does not exist
} catch (error) {
    // Handle the error
    console.error("An error occurred:", error.message);
} finally {
    // This block will always be executed
    console.log("Finally block executed");
}
