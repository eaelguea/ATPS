# Stone Game
## Step 1: 
  - Define the problem 
    - Alex and Lee are playing a game with piles of stones. There are even piles in a row and each pile has a postive number of stones. 
The object of the game is to end with the most stones. There will be no ties since the total number of stones is odd. Alex starts and they both then take turns.
Assuming they both play optimally, return TRUE if and only if Alex will win.
  - Define solution (Recursively)
    - For this problem, I wanted to not only utilize recursion, but find a much easier way to keep track of the total that each player has in order to determine a winner.
    Everytime Alex has a turn, which is at most 2 after piles from i to j are remaining, she is able to take from the front (left) or the back (right).
    This will increase her overall score depending on whioch of those choices is the maximum. For Lee, he is trying to decrease Alex's score to prevent the desired result from being true.
    Lee will have the same options as Alex to choose from, but that choice has to be the minumum score.
## Step 2
  - For my solution, recursion was the main key for me to get through each possible case of scoring this game. I would utilize two methods: a boolean method that will return the desired result,
  and a void method; the void method will be where the recursive check and traversing of the piles array will be done. 
  I would also make variables of type int: one for Alex to keep track of her overall score, one for Lee to keep track of his score, ones for the front and back to help go through each pile,
  and a boolean array that is storing the true/false result and will change in the boolean method depending on the game scoring. My proposed solutin would show the basic depth first style of recursion of picking from left or right of the piles array, and goes through all possible ways.
