// Example of using if statement
let num = 10;

if (num > 0) {
    console.log("Number is positive");
}

// Example of using if...else statement
num = -5;

if (num > 0) {
    console.log("Number is positive");
} else {
    console.log("Number is non-positive");
}
// Example of using if...else if...else statement
 num = 0;

if (num > 0) {
    console.log("Number is positive");
} else if (num < 0) {
    console.log("Number is negative");
} else {
    console.log("Number is zero");
}


// Example of using switch statement
let dayOfWeek = "Monday";

switch (dayOfWeek) {
    case "Monday":
        console.log("Today is Monday");
        break;
    case "Tuesday":
        console.log("Today is Tuesday");
        break;
    case "Wednesday":
        console.log("Today is Wednesday");
        break;
    case "Thursday":
        console.log("Today is Thursday");
        break;
    case "Friday":
        console.log("Today is Friday");
        break;
    default:
        console.log("It's a weekend day");
}


let age = 20;
let isAdult = (age >= 18) ? "Yes" : "No";

console.log(isAdult);  // Output: "Yes" (because age is 20, which is greater than or equal to 18)
