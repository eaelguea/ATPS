# Palindrome Substrings
## Step 1
  - Define the problem
    - Given a string, count the number of palindromes that this string has. Note: substrings with different start or end indexes are counted as different substrings
    even though they do contain the same characters.
  - Define solution (recursively)
    - For this problem, I wanted to not only utilize recursion, but find a much easier way to count the palindromes without have so much line of code. With this line of thinking, we realize that there are multiple ways to count the palindromes and determine the different sets. To officially count a character a part of a palindrome, it could be a single character, or a multi character string. This has to be checked by traversing the string and checking if each substring equals the next and once that check ends, depending on the length and if all characters are equal, add one to the overall count of palindromes.
## Step 2
  - For a proposed solution, I would want to create one singular integer method that uses that string as a parameter and returns the count. Inside this method, I would implement the obvious count variable to store the total overtime and have it change according to the checks in the loops; for-loops are the easiest to use for me and they will check for single, double, or more than length three substrings. My DP array would be of type boolean as it would store if that particular sequence of characters is a palindrome and if there are more of the palindrome, return to that position in the array and set it true and add to the overall count.
