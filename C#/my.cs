using System;
using System.IO;  // Include for file input/output operations

class Program1
{
    static void Main()
    {
        // Displaying a simple message to the console
        // Console.WriteLine("Hello, World!");
        
        // Declaring variables of different types and initializing them
        int age = 25;                  // Integer variable
        double price = 19.99;          // Double (floating-point) variable
        char grade = 'A';              // Char variable (single character)
        string name = "John Doe";      // String variable (text)
        bool isStudent = true;         // Boolean variable (true or false)
        
        // Output the values of the variables using string concatenation
        Console.WriteLine("Name: " + name);            // Output: John Doe
        Console.WriteLine("Age: " + age);              // Output: 25
        Console.WriteLine("Price: $" + price);        // Output: 19.99
        Console.WriteLine("Grade: " + grade);         // Output: A
        Console.WriteLine("Is student: " + isStudent); // Output: True

        // Example of declaring multiple variables in a single line
        double width = 10.5, height = 20.0;  // Declare two doubles in one line
        Console.WriteLine("Area: " + (width * height));  // Calculate and display area: 10.5 * 20.0 = 210.0

        // Using constants (value that can't be changed once assigned)
        const double PI = 3.14159;  // Declare a constant
        Console.WriteLine("Value of PI: " + PI);   // Output: 3.14159

        // Default values for uninitialized variables
        // Local variables must be initialized before use, so if you don't initialize them, you'll get a compile-time error.
        // For example, these variables below should not be used before initialization:

        // int age1;                  // Default value: 0
        // double price1;             // Default value: 0.0
        // char grade1;               // Default value: '\0' (null character)
        // string name1;              // Default value: null
        // bool isStudent1;           // Default value: false

        // Example of type conversion
        int myInt = 10;
        double myDouble = 5.25;
        bool myBool = true;

        // Convert integer to string
        Console.WriteLine(Convert.ToString(myInt));    // Output: "10"

        // Convert integer to double
        Console.WriteLine(Convert.ToDouble(myInt));    // Output: 10.0

        // Convert double to integer (will round down)
        Console.WriteLine(Convert.ToInt32(myDouble));  // Output: 5

        // Convert bool to string
        Console.WriteLine(Convert.ToString(myBool));   // Output: "True"

        // Asking user for input
        Console.WriteLine("Enter username:");

        // Read user input from the console and store it in the string variable 'userName'
        string userName = Console.ReadLine();

        // Output the value of the 'userName' variable (the input provided by the user)
        Console.WriteLine("Username is: " + userName);

        // Asking for user's age and adding 1 to it
        Console.WriteLine("Enter your age:");
        int age5 = Convert.ToInt32(Console.ReadLine()); // Convert input to integer
        Console.WriteLine("Your age next year is: " + (age5 + 1));

        // Using a Math method to get the larger of two numbers
        int num2 = Math.Max(78, 100);
        Console.WriteLine("The larger number is: " + num2);  // Output: 100

        // String interpolation example
        string firstName = "John";
        string lastName = "Doe";

        // Using string interpolation to create a greeting message
        string greeting = $"Hello, {firstName} {lastName}!";
        Console.WriteLine(greeting);  // Output: Hello, John Doe!

        // Working with string methods
        string boss = "hello";

        // Converting the string to uppercase
        Console.WriteLine(boss.ToUpper());  // Output: HELLO

        // Converting the string to lowercase
        Console.WriteLine(boss.ToLower());  // Output: hello

        // Getting the length of the string
        Console.WriteLine(boss.Length);     // Output: 5 (because "hello" has 5 characters)

        // Extracting a substring (from index 2, length 3)
        Console.WriteLine(boss.Substring(2, 3));  // Output: "llo"

        // Replacing a substring ("hello" with "Hi")
        Console.WriteLine(boss.Replace("hello", "Hi"));  // Output: Hi

        // Checking if the string contains a certain substring
        Console.WriteLine(boss.Contains("ll"));  // Output: True

        // Finding the index of a character ("l")
        Console.WriteLine(boss.IndexOf("l"));   // Output: 2 (first occurrence of "l")

        // Splitting the string by a delimiter ('l')
        Console.WriteLine(boss.Split('l')[1]);  // Output: "o" (after the first "l")

        // Inserting a string at a specific position (insert "new" at index 2)
        Console.WriteLine(boss.Insert(2, "new"));  // Output: "henewllo"

        // Removing characters from the string (remove 3 characters starting at index 2)
        Console.WriteLine(boss.Remove(2, 3));  // Output: "he"

        // Trimming characters from the start (removes 'h')
        Console.WriteLine(boss.TrimStart('h'));  // Output: "ello"

        // Trimming characters from the end (removes 'o')
        Console.WriteLine(boss.TrimEnd('o'));  // Output: "hell"

        // Padding the string with characters on the left to make it 10 characters wide
        Console.WriteLine(boss.PadLeft(10, '0'));  // Output: "00000hello"

        // Padding the string with characters on the right to make it 10 characters wide
        Console.WriteLine(boss.PadRight(10, 'x'));  // Output: "helloxxxxx"

        // Checking if the string starts with a specific substring
        Console.WriteLine(boss.StartsWith("he"));  // Output: True

        // Checking if the string ends with a specific substring
        Console.WriteLine(boss.EndsWith("lo"));  // Output: True

        // Checking if two strings are equal (case-sensitive comparison)
        Console.WriteLine(boss.Equals("hello"));  // Output: True

        // Checking if two strings are equal (case-insensitive comparison)
        Console.WriteLine(boss.Equals("HELLO", StringComparison.OrdinalIgnoreCase));  // Output: True

        // Comparing strings (lexicographical comparison)
        Console.WriteLine(boss.CompareTo("hello"));  // Output: 0 (strings are equal)
        Console.WriteLine(boss.CompareTo("HELLO"));  // Output: 32 (because "h" is greater than "H")

        // Accessing a specific character from the string (indexing)
        Console.WriteLine(boss[1]);  // Output: "e" (second character in the string)
    

        // If else statement
        if(20 > 18)
        {
            Console.WriteLine("20 is greater than 18");
        }
        else
        {
            Console.WriteLine("20 is not greater than 18");
        }

        // C# Short Hand If...Else (Ternary Operator)
        int time = 20;
        string result = (time < 18) ? "Good day." : "Good evening.";
        Console.WriteLine(result);

        // Switch statement
        int day = 4;
        switch (day) 
        {
            case 6:
                Console.WriteLine("Today is Saturday.");
                break;
            case 7:
                Console.WriteLine("Today is Sunday.");
                break;
            default:
                Console.WriteLine("Looking forward to the Weekend.");
                break;
        }

        // While loop
        int i = 0;
        while(i < 5)
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
            i++;
        }

