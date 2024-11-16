# Functions in Typescript
Set of statement written for doing a specific task is called functions.

1) Functions has name
2) Functions has block of code(statements)
3) Functions can take parameters
4) Functions can return values
>> In typescript , type of parameters and return type is most impoertat thing.
**Syntax**
```js
function nameOfFunc(a:type.b:type):return Type{
    //something tasks
}
```
```js
let x:(x:number,y:number)=> number=function myfunc(a:number,b:number):number{
    return a+b;
};
```

```js
let person:{
    firstName: string;
    lastName: string;
    getFullName: ()=>string;
}

person={
 firstName:"soham",
 lastName:"manjrekar",
 getFullName: function(){
    return this.firstName+" "+this.lastName;
 }   
}
```

  **Optional Parameter**
  ```js
function sumOfThree(a: number, b: number,c?:number): number{
    console.log("Adding three numbers");
    if(c!==undefined){
        return a+b+c;
    }
    return a + b;
}
sumOfThree(5,6);
  ```

**Default Parameters**
we can use default values of parameters in functions
```js
function sumOfThree(a: number, b: number,c:number=5): number{
    console.log("Adding three numbers");
    return a + b;
}
```