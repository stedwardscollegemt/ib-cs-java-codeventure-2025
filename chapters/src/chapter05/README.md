# Methods

A method is a block of code that is run every time it is called.

## IB Learning Outcomes

- 4.1.1 Able to identify a suitable procedure in an attempt to solve a very simple problem.
- 4.1.2 Able to evaluate whether the order of steps makes a difference.
- 4.1.3 Able to explain the role of sub procedures in solving a large problem.

## Introduction 

We have already started defining methods to be quite frank with you, you just did not know it (sorry).
Every time we create a new file in Java, you always defined the  `main()` which is a very special method because it defines the main entry point of your program. We can specify other methods that can act like neat drawers to store our code, so that we can "open" them and "close" them whenever we deem it is necessary.

### A closer look at the main()

```java
public static void main(String[] args) {
    // code written during the lesson
}
```
<b>The Anatomy of a Method:</b>

- <b>Header:</b> the first four words followed by parenthesis
- <b>Body:</b> the two curly brackets and its contents

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

To make use of methods, you can *call* it in another place in your code.

```java
public class MathPal {
    public static void main(String[] args) {
        // this is a method call
        int result = add(5, 2);
        System.out.println("Result: " + result);
    }
}
```
