
# Merge Even Numbers and Print in Reverse

## Overview
This Java program takes two arrays as input, extracts even numbers from both, merges them into a new array, and prints the merged array in reverse order. It demonstrates concepts such as array manipulation, filtering even numbers, and reversing an array.

## Features
- Accepts two arrays as input from the user.
- Extracts only even numbers from both arrays.
- Merges the extracted even numbers into a new array.
- Prints the merged array in reverse order.

## How It Works

1. **User Input:** The program first takes the size and elements of two arrays from the user.
2. **Counting Even Numbers:** It determines how many even numbers exist in each array.
3. **Filtering Even Numbers:** A helper function `isEven()` extracts the even numbers into separate arrays.
4. **Merging Arrays:** The filtered even numbers are merged into a new array.
5. **Reversing Output:** The merged array is printed in reverse order.

---
## Code Breakdown

### **1. Taking User Input**
The program starts by accepting two arrays from the user using the `Scanner` class.

```java
Scanner s = new Scanner(System.in);
System.out.println("Enter 1st Array Size");
int size1 = s.nextInt();
int arr1[] = new int[size1];
System.out.println("Enter 1st Array Elements");
for(int i=0; i < arr1.length; i++) {
    arr1[i] = s.nextInt();
}
```
**Explanation:**
- The user enters the size of the first array (`size1`).
- The program initializes an array `arr1` with the given size.
- A `for` loop iterates over `arr1.length` and takes input values from the user.
- The same process is repeated for the second array `arr2`.

### **2. Counting Even Numbers**
The program counts even numbers in both arrays.

```java
int count1 = 0;
for(int i=0; i < arr1.length; i++) {
    if(arr1[i] % 2 == 0)
        count1++;
}
```

**Explanation:**
- The loop runs through each element in `arr1`.
- The condition `arr1[i] % 2 == 0` checks if the number is even.
- If true, `count1` is incremented.
- This count is later used to allocate space for even numbers.
- The same process is repeated for `arr2` to get `count2`.

### **3. Filtering Even Numbers Using `isEven()`**
This function extracts even numbers from an array and returns a new array.

```java
public static int[] isEven(int a[], int count) {
    int index = 0;
    int arr[] = new int[count];
    for(int i=0; i < a.length; i++) {
        if(a[i] % 2 == 0)
            arr[index++] = a[i];
    }
    return arr;
}
```

**Explanation:**
- A new array `arr` of size `count` is created to store even numbers.
- The `for` loop iterates over the input array `a[]`.
- If `a[i]` is even, it is added to `arr` at position `index`, which is incremented each time an even number is found.
- The function returns the new array containing only even numbers.

### **4. Merging Even Numbers**
```java
int newArr[] = new int[count1 + count2];
int a[] = isEven(arr1, count1);
int b[] = isEven(arr2, count2);
for(int i=0; i < newArr.length; i++) {
    if(i < a.length)
        newArr[i] = a[i];
    else
        newArr[i] = b[i - a.length];
}
```

**Explanation:**
- `newArr` is created with a size equal to the sum of even numbers from both arrays.
- `isEven()` is called for `arr1` and `arr2` to get arrays `a` and `b` containing only even numbers.
- A `for` loop merges these two arrays:
  - If `i` is within the length of `a`, its value is copied to `newArr[i]`.
  - Otherwise, elements from `b` are added using `b[i - a.length]` to ensure correct indexing.

### **5. Printing the Merged Array in Reverse**
```java
for(int i = newArr.length - 1; i >= 0; i--) {
    System.out.print(newArr[i] + ",");
}
```
**Explanation:**
- This `for` loop starts from the last index (`newArr.length - 1`) and decrements to `0`.
- Each value is printed in reverse order.

---
## Example Run
### **Input:**
```
Enter 1st Array Size
5
Enter 1st Array Elements
1 2 3 4 5
Enter 2nd Array Size
4
Enter 2nd Array Elements
6 7 8 9
```
### **Processing:**
- Even numbers from `arr1`: **[2, 4]**
- Even numbers from `arr2`: **[6, 8]**
- Merged array: **[2, 4, 6, 8]**
- Reversed output: **8, 6, 4, 2,**

### **Output:**
```
8,6,4,2,
```

---
## Key Learnings
- **For Loops:** Used for iterating over arrays for input, filtering, merging, and reversing.
- **Conditionals (`if` statements):** Used to check even numbers.
- **Method Creation (`isEven()`):** Helps modularize code for reusability.
- **Array Manipulation:** Filtering, merging, and reversing.

## Possible Enhancements
- Allow input of negative numbers and validate input.
- Implement sorting before reversing.
- Use an `ArrayList` instead of arrays for dynamic storage.

---
## Conclusion
This program provides a practical way to learn array operations and logical programming in Java. It demonstrates key concepts such as iteration, conditionals, modular functions, and data manipulation effectively. Beginners can expand on this by adding enhancements and optimizing performance.



## Clone
```
https://github.com/Ananthadatta02/Java-Array_Merging.git
```
