// 1. Strategy Pattern
// Strategy Pattern allows selecting an algorithm's behavior at runtime.

class StrategyPattern {
    constructor(strategy) {
      this.strategy = strategy;
    }
  
    execute(a, b) {
      return this.strategy.execute(a, b);
    }
  }
  
  // Concrete Strategies
  class AddStrategy {
    execute(a, b) {
      return a + b;
    }
  }
  
  class SubtractStrategy {
    execute(a, b) {
      return a - b;
    }
  }
  
  class MultiplyStrategy {
    execute(a, b) {
      return a * b;
    }
  }
  
  // Client code
  const add = new StrategyPattern(new AddStrategy());
  console.log("Add: " + add.execute(10, 5)); // 15
  
  const subtract = new StrategyPattern(new SubtractStrategy());
  console.log("Subtract: " + subtract.execute(10, 5)); // 5
  
  const multiply = new StrategyPattern(new MultiplyStrategy());
  console.log("Multiply: " + multiply.execute(10, 5)); // 50
  
  
  // 2. Observer Pattern
  // The Observer Pattern defines a one-to-many dependency so that when one object changes state, all its dependents are notified.
  
  class ObserverPattern {
    constructor() {
      this.observers = [];
    }
  
    addObserver(observer) {
      this.observers.push(observer);
    }
  
    removeObserver(observer) {
      this.observers = this.observers.filter(obs => obs !== observer);
    }
  
    notifyObservers() {
      this.observers.forEach(observer => observer.update());
    }
  }
  
  // Concrete Observer
  class ConcreteObserver {
    update() {
      console.log("Observer has been notified!");
    }
  }
  
  // Client code
  const subject = new ObserverPattern();
  const observer1 = new ConcreteObserver();
  const observer2 = new ConcreteObserver();
  
  subject.addObserver(observer1);
  subject.addObserver(observer2);
  subject.notifyObservers(); // Notifies both observers
  
  
  // 3. Command Pattern
  // The Command Pattern turns a request into a stand-alone object that contains all information about the request.
  
  class CommandPattern {
    constructor(execute) {
      this.execute = execute;
    }
  }
  
  class Light {
    turnOn() {
      console.log("The light is ON!");
    }
    
    turnOff() {
      console.log("The light is OFF!");
    }
  }
  
  class TurnOnCommand {
    constructor(light) {
      this.light = light;
    }
    
    execute() {
      this.light.turnOn();
    }
  }
  
  class TurnOffCommand {
    constructor(light) {
      this.light = light;
    }
    
    execute() {
      this.light.turnOff();
    }
  }
  
  // Client code
  const light = new Light();
  const turnOn = new TurnOnCommand(light);
  const turnOff = new TurnOffCommand(light);
  
  turnOn.execute(); // The light is ON!
  turnOff.execute(); // The light is OFF!
  
  
  // 4. Template Method Pattern
  // The Template Method defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
  
  class TemplateMethodPattern {
    constructor() {}
    
    // Template method (final method)
    execute() {
      this.step1();
      this.step2();
      this.step3();
    }
  
    step1() {
      console.log("Step 1: Initializing");
    }
  
    step2() {
      console.log("Step 2: Processing");
    }
  
    step3() {
      console.log("Step 3: Finalizing");
    }
  }
  
  // Client code
  class CustomProcess extends TemplateMethodPattern {
    step2() {
      console.log("Step 2: Custom Processing");
    }
  }
  
  const process = new CustomProcess();
  process.execute();
  // Output:
  // Step 1: Initializing
  // Step 2: Custom Processing
  // Step 3: Finalizing
  
  
  // 5. Chain of Responsibility Pattern
  // The Chain of Responsibility pattern gives more than one object a chance to handle a request, and passes the request along the chain until an object handles it.
  
  class ChainOfResponsibility {
    constructor() {
      this.nextHandler = null;
    }
  
    setNext(handler) {
      this.nextHandler = handler;
    }
  
    handleRequest(request) {
      if (this.nextHandler) {
        return this.nextHandler.handleRequest(request);
      }
      return "No handler found for request: " + request;
    }
  }
  
  // Concrete handlers
  class HandlerA extends ChainOfResponsibility {
    handleRequest(request) {
      if (request === "A") {
        return "Handler A handled request: A";
      }
      return super.handleRequest(request);
    }
  }
  
  class HandlerB extends ChainOfResponsibility {
    handleRequest(request) {
      if (request === "B") {
        return "Handler B handled request: B";
      }
      return super.handleRequest(request);
    }
  }
  
  // Client code
  const handlerA = new HandlerA();
  const handlerB = new HandlerB();
  handlerA.setNext(handlerB);
  
  console.log(handlerA.handleRequest("A")); // Handler A handled request: A
  console.log(handlerA.handleRequest("B")); // Handler B handled request: B
  console.log(handlerA.handleRequest("C")); // No handler found for request: C
  
  
  // 6. State Pattern
  // The State Pattern allows an object to change its behavior when its internal state changes.
  
  class StatePattern {
    constructor() {
      this.state = new ConcreteStateA();
    }
  
    setState(state) {
      this.state = state;
    }
  
    request() {
      this.state.handle();
    }
  }
  
  class ConcreteStateA {
    handle() {
      console.log("State A: Handling request in State A");
    }
  }
  
  class ConcreteStateB {
    handle() {
      console.log("State B: Handling request in State B");
    }
  }
  
  // Client code
  const context = new StatePattern();
  context.request(); // State A: Handling request in State A
  context.setState(new ConcreteStateB());
  context.request(); // State B: Handling request in State B
  
  
  // 7. Memento Pattern
  // The Memento Pattern captures and externalizes an object's internal state so that the object can be restored to this state later.
  
  class MementoPattern {
    constructor(state) {
      this.state = state;
    }
  }
  
  class Originator {
    constructor() {
      this.state = "";
    }
  
    setState(state) {
      this.state = state;
      console.log("State set to:", this.state);
    }
  
    saveStateToMemento() {
      return new MementoPattern(this.state);
    }
  
    restoreStateFromMemento(memento) {
      this.state = memento.state;
      console.log("State restored to:", this.state);
    }
  }
  
  // Client code
  const originator = new Originator();
  originator.setState("State1");
  const memento = originator.saveStateToMemento();
  originator.setState("State2");
  originator.restoreStateFromMemento(memento);
  
  
  // 8. Iterator Pattern
  // The Iterator Pattern provides a way to access elements of an aggregate object sequentially without exposing its underlying representation.
  
  class IteratorPattern {
    constructor(items) {
      this.items = items;
      this.index = 0;
    }
  
    next() {
      return this.items[this.index++];
    }
  
    hasNext() {
      return this.index < this.items.length;
    }
  }
  
  // Client code
  const items = [1, 2, 3, 4, 5];
  const iterator = new IteratorPattern(items);
  
  while (iterator.hasNext()) {
    console.log(iterator.next());
  }
  // Output: 1, 2, 3, 4, 5
  
  
  // 9. Mediator Pattern
  // The Mediator Pattern defines an object that encapsulates how a set of objects interact.
  
  class MediatorPattern {
    constructor() {
      this.components = [];
    }
  
    addComponent(component) {
      this.components.push(component);
    }
  
    notify(sender, event) {
      this.components.forEach(component => {
        if (component !== sender) {
          component.receive(event);
        }
      });
    }
  }
  
  class Component {
    constructor(name, mediator) {
      this.name = name;
      this.mediator = mediator;
      mediator.addComponent(this);
    }
  
    send(event) {
      console.log(`${this.name} is sending event: ${event}`);
      this.mediator.notify(this, event);
    }
  
    receive(event) {
      console.log(`${this.name} received event: ${event}`);
    }
  }
  
  // Client code
  const mediator = new MediatorPattern();
  const componentA = new Component("Component A", mediator);
  const componentB = new Component("Component B", mediator);
  
  componentA.send("Hello from A");
  componentB.send("Hello from B");
  