# Problem Set 1

## Directions
* Fork [Java Problem Set 1](https://repl.it/@kellylougheed/Java-Problem-Set-1) from repl.it
*	Main.java serves as the runner for all your files; complete each problem in the appropriately named file. Any code that you want to execute when the pset runs (e.g. a method call) should be included in your main method
*	At the top of each file, comment a description of the program, your name, and the date
*	Add comments throughout each program if your code is not self-explanatory

## Problems

### 1-0: Calculator II: Methods

Refactor your calculator program from **Problem 0-4: Calculator** to use methods. There should be a separate method for each mathematical operation. Each method should have parameters and return a value. The calculator should still use a scanner to take in two integers and allow the user to select an operation.

Once we learn exceptions, use a try-catch block to prevent division by zero!

### 1-1: Identical

Write a program that asks the user for two strings (allowing for spaces) with the Scanner, and uses a method called `areIdentical` to determine whether the two strings are all the same letter character (e.g. all 'a'). The strings may be different lengths! The method should take in two strings as parameters and return a true or false value which you should then print to the screen.

Example: `areIdentical('aaaa', 'aa')` should return `true`. `areIdentical('aaa', 'ab')` should return `false`.

### 1-2: Sticky Text

Write a program that asks the user for a string with the Scanner, processes it using a method called `createStickyText`, and transforms each letter into alternating lowercase and capital letters. Skip over any character that isn’t a letter (e.g. a space, punctuation) as you transform the letters.  Your method should accept a string as a parameter and return a string, and you should print the result.

Example: `createStickyText("Hello, world")` should return `"HeLlO, wOrLd"`.

Bonus: Add tildes `~` and astrices `*` onto either end of the new string. (+1 pt)

### 1-3: Password Checker

Write a program that asks for a user’s password with the Scanner, runs it through a method called `checkPassword`, and then prints the output (true or false). The `checkPassword` method should accept a string as a parameter and only return true if the user’s password:
*	Is eight or more characters
*	Contains at least one uppercase and one lowercase letter
*	Contains at least one number
*	Contains at least one special character (!, @, #, $, %, *, (, ) )

**Challenge**: Ask the user if they have another password they would like to check, and allow them to check another password if so. (+2 pts)

### 1-4: Caesar Cipher

Write a program that asks the user for a string and a key (int) with the Scanner. It should run these two inputs through a method called `encrypt` that takes in a string and integer and returns a ciphertext. Print the ciphertext. The `encrypt` method should accept a string as a parameter and return a string encrypted with the [Caesar Cipher](http://practicalcryptography.com/ciphers/caesar-cipher/). Print the result.

You may also wish to look back at the [CS50 problem Caesar](https://docs.cs50.net/2017/ap/problems/caesar/caesar.html).

### 1-5: Hamlet

Make Hamlet a Valley girl. Write a method that accepts a string as a parameter and returns a new string with "like" inserted between every single word (except when a line starts/ends). Call this method with the "To be or not to be" monologue provided for you and print the result. 

**Challenge**: Insert "like" even when the line ends. (+2 pts)

### 1-6: Hangman

Implement a text-based hangman game. You can store a String that will be the answer. Otherwise, your program should include some kind of loop that displays the user’s progress and prompts them to keep guessing as long as they haven’t guessed the word.

The simplest implementation of this game might look like:

```
Welcome to Hangman! Here is your word:
--------
Guess:
c
c-------
Guess:
p
c--p----
```

**Challenge**: Look up arrays in Java and store multiple words in an array. Select one of these words randomly every time the user plays. (+2 pts) 

**Challenge**: Ask the user if they would like to play again, and allow them to do so if they choose to. (+2 pts)

**Challenge**: Keep track of the user’s guesses and limit the number of them. The user loses when they have used up all their guesses without guessing the word. (+2 pts)
