# Modifiers: 
1. Access Modifiers
2. Non-Access Modifiers
---
## 1. Access Modifiers

### Modifiers for Classes
* ```public:``` class can be accessible by any other class
* ```default:``` if no modifier is specified, the class is only accessible by classes in the same package

### Modifiers for Attributes, Methods, and Constructors
* ```public:``` code is accessible to all classes
* ```private:``` code is only accessible within the declared class
* ```protected:``` code is accessible in the same paclage and subclasses
* ```default:``` if no modifier is specified, the code is only accessible in the same package by default.
---
## 2. Non-Access Modifiers

### Modifiers for Classes
* ```final:``` the class cannot be inherited by other classes
* ```abstract:``` the class cannot be used to create objects

### Modifiers for Attributes and Methods
* ```final:``` attributes and methods cannot be overridden or modified
* ```static:``` attributes and methods belong to the class as a whole, rather than any particular object of the class
* ```abstract:``` can only be used in an abstract class, and can only be used on methods.  The method does not have a body, such as ```abstract void run();```.  The body is provided by the subclass.
* ```transient:``` attributes and methods are skipped when serializing the object containing them
    
    * *"Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that includes the object's data as well as information about the object's type and the types of data stored in the object."*
    [Java Serialization, by TutorialsPoint](https://www.tutorialspoint.com/java/java_serialization.htm)
* ```synchronized:``` methods can only be accessed by one thread at a time
* ```volatile:``` the value of an attribute is not cached thread-locally, and is always read from the main memory

Definitions retrieved from [W3 Schools Java Tutorials](https://www.w3schools.com/java/default.asp)
