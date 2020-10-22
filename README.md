**Implementation of a solution to the following problem:**

Find the celebrity
In a team of N people, a celebrity is known by everyone but he/she doesn't know anybody

**Example 1**

Given an integer N and a matrix of size N x N, where each row represents
 whether or not a person i knows a person j:

```
N = 4
[[0,0,1,0],
 [0,0,1,0],
 [0,0,0,0],
 [0,0,1,0]]
```

the expected output should be 2, as the person in the row 2 doesn't know anybody 
and is known by everyone. 

**Example 2**

Given an integer N and a matrix of size N x N, where each row represents
 whether or not a person i knows a person j:

```
N = 4
[[0,0,1,0],
 [0,0,1,0],
 [0,1,0,0],
 [0,0,1,0]]
```

the expected output should be -1, as the person in the row 2 is known by everyone 
but knows the person in row 1. 

