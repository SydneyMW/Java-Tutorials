# Java Tutorials:
1. Java Basics
    * Data Types
    * Loops
    * If Else Statements
    * Switch Statements
1. Java Classes
    * Class Attributes
    * Class Methods
3. Modifiers
    * Access Modifiers
    * Non-Access Modifiers
4. Inheritance
5. Polymorphism
---
# Java Basics:
1. Data Types
2. Loops
3. If Else Statements
4. Switch Statements
---
## 1. Data Types

### Declaring Data
https://github.com/SydneyMW/Java-Tutorials/blob/47caa743b96dbf2d9e4014c591a3ebf2340ced0b/Classes-Basics/QuickStart.java

### String
* ```public:``` class can be accessible by any other class
* ```default:``` if no modifier is specified, the class is only accessible by classes in the same package

### Modifiers for Attributes, Methods, and Constructors
* ```public:``` code is accessible to all classes
* ```private:``` code is only accessible within the declared class
* ```protected:``` code is accessible in the same paclage and subclasses
* ```default:``` if no modifier is specified, the code is only accessible in the same package by default.
---
# Java Classes:
1. Class Attributes
2. Class Methods
---
## 1. Class Attributes

---
## 2. Class Methods

---
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

---
# Inheritance:
1. XX
2. XX
---
## 1. XX

---
## 2. XX

---
# Polymorphism:
1. XX
2. XX
---
## 1. XX

---
## 2. XX

---
