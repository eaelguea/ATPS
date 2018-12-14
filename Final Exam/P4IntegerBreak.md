# Integer Break
## Step 1
  - Define the problem
    - Given any positive integer n, break it apart to the sum of at least two positive integers and maximize the product of those integers.
    Then, return the maxed product you can get. Note: assume that n is not less than 2 or greater that 58.
  - Define solution (recursively)
    - For this problem, I wanted to not only utilize recursion, but find a much easier way to break apart an integer in the least amount of time. The dp array will be the place that stores the max product of those integers at the position of n. The array must then be the size of n+1 in order to store the maxed product in the index that matches n, i.e. n = 9, dp.length = 10. If n is 1, that maxed product is always 1. Then starting from the second and third elements, we must compare previous of both for the max value, multiply them, and store in the dp array at index i. You will then go back and got through every element of n until the max product is reached and stored in dp[i].
## Step 2
  - For a proposed solution, I would create one single integer method that uses n as a parameter. An integer array, dp will store the product values. The position dp[n] will store the final maxed product of n. An integer i will be used as an index indicator; this position dp[i] will store the new maxed product after every comparison.
