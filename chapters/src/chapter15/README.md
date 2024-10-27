# The Java Collections Framework

We have created interesting programs with the array being a versatile type in Java but it still has a few restrictions:
- once an array is created it must be sized, and this size is fixed;
- it contains no useful pre-defined methods e.g., "contains", or "sort".

In fact, we had to create a separate class `ArrayHelper.java` and write the tests for each and every useful function we could think of!

No doubt you have been wondering "what if we run out of space in our array?" and that is a good question.

Java developers have prepared for us a group of generic <b>collection</b> classes. We have covered the concept of a collection in Topic 4.

<img src="https://raw.githubusercontent.com/stedwardscollegemt/ib-cs-java-codeventure-2025/main/chapters/img/topic_4_slides_item_collection.png"/>

Collections are objects that manage a group of similar elements, meaning that they provide a way to add/remove elements as needed without committing to a fixed size. Moreover, they often come with a lot of useful functions. This group of collection classes are referred to as the Java Collections Framework (JCF). These collection classes are organized around several "contracts" that define different types of behaviour that we might be interested in incorporating into our programs.

For IB you simply need to be aware of:
- `ArrayList`

# IB Learning Outcomes

- 4.1.18 Explain why abstraction is required in the derivation of computational solutions for a specified situation.
- 4.2.2 Outline the standard operations on a collection.
- 4.3.11 Construct algorithms using the access methods of a collection.
- D.4.11 Construct algorithms using the standard library collections.

## 15.2 The ArrayList Collection

An `ArrayList` is a type of collection which can process an *ordered list* of objects. Such a collection may contain duplicates. Examples may include a series of `PrintJob` waiting for a printer on a first-come-first-served basis, `EmergencyCall` waiting for an ambulance on a priority basis, and the names of `Player` objects that have won the Wimbledon tennis tournament over the last 10 years ordered by year. In each case ordering is important, and repetition may also be required. We often think of this kind of collection as a *sequence of objects*.

### 15.2.1 Creating an ArrayList Collection Object

In our example, we are creating an *ordered list* of `Fruit` in `MyFruitBag`. The `MyFruitBag` class has a `static` attribute called `myFruitCollection` which is an `ArrayList` instance. Inside the `ArrayList` we are storing instances of `Fruit`. When we create an `ArrayList` object we have to specify what *class* of objects we would be storing inside the `<>`. This is known as a form of *generics* which is an abstraction mechanism that enables any class to be stored in a list. For example, we might want to use an `ArrayList` to store `Recipe` objects... does this ring a bell?

```java
static ArrayList<Fruit> myFruitCollection = new ArrayList<Fruit>();
```

All classes in the JCF are in the `java.util package`, so to use the `ArrayList` class we require the following import statement at the very top:

```java
import java.util.ArrayList; 
```

## 15.2.3 List Methods

The `ArrayList` is an implementation of a `List` contract that was designed by Java developers. We call these contracts *interfaces*. An interface defines how something should behave to process data in a standard way. It abstracts out the complexity of <b>how</b> something is done. The most important thing for us to know is <b>what</b> can be done.

An `ArrayList<Object>` can:
 
- `add(Object)` or `remove(Object)`
- check if it `isEmpty()`
- check if it `contains(Object)`
- determine its `size()`

## 15.5.3 Iterator Objects

Java developers decided to treat traversal separately in an `Iterator` object which exposes standard operations to retrieve items in a sequential manner. All collection instances have a way for you to use this object. The `ArrayList` is no exception:

```java
Iterator<Fruit> iteratorObj = myFruitCollection.iterator();
```

An `Iterator<Object>` can:
- check if a list `hasNext()` item in the sequence
- get the `next()` item in the sequence

Once an `Iterator` object has been created, a while loop can be used to iterate through the collection, with the `hasNext` method the test of the loop. The body of the loop can then retrieve items with the `next` method:

```java
// Example of going through a collection and put items in an array
Fruit[] myFruitArray = new Fruit[myFruitCollection.size()];
Iterator<Fruit> iterator = myFruitCollection.iterator();
int count = 0;
// hasNext is a standard operation in a collection
while(iterator.hasNext()) {
    // next is a standard operation in a collection
    Fruit nextFruit = iterator.next();
    myFruitArray[count] = nextFruit;
    count = count + 1;
}
```





