const sum = require('./sum');

// test('add 1 + 2 equals 3', () => {
//     expect(sum(1, 2)).toBe(3);
// });

// test('add 1 + 2 equals 3', () => {
//    expect(sum(1, 2)).not.toBe(3);
// });


// toBe(value): Checks for strict equality (===).
// toBeNull(): Checks if the value is null.
// toBeDefined(): Checks if the value is not undefined.
// toBeTruthy(): Checks if the value is truthy.
// toBeFalsy(): Checks if the value is falsy.
// toEqual(value): Checks for deep equality.
// toMatch(regexpOrString): Checks if a string matches a regular expression or another string.
// toContain(item): Checks if an array or string contains a certain item.
// toBeGreaterThan(value): Checks if a number is greater than a specified value.
// toBeLessThan(value): Checks if a number is less than a specified value.
// toThrow(error): Checks if a function throws an error.
//  toBeLessThanOrEqual(value)

test('array',()=>{
usernames=['john','fred'];
expect(usernames).toContain('john1');
});




// test('object addition',()=> {
//     const data={one:1};
//     data['two'] =2;
//     // expect(data).toEqual({one:1, two:2});
//     expect(null).toBeFalsy({one:1, two:2}); // null is falsy value


// });



