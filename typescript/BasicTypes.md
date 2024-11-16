# Basic Types

**Types in JavaScript**
* string - represent text data
* number -represent number
* boolean - represent  true or false
*  null - only one value : null , intentional absence of value.null is falsy value.
*  undefined - only one value : undefined . default value of uninitialized value. undefined is falsy value.
*  Any - skip type checking. it works like normal js.
*  void - represent constant value
*  Array - ordered list of data
```
let arrayName:number[]=[12,5,4,85];
```

*  Object Type - represent multiple properties.
```
let student:object = {
firstName:'value1',
lastName:'value2'
};
```
*  Union Type
```js
let userId:string|number="wddade";
```
* Void - represent constant value that may be undefined or null.
  1) never : represent value that will never occur,used when function never return value
   ```js
   function myfunc1():never{
       throw new Error("Function never");
   }
   ```
  2) unknown :
   ```js
   let value : unknown =myfunc1();

   let valueASStr:string =value as string;
   ```
  a) not known
  b) type safe counterpart of any.
* Tuple:
```js             
let skill:[string, number]=["python",400]
```
? used for optional tuple type.
```js
let skill:[string, number?]=["python"]
```
  1) number of elements are fixed.
  2) type of elements are known and same.

*  Type Alias :
Creating Temp name of type
```js
type ty=string | number;
let address:ty="soham";
```

*  Interfaces
*  Enums : Group of named constant values.
```js
enum days{ MON,TUE,WED,THU,FRI,SAT,SUN}
```