void main() {
  // String: Used for text
  String name = "Soham";
  print(name);

  // int: Used for integers
  int age = 25;
  print(age);

  // double: Used for decimal numbers
  double height = 5.9;
  print(height);

  // bool: Used for true/false values
  bool isStudent = true;
  print(isStudent);

  // var: Dart infers the type based on the assigned value
  var city = "Mumbai";
  print(city);

  // dynamic: Type can change during runtime
  dynamic anything = "Hello";
  print(anything);
  anything = 123; // Now an integer
  print(anything);

  // const: Compile-time constant (value cannot change)
  const pi = 3.14159;
  print(pi);

  // final: Value can only be set once but can be determined at runtime
  final currentTime = DateTime.now();
  print(currentTime);

  // List: Collection of items (array-like)
  List<String> fruits = ["Apple", "Banana", "Cherry"];
  print(fruits);

  // Map: Key-value pair data structure
  Map<String, int> scores = {"Math": 90, "English": 85};
  print(scores);

  // Set: Unordered collection of unique items
  Set<int> uniqueNumbers = {1, 2, 3, 3};
  print(uniqueNumbers); // Duplicates will be removed

  // Null safety: Using nullable types (variables that can hold null)
  String? nullableName;
  print(nullableName); // Output: null
  nullableName = "Nullable Soham";
  print(nullableName);
}
