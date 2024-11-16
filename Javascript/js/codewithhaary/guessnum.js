const ques = Math.floor(Math.random() * 100) + 1; // Generate a random number between 1 and 100
let ans = 0;

for (let i = 0; i < 100; i++) {
    let response = prompt("Enter your guess:");

    // Check if the user cancels or leaves the input empty
    if (response === null || response === "") {
        alert("You have not entered anything. Please enter a valid number.");
        continue; // Skip the current iteration of the loop
    }

    response = parseInt(response);

    if (response === ques) {
        alert("Congratulations! You guessed the number in " + ans + " attempts.");
        break; // Exit the loop since the correct number has been guessed
    } else if (response < ques) {
        alert("Number is greater.");
        ans++;
    } else {
        alert("Number is smaller.");
        ans++;
    }
}
