# Retiring an Object through a Method

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
