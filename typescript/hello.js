console.log("Starting Typescript");
var Test = /** @class */ (function () {
    function Test() {
    }
    return Test;
}());
var ob = new Test();
console.log("this is start");
var firstname = "soham";
console.log(typeof firstname);
//Explicit annotate
var userName = "uttam";
var address;
address = "soham manjrekar";
address.toUpperCase();
console.log(address);
// Implicit annotate
var password = "abc@123";
var userAge = 65.236;
userAge.toPrecision();
console.log("User is  ".concat(userAge));
var isActive = true;
isActive = false;
console.log(isActive);
var student = {
    firstName: "soham",
    lastName: "manjrekar"
};
console.log(student);
console.log(student.firstName);
function ram(rs) {
    console.log("Hii soham  ".concat(rs));
    return 4;
}
var ans = ram("boss");
console.log(ans);
var userId = "wddade";
console.log(userId + " : " + typeof userId);
userId = 45;
console.log(userId + " : " + typeof userId);
var myarr = ["soham", 1];
// function myfunc1():never{
//     throw new Error("Function never");
// }
// let value : unknown =myfunc1();
// let valueASStr:string =value as string;
// console.log(valueASStr);
var skill = ["python"];
console.log(skill);
// Enum
var days;
(function (days) {
    days[days["MON"] = 0] = "MON";
    days[days["TUE"] = 1] = "TUE";
    days[days["WED"] = 2] = "WED";
    days[days["THU"] = 3] = "THU";
    days[days["FRI"] = 4] = "FRI";
    days[days["SAT"] = 5] = "SAT";
    days[days["SUN"] = 6] = "SUN";
})(days || (days = {}));
console.log(days.WED);
var address1 = "soham";
var order1;
order1 = {
    title: 'This is title',
    price: 45566,
    status: true
};
console.log(order1);
console.log(typeof order1);
function sumOfThree(a, b, c) {
    console.log("Adding three numbers");
    if (c !== undefined) {
        return a + b + c;
    }
    return a + b;
}
console.log(sumOfThree(5, 6, 4));
