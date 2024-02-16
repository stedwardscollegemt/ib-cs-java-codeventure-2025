# Iteration

## 4.1 Introduction

Allows us to instruct the computer to carry out a task over, and over again by repeating a small body (encapsulated in {}) of code. The programming structure that is used to control this repetition is often called a loop.

## IB Learning Outcomes

- 4.1.8 Deduce logical rules for real-world situations
- 4.3.7 Define the operators =, ≠, <, <=, >, >=, mod, div
- 4.3.9 Construct algorithms using loops and branching.

## 4.2 For Loop

If we wish to repeat a section of code a fixed number of times (five in the example above) we would use Java’s for loop. 

```java
int rep = 5; // number of repetitions

for(int i = 1; i <= rep; i++) {
    // instruction (s) to be repeated go here
}
```

An easy way to look at `for` loops is climbing up or down the stairs. 

## 4.3 While Loop

Sometimes, repetition which is not fixed is required. In such cases a for loop is not very useful. However, the `while` loop offers non-fixed iteration.

```java
while(/* test goes here */) {
    // instruction (s) to be repeated go here
}
```

The test that you create is a `boolean` expression in Java which we have learned about in Chapter 3. The simplest example one could thing of is a game - you keep playing until all your lives are lost. It is impossible to tell when exactly that will happen. 

```java
int lives = 9;

while(lives > 0) {
    // keep playing
}
```
