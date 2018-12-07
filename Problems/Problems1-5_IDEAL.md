# IDEAL for Leetcode Problems

I: Re-state the problem with your own words
D: Define your goals; state the format of your solution
E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
L: Reflect on the whole problem-solving process you went though, and state what you learned

## Problem 1:
  - I: You are given two linked lists with two non-negative integers in reverse and each node contains a digit. Add the two lists together and return the sum as a linked list.
  - D: Figure out exactly how this problem can be approached. How can I find a clean and efficient way to track the addition of the nodes? Can we have more than one digit in a node? Is the sum supposed to only be in one or spread out?
  - E, A: Step 1 - I started by initializing the ListNode class and creating a base node for a list. I then created a method passing the two lists and started to pass the values through a while loop.
        Step 2 - While passing, I realized that the lists had to go one node at a time and not whole.
        Step 3 - I changed my code to continuously check for nulls and to add the integers of both together in a carry variable.
        Step 4 - I then used a new list I had created to store the sum in the nodes but made sure that each individual node occupied only one integer value.
        Step 5 - Each node then occupied the one integer by doing (carry mod 10) and then reseting the carry to go through the rest of the lists.
        Step 6 - Tried lists of length 2, 3, 4. All worked well.
        Step 7 - Used one list that was null. Crashed.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.

## Problem 2:
  - I: Given a string with any sequence of characters, find the length of the longest substring without any repeats in it.
  - D: Figure out exactly how this problem can be approached. How many base cases must I have to check for blanks or duplicates? Are all the characters supposed to be unique? What is considered a substring in this case?
  - E, A: Step 1 - I knew that I had to use a simple structure for this problem. I found that arrays would be best utilized for my apporach.
        Step 2 - I created a dictionary for the sequences and wanted to do ASCII encoding to make conversions easier. Found out that ASCII is a better way to apporach rather than using input or Scanner.
        Step 3 - I once again utilized a while loop to always make sure a temporary variable was less of the array of characters everytime 1 got added to the temp. I also added each character in the array to the dictionary to count the sequences and length as well.
        Step 4 - I then used a nested while loop to add each character in the array to the dictionary to count the sequences and length as well.
        Step 5 - I then used the maximum value method of the Math library to set the highest length to a result variable.
        Step 6 - Used different sequences with and without repeats. Worked well.
        Step 7 - Used blank spaces in several test cases. Didn't work as efficient.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
 
## Problem 3:
  - I: Create your version of the atoi program, which converts strings to integers. 
  - D: Figure out exactly how this problem can be approached. How long till the conversion is supposed to begin? Do special characters stop the conversion? Can numbers be mixed in with wordsm such as tr33 or w0rd5?
  - E, A: Step 1 - I first researched what atoi was and what it meant.
        Step 2 - I then saw how the problem asked to check each individual character and the special flags that need to be checked for and went to start coding that.
        Step 3 - I checked for the flags or any other case, and added it to a variable i. This will be used to see how many characters it takes to get to the first numerical value. 
        Step 4 - I then checked in a while loop if this is less than the string length, and that number is within 0 to 9 range. If so, then this gets converted to a integer stored in a double variable.
        Step 5 - I then checked for negatives. If a certain sign was seen, that number became a negative or stayed positive.
        Step 6 - Used different string lengths with words and numbers implemented. Worked extremely fast.
        Step 7 - Used many blank spaces and mixtures of numbers and words together. Worked to return no value.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.

## Problem 4:
  - I: You are given an integer value within the range of 1 to 3999. Your task is to convert the integer to a roman numeral.
  - D: Figure out exactly how this problem can be approached. Is it easier to automatically assign the numerical values to the roman numerals or take user input? Can we assume the libraries for strings and arrays are given? Which loop will fit better for the code?
  - E, A: Step 1 - User input in this case would not be the best as it would take much longer to read and convert each integer to its respective roman numeral.
        Step 2 - I then proceeded to implement two arrays. An integer array that hosts all the roman numeral values, and a string array that hosts the roman numeral strings.
        Step 3 - I knew of the StringBuilder class being the best way to build integers into strings from previous usage in labs from earlier courses. 
        Step 4 - I then traversed through the values array and utilized a while loop to make sure that the number being converted is greater than the values in the array.
        Step 5 - I then subtracted that value from the number being converted, all while popping the respective roman numerals that amke up that integer.
        Step 6 - Tried with different number lengths. Worked well.
        Step 7 - Tried with longer numbers than usual, took longer and would crash.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.

## Problem 5:
  - I: You are given a grid of size m x n, that has no negative numbers. Your task is to find a path from the top left corner to the bottom right corner that minimizes the sum along the path. You can only move down or to the right. 
  - D: Figure out exactly how this problem can be approached. Can we user input for the grid? Would it be helpful to trace before coding? How would we keep track of each sum; is it required to replace each element we choose with that sum?
  - E, A: Step 1 - We had done this problem in class so I knew how to apporach it.
        Step 2 - I implemented the row and column values and checked that if 0 is the length, return that value as an empty grid. 
        Step 3 - I needed to make sure that the two directions we can only move to are added. I utilized for loops to add the right and down neighbors to the first corner we start at. 
        Step 4 - Then i traversed the grid and continued to add the elements.
        Step 5 - Once added, I found the smallest sum path and followed that index. Once the whole grid is checked, I return the smallest sum.
        Step 6 - I used different sized grids with different integers. Worked fine.
        Step 7 - Used empty elements. Crashed.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
