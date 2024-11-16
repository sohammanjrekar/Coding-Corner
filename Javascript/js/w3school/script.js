function Person(first, last, age, eyecolor) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
    this.fullName = function() {
      return this.firstName + " " + this.lastName;
    };
  }
  
  // Creating a new Person instance
  const person1 = new Person("John", "Doe", 30, "blue");
  
  console.log(person1.fullName());