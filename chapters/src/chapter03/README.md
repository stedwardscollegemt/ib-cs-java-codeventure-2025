# Selection

## IB Learning Outcomes

- 4.1.4 Identify when decision-making is required in a specified situation
- 4.1.5 Identify the decisions required for the solution to a specified problem

## 3.2 Making Choices

We want to write useful programs to express algorithms that can solve our problems. So far, we have simply written instructions that are executed one after the other. However, solving complex problems requires an element of **decision making** so naturally we want that to feature in our programs. This implies that the execution of a program can take one course or another depending on what we are doing. For instance, if we are assembling a burger perhaps we can *decide whether or not to include the current ingredient* in the assembly in order to cater for allergies. 

> A program that just executes instructions in sequence will behave in the same way. A program that can make choices can behave slightly differently each time it is run. 

We will look into a number of ways how we can incorporate decision making in our Java programs:

- An `if` statement
- An `if ... else` statement
- A nested `if` statement
- A `switch` statement  

## 3.3 The IF statement

```java
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
}
```

Here is an example from `AssembleHamburger.java`

```java
// Ask the user if they want to assemble a hamburger
System.out.println("Do you want to assemble a burger? (y/n)");
char response = input.next().charAt(0);

// 
if (response == 'y' || response == 'Y') {
    System.out.println("Great, let us help you build a delicious hamburger...");
}
```


## 3.4 The IF ... ELSE statement

```java
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that only get invoked when false
}
```

## 3.3.1, 3.5 Relational Comparisons & Boolean Logic Operators

We normally want the program to make decisions based on a combination of:

<ins>Arithmetic Comparison</ins>

- Equality `==`
- Less Than `<`
- Greater Than `>`
- Greater Than or Equal To `>=`
- Less Than or Equal To `<=`

<ins>Boolean Logic</ins>

- AND `&&`
- OR `||`
- NOT `!`

## 3.6 Nested IF ... ELSE statements

Java blocks of code take either in the form of one statement, or a number of statements that are within `{}`. You have been using various blocks already. For instance, `FlourCupsGramsConvert` had two blocks nested into each other.

The reality is that any code block can be within another code block, therefore, we can also have an `if...else` statement within another `if...else` statement. This is similar to what is in `Selection`.

```java
if (age >= 60) {
    // This code will run if and only if age is greater or equal to 60
    System.out.println("Enjoy your golden years!");
} else {
    if (age >= 21) {
        // This code will run if age is less than 60 AND age is greater or equal to 21
        System.out.println("You can drink and drive (not at the same time)!");
    }
}
```

Although the above could look considerably neater by perhaps doing...

```java
if (age >= 60) {
    // This code will run if and only if age is greater or equal to 60
    System.out.println("Enjoy your golden years!");
} else if (age >= 21) {
    // This code will run if age is less than 60 AND age is greater or equal to 21
    System.out.println("You can drink and drive (not at the same time)!");
}
```

## 3.7 The "Switch" Statement

There will be times when you would like to group a number of decision instructions related to a scenario that comes with multiple options. As an example, consider `LucasVendingMachine` which presents multiple purchasing options labelled from 1 - 9. In the case that the user selects option 1, the program must charge correctly for chips, however, other cases apply, e.g., option 8 which gives a profound opinion about life for free. A strange vending machine indeed. 

Of course we can use a series of `if...else if...else` statements like so:

```java
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please choose an item from the vending machine.");
    int number = input.nextInt();

    if (number == 1) {
        // TODO: charge for chips
    } else if (number == 2) {
        // TODO: charge for Coca-Cola but serve a Pepsi
    } else if (number == 3) {
        // TODO: charge for canned air
    } etc...
```

But in this scenario, it is more convenient and probably neater to do it this way:

```java
switch (number) {
    case 1: {
        // TODO: charge for chips;
        break;
    }
    case 2: {
        // TODO: charge for Coca-Cola but serve a Pepsi
        break;
    }
    case 3: {
        // TODO: charge for canned air
        break;
    }
    // TODO: cases 4 - 9
    default: {
        System.out.println("That's not a valid option, silly you!");
    }
}
```

A statement like this can be used when you want to check whether a variable is equal to one of a number of possible values. More complex Boolean expressions e.g., `number < 5` are not supported. The keyword `case` is in fact used to precede a single possible value. The `break` command in every case forces the program to ignore the remaining options, this is quite important. The last option is a `default` which can be thought of as "otherwise", or "if nothing matched". This is optional but I do recommend you using it to handle user errors gracefully as presented in the example above. 

