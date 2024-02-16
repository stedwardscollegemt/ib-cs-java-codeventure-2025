# Practical Applications of Arrays

## IB Learning Outcomes

- 5.1.4 Describe the characteristics of a two-dimensional array.
- 5.1.5 Construct algorithms using two-dimensional arrays.

## 6.9 Multi-Dimensional Arrays

A multi-dimensional array is an array that stores arrays enabling us to organise
data at different *levels*. The number of levels we create indicate the number of dimensions so to speak. For example, an array with two levels is a two-dimensional array. This can be visually represented as a table, where the first level would represent a row, and the second level would represent a column. 

You might feel that this is unneccessarily complicated because we can always create logical separations within a one-dimensional array, but on the contrary, two-dimensional arrays are particularly useful in several scenarios.

For example, consider a simple mathematical matrix of numbers. The following picture illustrates how this could look like in a one-dimensional array, and how
it could be transformed into a two-dimensional array.

![Alt text](https://codeforwin.org/wp-content/uploads/2017/10/two-dimensional-array-in-memory.png)

### Creating a Two-Dimensional Array

You will find that adding dimensions, indicated by `[]`, to your arrays is not difficult at all. Just remember to specify the size of each dimension in the `[]`. For example, a two-dimensional array needs a row size and a column size. Here is an example of a two-dimensional `int` array called `matrix` that is meant to have 4 rows and 3 columns.

```java
int[][] matrix = new int[4][3];
```
### Accessing Two-Dimensional Arrays

Every slot in the two-dimensional array is identified by a combination of row and column indices. Always remember that in Java, the first index is 0 for any dimension.

Example of assigning the value 10 to the first row and column in our `matrix`:

```java
matrix[0][0] = 10; // first row, first column
```
Example of assigning the value 10 to the first row and second column in our `matrix`:

```java
matrix[0][1] = 20; // first row, second column
```

Example of assigning the value 10 to the first row and second column in our `matrix`:

```java
matrix[2][2] = 90; // third row, third column
```

However, if you would like to create a two-dimensional array with a preset of values, this is how you should do it.

```java
// four rows, three columns
int[][] matrix = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {100, 110, 120} }; 
```

### Processing Two-Dimensional Arrays

As I probably said a lot in class, arrays love `for` loops. To navigate through
a two-dimensional array we can use two nested `for` loops, basically a `for` loop for every dimension.

For example, let us print out each element in our `matrix`:

```java
for (int row = 0; row < 4; row++) {
    for (int col = 0; col < 3; col++) {
        System.out.print(matrix[row][col] + ", ")
    }
    System.out.println("");
}
```

### Determining Dimension Size Using Array.length

When we used one-dimensional arrays and we did not know the exact size, we could use the `length` property. Recall:

```java
int size = myArray.length;
```


