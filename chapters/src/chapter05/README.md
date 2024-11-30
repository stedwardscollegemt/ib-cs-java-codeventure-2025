# Methods

A method is a block of code that is run every time it is called. Since a method is a block of code, then it can contain all basic elements of an algorithm: input, process and output. Neatly stowing an algorithm in a method will allow us to reuse code. Java allows multiple method configurations to cater for all kinds of algorithms. Methods are powerful abstraction tools.

## IB Learning Outcomes

- 4.1.1 Able to identify a suitable procedure in an attempt to solve a very simple problem.
- 4.1.2 Able to evaluate whether the order of steps makes a difference.
- 4.1.3 Able to explain the role of sub procedures in solving a large problem.

## Introduction 

We have already started defining methods to be quite frank with you, you just did not know it (sorry). Every time we create a new file in Java, you always defined the  `main()` which is a very special method because it defines the main entry point of your program. We can specify other methods that can act like neat drawers to store our code, so that we can "open" them and "close" them whenever we deem it is necessary.

### A closer look at the main()

```java
public static void main(String[] args) {
    // code written during the lesson
}
```
<b>The Anatomy of a Method:</b>

- <b>Header:</b> the first four words followed by parenthesis
- <b>Body:</b> the two curly brackets, the scope, and its contents

The header of the method acts as a *method signature* suggesting that it should be unique within the program. 

### Keyboard.readInt()

We have also been relying on methods written for us in the `Keyboard` class. In the example below we are calling `readInt()` which resides in the `Keyboard` class. It contains code that can accept user input and convert it into an integer.

```java
int age = Keyboard.readInt();
```

## 5.2 Declaring and Defining Methods

Here is an example of a custom method, which is not the `main()` inside a class called `MathPal`. Look at the method `add`.

```java
public class MathPal {
    
    public static void main(String[] args) {
        // code to call method add here
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
```

## 5.3 Calling a Method

To make use of methods, you can *call* it in another place in your code.

```java
public class MathPal {
    
    public static void main(String[] args) {
        
        // this is a method call
        int result = add(5, 2);
        
        System.out.println("Result: " + result);
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
```

We should point out a method can call another method, formally referred to as method chaining. For example, in our example, the `add()` is being called within the `main()`. It is very important that the order of instruction exxecution is correct, so you should understand that when the execution reaches `add()`, the `main()` pauses; it is only when `add()` has finished that execution resumes to the `main()`. 

## 5.4 Method Input and Output

We have already told you that a method can have all components of an algorithm. It is probably clear to you that the body of the method contains most of the process. However, a method can accept multiple input variables in the form of *parameters* to be processed, and send *one* data item back as output, if you like.

We can look at the `add()` more closely to identify all these elements.

```java
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
```
- The *name* of the method is `add` and inside the `()` it accepts two `int` parameters as input. Parameters are simply temporary variables that are created to store the values inputted via a method call. In Java it is possible to define a method that does not accept parameters at all, e.g., `Keyboard.readInt()`. 
- Right before the name, is a data type which indicates what kind of data item is sent back. In this case, the output that is sent back should be treated as an `int`. In Java it is possible to define a method that does not sent anything back at all, but we must use the keyword `void` instead. 
- The `return` keyword in the body terminates the current process and leaves the method scope. Any method that sends back a value must have at least one `return` statement to stop the process and spit out a data item. 

## 5.5 Method Examples

An example without parameters and without a return value.

```java
    public static void displayError() {
        System.out.println("An error has occured, please try again.");
    }
```
An example without parameters and with a return value.

```java
    public static String getError() {
        String error = "An error has occured, please try again.";
        return error;
   }
```
An example with parameters and without a return value.

```java
    public static void displayErrorMessage(String messageIn) {
        System.out.println("An error has occured, " + messageIn);
   }
```

An example with parameters and with a return value.

```java
    public static String displayErrorMessage(String messageIn) {
        String errorMessage = "An error has occured, " + messageIn;
        return errorMessage;
   }
```

An example with multiple parameters and with a return value.

```java
    public static String displayErrorCodeMessage(int codeIn, String messageIn) {
        String errorCode = "Error[" + codeIn + "] ";
        String errorMessage = "An error has occured, " + messageIn;
        return errorCode + errorMessage; // any expression that is reduced to one item
    }
```
## 5.6 Variable Scope

In Java, the curly brackets ``{}`` define when a variable scope begins and ends. What is variable scope? Variable scope is how long a variable should live in our program. Some variables are important throughout our program, so their scope should be *global*, however, most of the time, variables are only needed for a small amount of time. 

```java
    public class MyProgram {

        // Here is the first pair of brackets. If we want variables to live throughout
        // the lifetime of our program we must declare them here as class variables:
        static int  myGlobalVariable = 3;

        public static void main(String[] args) {
            // So far we have always declared and used our variables within these curly brackets
            // The variables live when main begins, and die when main ends.
            int myLocalVariable = 5; 
            
            
            myGlobalVariable = myGlobalVariable + myLocalVariable; 
        }
    }
```

For Java to "see" variables they must be declared within a pair of curly brackets, and so, can only be used within them. When a program tries to use a variable out of scope,
you will get a compiler error. 

```java
    public class MyProgram {

        // Here is the first pair of brackets. If we want variables to live throughout
        // the lifetime of our program we must declare them here as class variables:
        static int  myGlobalVariable = 3;

        public static void main(String[] args) {
            // So far we have always declared and used our variables within these curly brackets
            // The variables live when main begins, and die when main ends.
            int myLocalVariable = 5;
            myGlobalVariable = myGlobalVariable + myLocalVariable; 
        }

        public static void displayVariableValues() {
            // this is ok
            System.out.println(myGlobalVariable); 
            // this gives an error because myLocalVariable is only visible within the main {}
            System.out.println(myLocalVariable); 
        }
    }
```

