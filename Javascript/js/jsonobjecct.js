
let student={
    name:"soham",
    age:19,
    dep:"computer"
}

let res=JSON.stringify(student);
console.log(typeof res);
let ans=JSON.parse(res);
console.log(typeof ans);


// localStorage.setItem('Name','boss');

localStorage.getItem('Name')