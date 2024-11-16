// C# (C-Sharp) is a modern, object-oriented programming language developed by Microsoft. 
// It is a part of the .NET framework and can be used to develop a variety of applications 
// like web apps, desktop apps, mobile apps, games, and more. 

using System;  // This line tells the compiler to include the System namespace, which contains fundamental classes like Console. 

// The `namespace` keyword is used to define a collection of related classes and other types. 
// It's a way to organize and group code logically. In this case, we define a namespace called "Hello" to hold the code.

namespace Hello  
{
    // The `class` keyword is used to define a class. A class is a blueprint for creating objects (instances) that hold data and behavior.
    // The `Program` class is where our main logic resides.
    // Every C# application starts execution in the Main method of a class, which is the entry point of the program.
    class Program  
    {
        // The `static` keyword indicates that the method belongs to the class itself rather than an instance of the class.
        // `void` means that this method doesn't return any value. 
        // `Main` is the entry point of a C# application, where the program begins execution.
        static void Main(string[] args)  
        {
            // `Console` is a built-in C# class that provides methods for interacting with the console (or terminal/command prompt).
            // `WriteLine` is a method of the Console class, used to output text to the console followed by a new line.
            Console.WriteLine("Hello World"); // This will print "Hello World" to the console.

            // The program will end after this line, as there are no more instructions.
            // Execution of the `Main` method will return control back to the system once completed.
        }
    }
}
