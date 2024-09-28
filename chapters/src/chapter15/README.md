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

- D.4.7 Identify the features of the abstract data type (ADT) list.
- D.4.8 Describe applications of lists.
- D.4.10 Construct list algorithms using object references.
- D.4.11 Construct algorithms using the standard library collections included in JETS.
- D.4.13 Explain the advantages of using library collections. 

## 15.2 The ArrayList Collection

An `ArrayList` is a type of collection which can process an *ordered list* of objects. Such a collection may contain duplicates. Examples may include a series of `PrintJob` waiting for a printer on a first-come-first-served basis, `EmergencyCall` waiting for an ambulance on a priority basis, and the names of `Player` objects that have won the Wimbledon tennis tournament over the last 10 years ordered by year. In each case ordering is important, and repetition may also be required. We often think of this kind of collection as a *sequence of objects*.

### 15.2.1 Creating an ArrayList Collection Object

In our example, we are creating an *ordered list* of `Fruit` in `MyFruitBag`. The `MyFruitBag` class has a `static` attribute called `myFruitCollection` which is an `ArrayList` instance. Inside the `ArrayList` we are storing instances of `Fruit`. When we create an `ArrayList` object we have to specify what *class* of objects we would be storing inside the `<>`.

```java
    static ArrayList<Fruit> myFruitCollection = new ArrayList<Fruit>();
```