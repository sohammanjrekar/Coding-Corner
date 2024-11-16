// Error Objects and Custom Errors in JavaScript

// Error Objects:
// - Errors in JavaScript are represented by objects.
// - When an error occurs during code execution, an error object is created with information about the error, including the error message and stack trace.

// Syntax for Error Handling:
try {
    // Code that may throw an error
    throw new Error('Custom error message');
} catch (error) {
    // Handling the error
    console.error('Error message:', error.message);
    console.error('Stack trace:', error.stack);
}

// Custom Errors:
// - Custom errors can be created by extending the built-in Error class or any of its subclasses.
// - Custom errors allow developers to define more meaningful and specific error types for their applications.

// Syntax for Creating and Handling Custom Errors:
class CustomError extends Error {
    constructor(message) {
        super(message);
        this.name = 'CustomError';
    }
}

try {
    // Code that may throw a custom error
    throw new CustomError('Custom error message');
} catch (error) {
    if (error instanceof CustomError) {
        // Handling the custom error
        console.error('Custom error message:', error.message);
    } else {
        // Handling other types of errors
        console.error('Error:', error.message);
    }
}
