# Java Tutorials:
1. [**Java Basics**](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#java-basics)
    * [Printing](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-printing)
    * [Data Types](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-data-types)
    * [Loops](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#3-loops)
    * [Arrays](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#4-arrays)
    * [If Else Statements](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#5-if-else-statements)
    * [Switch Statements](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#6-switch-statements)
1. [**Java Classes**](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#java-classes)
    * [Constructing Classes](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-constructing-classes)
    * [Class Attributes](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-class-attributes)
    * [Class Methods](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#3-class-methods)
3. [**Modifiers**](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#modifiers)
    * [Access Modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-access-modifiers)
    * [Non-Access Modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-non-access-modifiers)
4. [**Inheritance**](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#inheritance)
5. [**Polymorphism**](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#polymorpism)
---
# Java Basics:
1. [Printing](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-printing)
2. [Data Types](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-data-types)
3. [Arrays](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#3-arrays)
4. [Loops](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#4-loops)
5. [If Else Statements](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#5-if-else-statements)
6. [Switch Statements](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#6-switch-statements)

## 1. Printing

Simple Printing:
https://github.com/SydneyMW/Java-Tutorials/blob/d46d2b13da2c7622b340847453821278e21ae1a6/Classes-Basics/QuickStart.java#L4-L8
Printing with Variables:
https://github.com/SydneyMW/Java-Tutorials/blob/d46d2b13da2c7622b340847453821278e21ae1a6/Classes-Basics/QuickStart.java#L23-L28


## 2. Data Types

### Declarations and Definitions
Strings
* ```String myString;``` declare a string called myString
* ```myString = "Name";``` define myString's value
* ```String myString = "Name";``` declare/define a string called myString

Characters
* ```char myChar = 's';``` declare/define a char called myChar
* ```char ascii = 65;``` declare/define a char called ascii using its ASCII number

Booleans
* ```boolean myBool = true;``` declare/define a boolean called myBool

Integers
* ```int myInt = 12;``` declare/define an integer called myInt
* ```int x, y, z;``` declare integers x, y, and z
* ```x = y = z = 50;``` define x, y, and z to have the same value

Floats and Doubles
* ```float myFloat = 12.f;``` declare/define a float called myFloat
* ```double myDouble = 12345678.12;``` declare/define a double called myDouble

### Data Type Sizes and Ranges
* ```byte:``` **1 byte;** ranges from (-128 - 127)
* ```short:``` **2 bytes;** ranges from (-32,768 - 32,767)
* ```int:``` **4 bytes;** ranges from (-2,147,483,648 - 2,147,483,647)
* ```long:``` **8 bytes;** ranges from (-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807)
* ```float:``` **4 bytes;** stores fractional numbers for 6 - 7 decimal digits
* ```double:``` **8 bytes;** stores fractional numbers for 15 decimal digits
* ```boolean:``` **1 bit;** stores true or false values
* ```char:``` **2 bytes;** stores a single character or an ASCII value

### Type Casting
**Wide casting** casts a variable to a larger type

Casting follows the direction: *byte -> short -> char -> int -> long -> float -> double*
* ```double myDoubleCast = myInt;``` cast from an integer to a double

**Narrow casting** casts a variable to a smaller type

Casting follows the direction: *double -> float -> long -> int -> char -> short -> byte*
* ```int myIntCast = (int) myDouble;``` cast from a double to an integer; must enclose new type in parenthesis

### Numeric Operations
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L38-L43

## 3. Loops

### For Loops
Simple Numeric Iteration:
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L119-L121

Skipping Numeric Iteration:
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L123-L125

### For Each Loops
Iterates through elements of iterable object
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L129-L132

### While Loops
Evaluates condition immediately to proceed to code block
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L98-L107

### Do While Loops
Ensures that the code block is executed once prior to evaluation of while loop condition
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L110-L115

### Break
Break statements force exiting of the loop immediately
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L136-L141

### Continue
Continue statements cause the code to skip the rest of the iteration and continue in the loop
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L145-L150

## 4. Arrays
Simple Array
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L153-L162

Multidimensional Array
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L165-L172

## 5. If Else Statements

Basic Format
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L50-L57

Shorthand Format
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L60-L61

If, Else If, Else Format
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L65-L73

## 6. Switch Statements
A statement is passed to switch, and evaluated by comparison to cases; default case is used only when no match is found
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/QuickStart.java#L76-L95

---
# Java Classes:
1. [Constructing Classes](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-constructing-classes)
1. [Class Attributes](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-class-attributes)
2. [Class Methods](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#3-class-methods)

## 1. Constructing Classes
Suppose we define a class called Construct with attributes x and Name:
```
public class Construct {
   int x;
   String Name;
}
```
Then to be able to instantiate Construct objects, we must add a constructor function with the same name:
```
public Construct() {
   x = 5;
}
```
This ensures that all Construct objects will have an x-value attribute of 5 when initialized.  We can also pass parameters to our constructor function to be able to personalize the initialization of these objects.
```
public Construct(int y, String name) {
   x = y;
   Name = name;
}
```
We can then provide as much or as little information as we like when initializing an object of our Construct class.  We can also change these values after initialization, unless otherwise specified (see [attribute modifiers section](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-non-access-modifiers) for exceptions)

Construct class full example:
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Construct.java#L1-L27


## 2. Class Attributes
When we construct classes, we can declare as many attributes as we like. We have to decide: 
* Whether to define them in the class, upon initialization, or later
* Whether they are mutable or immutable
* Which classes they will be accessible to
These are specified with [attribute modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#modifiers)

In this example, objects of Class2 will be initialized to have a y attribute with the value 6.
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Class2.java#L1-L3

In this example, objects of Class3 will be initialized to have a y attribute declared but not defined.
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Class3.java#L1-L3

In this example, objects of Class4 will be initialized to have an immutable x attribute with the permanent value of 36.
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Class4.java#L1-L3

If attributes are public, they can be directly re-assigned by calling [object name].[attribute name]
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Class1.java#L19-L24

If attributes are final, attempting to re-assign them will generate an error
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Classes-Basics/Class1.java#L33-L36

If attributes are private, attempting to directly access them will generate an error. We need to add public or protected "get" methods to the class to enable direct access of these attributes by objects of any class or the same class, respectively.

Static attributes are shared by all members of the same class.  When any object of the class alters this variable, it is altered for the entire class.


## 3. Class Methods
When we construct classes, we can also add functions which an object of that class will be able to perform.
Similarly to attributes, when we construct classes, we have to decide: 
* Whether to define them in the class, upon initialization, or in children of the class (see [inheritance section](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#inheritance))
* Whether they are mutable or immutable
* Which classes they will be accessible to

These are specified with [attribute modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#modifiers).  If we create a class Produce with private attributes ```color```, ```name```, and ```numPlanted```, we need to define **getter** and **setter** functions on order to access and modify these attributes.
```
public class Produce {
   private String color;
   private String name;
   private int numPlanted;
}
```
The **getter functions** are defined as:
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Inheritance-Produce/Produce.java#L24-L32

The **setter functions** are defined as:
https://github.com/SydneyMW/Java-Tutorials/blob/b5073aee2775f848e7babea4ce070a11cddad5bd/Inheritance-Produce/Produce.java#L13-L21

---
# Modifiers: 
1. [Access Modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#1-access-modifiers)
2. [Non-Access Modifiers](https://github.com/SydneyMW/Java-Tutorials/edit/master/README.md#2-non-access-modifiers)


## 1. Access Modifiers

### Modifiers for Classes
* ```public:``` class can be accessible by any other class
* ```default:``` if no modifier is specified, the class is only accessible by classes in the same package

### Modifiers for Attributes, Methods, and Constructors
* ```public:``` code is accessible to all classes
* ```private:``` code is only accessible within the declared class
* ```protected:``` code is accessible in the same paclage and subclasses
* ```default:``` if no modifier is specified, the code is only accessible in the same package by default.


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
We can construct classes to represent "parents" and "children" of each other.  

For example, if we define a parent class ```Produce``` and a child class ```Fruit```, we denote this with ```class Fruit extends Produce```.  This causes the Fruit class to inherit all of the attributes and methods defined in the parent class which are ```public``` or ```protected```.

If the parent class is **abstract**, it cannot be directly instantiated.  Instead, objects can only be constructed from child classes of the parent.  

For example, define our parent class as an abstract class. It has private attributes, protected setter and getter functions, and public plant and harvest methods.
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Inheritance-Produce/Produce.java#L2-L74

Now define our child class, ```Fruit```, which extends ```Produce```.  This means it has access to the protected and public methods of ```Fruit```, including the getter and setter functions, and the ```harvest``` and ```plant``` methods.  It and has additional constructers for instantiation.
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Inheritance-Produce/Produce.java#L76-L97

We can create another child class, ```Vegetable```, which similarly extends ```Produce``` and has its own constructors.
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Inheritance-Produce/Produce.java#L99-L120

Now, in our main class, we can instantiate fruits and vegetables, and simulate their harvesting and planting as desired using these inherited methods.
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Inheritance-Produce/ProduceMain.java#L1-L14

This simulation in ProduceMain would give the terminal output:
```
javac ProduceMain
Planting 2 of eggplant
Now we have 6
Planting a single grapefruit
Now we have 1
Harvesting a single eggplant
Now we have 5
Harvesting a single eggplant
Now we have 4
Harvesting a single grapefruit
Now we have 0
We don't have enough grapefruit for that. There are only 0 left
We ended up with 4 purple eggplants
We ended up with 0 red grapefruits
```

---
# Polymorphism:
If we create a hierarchy of classes, we can give them personalized methods that share the same names but are independent of each other.

For example, we might define a parent class ```Student```, and a method ```doHomework()``` which prints a generalized statement "Doing homework".
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Polymorphism-Student/Student.java#L4-L8

If we want to create subclasses ```computerScienceStudent``` and ```economicsStudent``` with personalized attributes and methods, we may also want to personalize their inherited methods.
We can use the same name as the original function but alter what it does:
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Polymorphism-Student/Student.java#L10-L20

Thus if we create objects of the Student, computerScienceStudent, and economicsStudent classes, and have each object perform its ```doHomework()``` method, three unique statements will be printed.
https://github.com/SydneyMW/Java-Tutorials/blob/ecf47c344f2a2a536a6d0920fa64bd2842bc9c58/Polymorphism-Student/StudentMain.java#L1-L10

This will generate the terminal output:
```
Doing homework
Doing programming assignments
Doing readings
```
---
