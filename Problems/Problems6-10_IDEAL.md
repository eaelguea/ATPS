## IDEAL for Leetcode Problems

- I: Re-state the problem with your own words
- D: Define your goals; state the format of your solution
- E, A: Use Duke’s 7 steps and include a description on how you broke the problem into sub-problems.
- L: Reflect on the whole problem-solving process you went though, and state what you learned

# Problem 6:
  - I: A string is displayed in a zigzag formation. Write a program that reads the string in the formation and creates a string depending on the number of rows. 
  - D: Figure out exactly how this problem can be approached. Does drawing out the problem make it more easier to understand? How many rows till it crashes? Can there be zero rows? Can we assume we have all libraries?
  - E, A: Step 1 - I wanted to attempt this problem because it seemed easier to do. I went and drawed out an example and tried to see how I can read these letters.
        Step 2 - I started out with a base case. If theres only one row, the string that is the statement should be returned.
        Step 3 - I then increased the row size so we are able to go through each row with letters. 
        Step 4 - The StringBuilder class then utilizes append to pull out each letter into a stack based on the row and position.
        Step 5 - Then once each letter is pulled into the stack, the full string is then returned with all letters in the rows combined.
        Step 6 - Tried with different rows and statements. Worked fine.
        Step 7 - Used zero rows and returned no string. Wasn't sure if that was correct.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
# Problem 7:
  - I: Given two integers n and k, return all possible combinations of k numbers out of the 1 to n range.
  - D: Figure out exactly how this problem can be approached. Lists have to be used, but how? Can we place everything in at once?
  - E, A: Step 1 - Create a new list that will store combinations of the two numbers.
        Step 2 - I then added an array linked list that will have the k combinations stored.
        Step 3 - I then got the size of the resulting list. This represents the full amount of combinations that can happen.
        Step 4 - In the nested for loops, each possible combination is grabbed from the array list, and then check its size and makes sure it corresponds to the k integer.
        Step 5 - After each is checked by size and made sure each is grabbed, it is then placed into the reuslting list.
        Step 6 - Tried with different integers. Worked well.
        Step 7 - Used a zero for k. Crashed.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
# Problem 8:
  - I: Given an integer of pairs, create a program that generates all combinations of parentheses.
  - D: Figure out exactly how this problem can be approached. 
  - E, A: Step 1 - Recursion could be used here and i didn't trust my ability to do one single method.
        Step 2 - I created a void method that takes a list, the parentheses, and three integers that will be utilized for the combinations.
        Step 3 - I doubled the size and checked if the length is equal to it, then add each string combination created and return that list. This is done after the recursion.
        Step 4 - The first recursion checks if the number of open parentheses is less than n, we add these parentheses every time the sequence us valid.
        Step 5 - The above checks apply also to the closed parentheses.
        Step 6 - Tried with 0-10 for n. Worked well.
        Step 7 - The bigger n, the longer the program takes.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
# Problem 9:
  - I: Given two integers, x which is a double value, and n a power, implement your version of the pow(x, n) method.
  - D: Figure out exactly how this problem can be approached.
  - E, A: Step 1 - There are two methods that have to deal with power: negative powers and positive powers. I wanted to used both and see where it would go.
        Step 2 - I created the positive power method to do a basic check: if the power n is 0, return 1. In any other case, multiply the x value by x up until 0 is reached in n.
        Step 3 - I tried with smaller instances first and saw that it worked and speed corresponded to the larger n values.
        Step 4 - Negatives needed to be utilized. I created the main power method that will check if the power is less than zero (negative) and will turn the x value into a fraction and the power into a negative.
        Step 5 - This will start off negative then will go into positives. After all powers are calculated, the value is returned.
        Step 6 - Tried in a range from -5 to 5. Worked well.
        Step 7 - Tried large numbers: 10, 20. Program crashed due to long times taken. May have been able to make it more efficient.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
  
# Problem 10:
  - I: Sort a linked list using insertion sort.
  - D: Figure out exactly how this problem can be approached.
  - E, A: Step 1 - I have done this problem before and have it saved from an in-class exercise in a previous course so I wanted to refresh.
        Step 2 - Do the main base case to see if the head of the list and the next element are null. If so, return the list.
        Step 3 - Create a new list that will be the place to store the sorted list. While loop will have to be used to continuously check and place elements.
        Step 4 - Separate the lst to a current placement and previous placement and check the values to sort in the order of least to greatest.
        Step 5 - Once sorted, create a next node to end the sorting. Return the new list.
        Step 6 - Tried with different sized lists. Worked efficiently.
        Step 7 - Checked program crashes with nulls. Does crash.
  - L: I was able to break down the problem and I learned that breaking it down and solving bit by bit can benefit to creating great code.
