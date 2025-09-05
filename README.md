# Returning an Object through a Method

An educational project that demonstrates how to return objects through methods in Java:
- Returning simple objects (`String`)
- Returning a custom class object (encapsulating both message and severity code)

## Table of contents
1. [Description](#description)
2. [Technologies](#technologies)
3. [Installation and Running](#installation-and-running)
4. [Author](#author)
5. [Code example](#code-example)
6. [Screenshots](#screenshots)

## Description

This project contains two independent examples of object return in Java:

1.**Returning a `String` object**:
- The  `ErrorMessage` class stores an array of error messages.
- The `getErrorMessage(int i)` method returns a `String` message for the specified error code.

2.**Returning a custom class object**:
- The `ErrorForMessage` class encapsulated both the error message and its severity level.
- The `ErrorInformation` class uses `getErrorInformation(int i)` to return an `ErrorMessage` object.

### Purpose

The project was created as a learning playground for practicing:
- Returning objects from methods.
- Encapsulation of data in classes.
- Working with arrays of objects.
- Handling invalid input with fallback values.

### Topics and Examples

1.**Package:** `returing_an_object_of_type_string`
- Class `ErrorMessage`: returns a `String` message depending on the error code.
- Class `ErrorMessageDemo`: demonstrates how the method handles both valid and invalid codes.

2.**Package:** `return_of_a_class_object`
- Class `ErrorForMessage`: represents an error with two fields (`errorMessage`, `severity`).
- Class `ErrorInformation`: returns an object of `ErrorForMessage`.
- Class `ErrorInfoDemo`: shows usage with different error codes.

## Technologies

- **Java SE** (version 17)

## Installation and Running

1. Clone the perository:
   
```bash
git clone https://github.com/YuliyaZimenina/Returing_an_Object_Through_a_Method.git
```

2. Open the project in your favorite IDE (Eclipse, IntelliJ IDEA, etc.) or go to the project folder:

```
cd Returing_an_Object_Through_a_Method
```
3. Make sure **Java 17** is set as the project SDK
4. Compile all classes or run demo-classes (`ErrorInfoDemo.java` or `ErrorMessageDemo.java`) in your IDE or command line.

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Code Example

```java
// Returning an object of type String
public class ErrorMessage {
    String [] message = {
      "Output Error",
      "Input Error",
      "The disk is full",
      "The index has gone out of bounds."
    };

    // Method returning error message
    String getErrorMessage(int i){
        if (i >= 0 & i < message.length ) return message[i];
        else return "Non-existing error code";
    }
}
```

## Screenshots

1. Result of the class `ErrorMessageDemo`:

<img src="images/Output%20ErrorMessageDemo.png" alt="Output ErrorMessageDemo.java" width="450"/>

2. Result of the class `ErrorInfoDemo`:

<img src="images/Output%20ErroInfoDemo.png" alt="Output ErrorInfoDemo.java" width="450"/>
