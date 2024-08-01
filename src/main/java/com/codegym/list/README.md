## List

The List interface extends the Collection
interface and defines a collection for
storing elements in a sequential order. To create
a list, use one of its two concrete
classes: ArrayList or LinkedList.

[Introduction to Java Programming-Y.Daniel.Liang-Chapter20](https://github.com/Nikhil-Vinay/E-Books/blob/master/Y.Daniel.Liang.-.Introduction.to.Java.Programming.Comprehensive.Version.10th.Edition.-.2014.pdf)

### Common Features of List:

A list is a popular data structure for storing
data in sequential order—for example, a list of
students, a list of available rooms, a list of
cities, a list of books. You can perform the
follow-ing operations on a list:

1. Retrieve an element from the list.

2. Insert a new element into the list.

3. Delete an element from the list.

4. Find out how many elements are in the list.

5. Determine whether an element is in the list.

6. Check whether the list is empty.

[Introduction to Java Programming-Y.Daniel.Liang-Chapter24](https://github.com/Nikhil-Vinay/E-Books/blob/master/Y.Daniel.Liang.-.Introduction.to.Java.Programming.Comprehensive.Version.10th.Edition.-.2014.pdf)

There is two ways to implement a list.

1. Using `Array`(Array size is fixed. If the
   capacity of the array is exceeded, you need to
   create a new,
   larger array and copy all the elements from the
   current array to the new array);
2. Using `Linked Structure`; A linked structure
   consists of nodes. Each node is
   dynamically created to hold an element. All the
   nodes are linked together to form a list
