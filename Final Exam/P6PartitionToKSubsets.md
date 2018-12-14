# Partition to K Equal Subsets
## Step 1
  - Define the problem
    - Given an array of integers A, and a positive integer k, determine if its possible to separate A into k subsets with equal sums. 
    Note: these subsets can't be empty.
  - Define solution (recursively)
    - For this problem, we can solve this using recursion and dynamic programming. We keep an array dp for sum of each 
    partition and a boolean array ans to check whether an element is already taken into some partition or not. First we need  
    check some base cases, if k is equal 1, then we already have our answer: the complete array is only one subset with the   
    same sum. If A < k, then it is not possible to divide the array into subsets with equal sums due to the division being 
    more than A parts. If the sum of the array is not divisible by k, then it is not possible to divide the array into k 
    subsets. We proceed only if k divides the sum. Our goal is to try and reduce and divide the array into k parts where the 
    sum of each part should be sum/k.
## Step 2
  - 
