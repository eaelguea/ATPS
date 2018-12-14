# Perfect Squares
## Step 1
  - Define the problem
    - Given any positive integer n, find the least amount of perfect squares such as 1, 4, 9, 16, 25, etc. that adds up to the integer n.
  - Define solution (recursively)
    - For this problem, I wanted to not only utilize recursion, but find a much easier way to determine the squares to be
    used. By using dynamic programming, we must first initialize the dp array to the size of n+1; this will allow us to store
    the amount of squares in position dp[n]. Starting from the second position in the dp array, we store each amount of
    squares it takes to get the given n. This value is stored in dp[i], with i representing the integer n. Once all numbers up
    to n are checked, dp[n] must be returned as it has the overall minimum of all subproblems.   
## Step 2
  - For a proposed solution, I would create one single method with n as a parameter. A dp integer array will be where i store
  the minimum number of squares everytime we check a number from 0 to n. After every subproblem of finding the min number of
  squares for each number up to n, we compare and combine each and once the max is found using Math.min, we store i in dp[n]
  which represents the number of squares for the given n.