        // Do-While loop
        i = 0;
        do 
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
            i++;
        }
        while (i < 5);

        // For loop
        for(i = 0; i < 5; i++)
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
        }

        // Foreach loop
        string[] fruits = {"apple", "banana", "cherry"};
        foreach (string fruit in fruits)
        {
            Console.Write(fruit + " ");  // Output: apple banana cherry
        }

        // Arrays

        // Create an array of four elements, and add values later
        string[] cars = new string[4];

        // Create an array of four elements and add values right away
        string[] cars1 = new string[4] {"Volvo", "BMW", "Ford", "Mazda"};

        // Create an array of four elements without specifying the size 
        string[] cars2 = new string[] {"Volvo", "BMW", "Ford", "Mazda"};

        // Create an array of four elements, omitting the new keyword, and without specifying the size
        string[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};

        // Sorting an array
        int[] myNumbers = {5, 1, 8, 9};
        Array.Sort(myNumbers);  // Sort the array in ascending order
        foreach (int num in myNumbers)
        {
            Console.WriteLine(num);  // Output: 1 5 8 9
        }

        // Multidimensional arrays
        int[,] numbers = { {1, 4, 2}, {3, 6, 8} };
        foreach (int num in numbers)
        {
            Console.WriteLine(num);  // Output: 1 4 2 3 6 8
        }

        // Function
        MyMethod();  // Calling a method

        // Define a simple method
        static void MyMethod() 
        {
            Console.WriteLine("I just got executed!");
        }

        // File I/O (File operations)
        string writeText = "Hello World!";  // Create a text string
        File.WriteAllText("filename.txt", writeText);  // Create a file and write the content of writeText to it

        string readText = File.ReadAllText("filename.txt");  // Read the contents of the file
        Console.WriteLine(readText);  // Output the content: Hello World!

        // Try-Catch block for error handling
        try
        {
            int[] myNumbers = {1, 2, 3};
            Console.WriteLine(myNumbers[10]);  // This will throw an exception because the index is out of bounds
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);  // Output: Index was outside the bounds of the array
        }

        // Enum Example
        enum Level
        {
            Low,
            Medium,
            High
        }
        Level myvar = Level.Medium;
        Console.WriteLine("Level " + myvar);  // Output: Level Medium
    }
}
using System;
using System.IO;  // Include for file input/output operations

