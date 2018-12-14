# Minimum Falling Path Sum
## Step 1
  - Define the problem
    - Given a square sized array of integers, find the minimum sum of a falling path through the array. A falling path starts at any one of the first elements in row 1, chooses one, and moves to the next row. However, the next row's choice must be in a column that is different from the previous row's by at most 1.
  - Define solution (recursively)
    - For this problem, I wanted to not only utilize recursion, but find a much easier way to solve the large instance of the problem: finding the minimum sum of a falling path. Since there are subproblems to be solved, we can use those in a recursive manner to find the minimum sum. The minimum total weight is defined as dp(r, c); This starts at the first row and reaches the bottom, following the rules of choices. Then, we must add the element we are at in the square to that minimum in order to get the sum. We will then continue this process for each row. There are three possible cases: A[row + 1][column - 1], A [row + 1][column], and A[row + 1][column + 1]. These cases will be used to determine the minimum element and that will then be added to the position A[row][column] as this will be used to hold all the values.
## Step 2
  - 
