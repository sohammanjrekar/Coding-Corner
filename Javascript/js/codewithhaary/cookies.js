// Function to set a cookie
function setCookie(cookieName, cookieValue, expirationDays) {
    const date = new Date();
    date.setTime(date.getTime() + (expirationDays * 24 * 60 * 60 * 1000)); // Convert days to milliseconds
    const expires = "expires=" + date.toUTCString();
    document.cookie = cookieName + "=" + cookieValue + ";" + expires + ";path=/";
}

// Function to get a cookie value by name
function getCookie(cookieName) {
    const name = cookieName + "=";
    const decodedCookie = decodeURIComponent(document.cookie);
    const cookieArray = decodedCookie.split(';');
    for (let i = 0; i < cookieArray.length; i++) {
        let cookie = cookieArray[i];
        while (cookie.charAt(0) === ' ') {
            cookie = cookie.substring(1);
        }
        if (cookie.indexOf(name) === 0) {
            return cookie.substring(name.length, cookie.length);
        }
    }
    return "";
}

// Function to check if a cookie exists
function cookieExists(cookieName) {
    return getCookie(cookieName) !== "";
}

// Function to delete a cookie by name
function deleteCookie(cookieName) {
    document.cookie = cookieName + "=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
}

// Usage example:
setCookie("username", "John Doe", 30); // Set a cookie named "username" with value "John Doe" that expires in 30 days
console.log(getCookie("username")); // Get the value of the "username" cookie
console.log(cookieExists("username")); // Check if the "username" cookie exists
deleteCookie("username"); // Delete the "username" cookie


// console.log(document.cookie)
// document.cookie="name=harry"
// console.log(document.cookie)
// document.cookie=`${key}=${value}`