class Program
{
    static void Main()
    {
        // Displaying a simple message to the console
        // Console.WriteLine("Hello, World!");
        
        // Declaring variables of different types and initializing them
        int age = 25;                  // Integer variable
        double price = 19.99;          // Double (floating-point) variable
        char grade = 'A';              // Char variable (single character)
        string name = "John Doe";      // String variable (text)
        bool isStudent = true;         // Boolean variable (true or false)
        
        // Output the values of the variables using string concatenation
        Console.WriteLine("Name: " + name);            // Output: John Doe
        Console.WriteLine("Age: " + age);              // Output: 25
        Console.WriteLine("Price: $" + price);        // Output: 19.99
        Console.WriteLine("Grade: " + grade);         // Output: A
        Console.WriteLine("Is student: " + isStudent); // Output: True

        // Example of declaring multiple variables in a single line
        double width = 10.5, height = 20.0;  // Declare two doubles in one line
        Console.WriteLine("Area: " + (width * height));  // Calculate and display area: 10.5 * 20.0 = 210.0

        // Using constants (value that can't be changed once assigned)
        const double PI = 3.14159;  // Declare a constant
        Console.WriteLine("Value of PI: " + PI);   // Output: 3.14159

        // Default values for uninitialized variables
        // Local variables must be initialized before use, so if you don't initialize them, you'll get a compile-time error.
        // For example, these variables below should not be used before initialization:

        // int age1;                  // Default value: 0
        // double price1;             // Default value: 0.0
        // char grade1;               // Default value: '\0' (null character)
        // string name1;              // Default value: null
        // bool isStudent1;           // Default value: false

        // Example of type conversion
        int myInt = 10;
        double myDouble = 5.25;
        bool myBool = true;

        // Convert integer to string
        Console.WriteLine(Convert.ToString(myInt));    // Output: "10"

        // Convert integer to double
        Console.WriteLine(Convert.ToDouble(myInt));    // Output: 10.0

        // Convert double to integer (will round down)
        Console.WriteLine(Convert.ToInt32(myDouble));  // Output: 5

        // Convert bool to string
        Console.WriteLine(Convert.ToString(myBool));   // Output: "True"

        // Asking user for input
        Console.WriteLine("Enter username:");

        // Read user input from the console and store it in the string variable 'userName'
        string userName = Console.ReadLine();

        // Output the value of the 'userName' variable (the input provided by the user)
        Console.WriteLine("Username is: " + userName);

        // Asking for user's age and adding 1 to it
        Console.WriteLine("Enter your age:");
        int age5 = Convert.ToInt32(Console.ReadLine()); // Convert input to integer
        Console.WriteLine("Your age next year is: " + (age5 + 1));

        // Using a Math method to get the larger of two numbers
        int num2 = Math.Max(78, 100);
        Console.WriteLine("The larger number is: " + num2);  // Output: 100

        // String interpolation example
        string firstName = "John";
        string lastName = "Doe";

        // Using string interpolation to create a greeting message
        string greeting = $"Hello, {firstName} {lastName}!";
        Console.WriteLine(greeting);  // Output: Hello, John Doe!

        // Working with string methods
        string boss = "hello";

        // Converting the string to uppercase
        Console.WriteLine(boss.ToUpper());  // Output: HELLO

        // Converting the string to lowercase
        Console.WriteLine(boss.ToLower());  // Output: hello

        // Getting the length of the string
        Console.WriteLine(boss.Length);     // Output: 5 (because "hello" has 5 characters)

        // Extracting a substring (from index 2, length 3)
        Console.WriteLine(boss.Substring(2, 3));  // Output: "llo"

        // Replacing a substring ("hello" with "Hi")
        Console.WriteLine(boss.Replace("hello", "Hi"));  // Output: Hi

        // Checking if the string contains a certain substring
        Console.WriteLine(boss.Contains("ll"));  // Output: True

        // Finding the index of a character ("l")
        Console.WriteLine(boss.IndexOf("l"));   // Output: 2 (first occurrence of "l")

        // Splitting the string by a delimiter ('l')
        Console.WriteLine(boss.Split('l')[1]);  // Output: "o" (after the first "l")

        // Inserting a string at a specific position (insert "new" at index 2)
        Console.WriteLine(boss.Insert(2, "new"));  // Output: "henewllo"

        // Removing characters from the string (remove 3 characters starting at index 2)
        Console.WriteLine(boss.Remove(2, 3));  // Output: "he"

        // Trimming characters from the start (removes 'h')
        Console.WriteLine(boss.TrimStart('h'));  // Output: "ello"

        // Trimming characters from the end (removes 'o')
        Console.WriteLine(boss.TrimEnd('o'));  // Output: "hell"

        // Padding the string with characters on the left to make it 10 characters wide
        Console.WriteLine(boss.PadLeft(10, '0'));  // Output: "00000hello"

        // Padding the string with characters on the right to make it 10 characters wide
        Console.WriteLine(boss.PadRight(10, 'x'));  // Output: "helloxxxxx"

        // Checking if the string starts with a specific substring
        Console.WriteLine(boss.StartsWith("he"));  // Output: True

        // Checking if the string ends with a specific substring
        Console.WriteLine(boss.EndsWith("lo"));  // Output: True

        // Checking if two strings are equal (case-sensitive comparison)
        Console.WriteLine(boss.Equals("hello"));  // Output: True

        // Checking if two strings are equal (case-insensitive comparison)
        Console.WriteLine(boss.Equals("HELLO", StringComparison.OrdinalIgnoreCase));  // Output: True

        // Comparing strings (lexicographical comparison)
        Console.WriteLine(boss.CompareTo("hello"));  // Output: 0 (strings are equal)
        Console.WriteLine(boss.CompareTo("HELLO"));  // Output: 32 (because "h" is greater than "H")

        // Accessing a specific character from the string (indexing)
        Console.WriteLine(boss[1]);  // Output: "e" (second character in the string)
    

        // If else statement
        if(20 > 18)
        {
            Console.WriteLine("20 is greater than 18");
        }
        else
        {
            Console.WriteLine("20 is not greater than 18");
        }

        // C# Short Hand If...Else (Ternary Operator)
        int time = 20;
        string result = (time < 18) ? "Good day." : "Good evening.";
        Console.WriteLine(result);

        // Switch statement
        int day = 4;
        switch (day) 
        {
            case 6:
                Console.WriteLine("Today is Saturday.");
                break;
            case 7:
                Console.WriteLine("Today is Sunday.");
                break;
            default:
                Console.WriteLine("Looking forward to the Weekend.");
                break;
        }

        // While loop
        int i = 0;
        while(i < 5)
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
            i++;
        }

