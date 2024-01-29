# Classes and Objects

All activity in Java happens within a class so technically we have been making use of them since the very beginning. Just, thus far, our classes have been really simple and we adopted a more imperative style approach. To explain, we have been using classes to just organise our code.

It is finally time to really get into Object-Oriented Programming, and discover the features that make Java so popular amongst back-end developers. 

# IB Learning Outcomes

- D.1.1 Outline the general nature of an object.
- D.1.2 Distinguish between an object instance and a class.
- D.3.4 Describe the use of primitive data types and the reference class string.
- D.3.8 Construct code related to arrays.
  
## 7.2 Classes as Data Types

So far you have been using data types such as `char`, `int` and `double`. These are *primitive* data types that hold a single piece of information. Java allows us to create our own data types based on these. Think for exampleof a... 

- `Book` which might have a title, an author, an ISBN number and a price.
- `Student` which might have a name, a student id and marks for various subjects.

Built-in types like `char` and `int` can only hold a single piece of information only, therefore, completely inadequate for holding all the necessary information
about a complex real-world entity like `Book` or a `Student`. So far, we have used the parallel arrays technique to get around this issue. In this Chapter, we will create our own types that can store many pieces of data.

The choice of data type for our data times depends on the nature of the data and the operations that need to be performed on it. As we have learned in Chapter 2, data types help programmers use memory efficiently. Different types have different ranges of values or precision. Having types makes our class more readable e.g., we know that `price` stores a real number and so, can be manipulated using arithmetic operators.

## 7.3 Objects

We have covered the broad definition of an object in Topic 4. Here is a snippet to refresh your memory.

![image](https://github.com/stedwardscollegemt/ib-cs-java-codeventure-2025/assets/14978900/ba575655-8119-435d-bd95-783b9d6b5cf2)

However, in Java, you need to understand two fundamental facts:

- A `class` is a template that defines the form of an object in terms of data and behaviour.
- An object is a particular instance of a class that has a unique memory reference, unique data values, and makes use of its behaviour to change state during program execution.

>[!IMPORTANT]
>The class is a *logical abstraction* and does not really take memory space during program execution. It is only until instances have been created (as concrete representations) that we start to consume memory. 

We will learn that classes contain variables, also known as object properties, and methods, which we sometimes refer to as behaviour. 

*This links with CCS pages 292 - 294, D.1.2 Distinguishing between object and instantiation.*

## 7.4 Defining your first class

A class is created by using the keyword `class`. As we have seen previously it is very possible to create classes with just methods. Similarly, it is technically possible to just create classes that contain only variables. However, we generally create objects that model real world objects and processes so it is very common to define classes that contain both variables and methods.

```java
public class Soldier {
    // declare variables
    public int health;

    // declare methods
    public void reduceHealth() {
        this.health = this.health - 1;
    }
}
```

In previous lessons we have designed an entity for *Soldier*, and today we are going to translate it into a class in Java. It will store information about its health, minor profile details, inventory of weapons and keep track of the current weapon being used by the character.

## 7.5 Create your first object *instance*

In Java, anything that is not a primitive data type is an object therefore without really appreciating it perhaps, we already gained some experiencing creating physical objects when dealing with arrays.

```java
// from lesson 07
int[] myNumbers = new int[100];
```

I would like to make special attention to the `new` keyword as it is common in any object you create. The `new` operator allocates memory for an object and returns a reference to it during run-time.

Let's look at the creation of a `Soldier` instance as an example, the following resides in <b>SoldierFactory.java</b>:

```java
Soldier jack = new Soldier(); // declare and create physical instance of Soldier
```

The above declaration does two things:
1. Declares a variable called *jack* of the type *Soldier*
2. Creates a physical copy of the object and assigns a unique reference to *jack*

To really showcase the above, we could have rewritten the statement above to show the steps individually:

```java
Solder jack;
jack = new Soldier();
```
## Assigning values to properties and calling object methods

After you created a physical copy of a class, then you should have access to properties and make use of them in your program. For example assigning a value to a property:

```java
jack.name = "Jack"; // assigning a value to a property
```

However as already mentioned in previous lessons it is a very good idea to use object methods to change properties e.g.

```java
jack.reduceHealth();
System.out.println(jack.health); // should print out 3
```

But don't worry too much about this point because we will be diving into OOP slowly. For now, we want to get comfortable with the basics.

## 7.6 Strings

Java treats a data like `"Ms. Camilleri"` which we refer to as <b>text</b> as an object that is composed of a sequence of characters or bytes (recall that a single ASCII character can be represented in a byte which is 8 bits exactly). 

For textual data, Java offers a powerful utility `String` class. Technically, to store a *blank* piece of textual data in memory then you need to instasiate a `new` object like so:

```java
String myName = new String(); // very similar to our soldier example
```

## 7.10 Arrays of Objects

In Chap. 6 you learnt how to create arrays of simple types such as ``int` and `char`. We have even created arrays of the reference type `String`. Even though it feels like `String` is a built-in data type, it is actually an object. The creators of the Java language went out of their way to make it easy for us to create and use these variables, but make no mistake, a `String` is indeed an object. As you create your own data types, then you also are empowered to create arrays of objects. 

```java
Book myLibrary = new Book[50];
```

Be aware that this line of code does not create fifty `Book` instances, but, it reserves fifty *unique memory references*. You can think of these unique memory references as empty slots that could eventally store all of your `Book` objects. 

The good news is that assigning array values is not difficult, and you will find that it is similar to what we have done before.

```java
   // creating a Book instance to store in the array	
   myLibrary[0] = new Book();

	// an alternative to the above
	Book myBook = new Book();
	myLibrary[1] = myBook;
```

Now, `myLibrary[1]` can be treated as an object variable. Anything you have done with `int` arrays e.g., searching algorithms, minimum, maximum, etc., can be done with object arrays. 

## General Pro Tips

- A class should represent *one* logical entity.
- Object classes do not normally declare the `main()` method, therefore, always have a separate class to declare the entry point of your program.
- Have another class to manage the creation of object instances and at this stage this will likely be the class that has the `main()` defined but not necessary.
