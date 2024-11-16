// For loop
console.log("for loop");

for(i=0;i<5;i++){
    console.log(i);   
}


// while loop
console.log("while loop");
i=0
while(i<5){
    console.log(i);
    i++;
}

// Do while loop (it minimum run once)
console.log("Do while loop");
i=0
do{
    console.log(i);
    i++;
}while(i<5);

// For of loop
console.log("for of loop");
// for(let a of 1){   // throw error i is not itreable
//     console.log(a);
// }

for (const a of "harry") {
    console.log(a);
    
}

// for in loop
console.log("for in loop");
let obj={
    harry:90,
    soham:45,
    goan:86
}
for(let a in obj){
    console.log(a +" : "+obj[a]);
    
}

//for each loop
console.log("foreach loop");
arr=[1,2,3,4,5]
arr.forEach(element => {
    console.log(element);
    
});