        // Do-While loop
        i = 0;
        do 
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
            i++;
        }
        while (i < 5);

        // For loop
        for(i = 0; i < 5; i++)
        {
            Console.Write(i + " ");  // Output: 0 1 2 3 4
        }

        // Foreach loop
        string[] fruits = {"apple", "banana", "cherry"};
        foreach (string fruit in fruits)
        {
            Console.Write(fruit + " ");  // Output: apple banana cherry
        }

        // Arrays

        // Create an array of four elements, and add values later
        string[] cars = new string[4];

        // Create an array of four elements and add values right away
        string[] cars1 = new string[4] {"Volvo", "BMW", "Ford", "Mazda"};

        // Create an array of four elements without specifying the size 
        string[] cars2 = new string[] {"Volvo", "BMW", "Ford", "Mazda"};

        // Create an array of four elements, omitting the new keyword, and without specifying the size
        string[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};

        // Sorting an array
        int[] myNumbers = {5, 1, 8, 9};
        Array.Sort(myNumbers);  // Sort the array in ascending order
        foreach (int num in myNumbers)
        {
            Console.WriteLine(num);  // Output: 1 5 8 9
        }

        // Multidimensional arrays
        int[,] numbers = { {1, 4, 2}, {3, 6, 8} };
        foreach (int num in numbers)
        {
            Console.WriteLine(num);  // Output: 1 4 2 3 6 8
        }

        // Function
        MyMethod();  // Calling a method

        // Define a simple method
        static void MyMethod() 
        {
            Console.WriteLine("I just got executed!");
        }

        // File I/O (File operations)
        string writeText = "Hello World!";  // Create a text string
        File.WriteAllText("filename.txt", writeText);  // Create a file and write the content of writeText to it

        string readText = File.ReadAllText("filename.txt");  // Read the contents of the file
        Console.WriteLine(readText);  // Output the content: Hello World!

        // Try-Catch block for error handling
        try
        {
            int[] myNumbers = {1, 2, 3};
            Console.WriteLine(myNumbers[10]);  // This will throw an exception because the index is out of bounds
        }
        catch (Exception e)
        {
            Console.WriteLine(e.Message);  // Output: Index was outside the bounds of the array
        }

        // Enum Example
        enum Level
        {
            Low,
            Medium,
            High
        }
        Level myvar = Level.Medium;
        Console.WriteLine("Level " + myvar);  // Output: Level Medium
    }
}
