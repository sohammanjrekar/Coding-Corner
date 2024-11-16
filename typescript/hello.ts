console.log("Starting Typescript")

class Test{}

let ob:Test =new Test();
console.log("this is start");
let firstname="soham";
console.log(typeof firstname);

//Explicit annotate
let userName: String ="uttam";
let address: string

address="soham manjrekar";
address.toUpperCase();
console.log(address);


// Implicit annotate
let password="abc@123";


let userAge: number =65.236
userAge.toPrecision()
console.log(`User is  ${userAge}`);

let isActive: boolean =true;
isActive=false;
console.log(isActive);

let student: {
firstName:string;
lastName:string;
}={
    firstName:"soham",
    lastName:"manjrekar"
}

console.log(student);
console.log(student.firstName);

function ram(rs: string):number{
    console.log(`Hii soham  ${rs}`);
return 4;
}
let ans:number=ram("boss");
console.log(ans);


let userId:string|number="wddade";
console.log(userId +" : "+ typeof userId);
userId=45;
console.log(userId +" : "+ typeof userId);

let myarr:(string|number)[]= ["soham",1];


// function myfunc1():never{
//     throw new Error("Function never");
// }
  
// let value : unknown =myfunc1();

// let valueASStr:string =value as string;
// console.log(valueASStr);

let skill:[string, number?]=["python"];
console.log(skill);

// Enum
enum days{ MON,TUE,WED,THU,FRI,SAT,SUN}

console.log(days.WED);



type manjrekar=string| number;
let address1:string="soham";

type Order={
title:string;
price:number;
status:boolean;
};
let order1:Order

order1={
    title:'This is title',
    price:45566,
    status:true
}

console.log(order1);
console.log(typeof order1);




function sumOfThree(a: number, b: number,c?:number): number{
    console.log("Adding three numbers");
    if(c!==undefined){
        return a+b+c;
    }
    return a + b;
}
console.log(sumOfThree(5,6,4));