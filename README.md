# Hangmen
## About this Project
Hangmen is a game where the user guesses an unknown word. At the beginning of the game, each letter gets replaced with an underscore. The User can type in individual letters of the alphabet in any order. If the letter exists in the yet unknown word then the certain underscores will be replaced by this letter. Soon, the word which you are looking for will emerge.
However, if the letter does not belong in the searched word, then the beginning of the hangman is drawn. With each wrong letter another part gets added and so on.
If the searched word is guessed before the hangman is fully drawn, then the player/user wins. Else they lose the game.

## Installation guide
This project requires [IntelliJ](https://www.jetbrains.com/de-de/idea/download/#section=mac) to run.

- First install this program and start it!
- Open the hangmen.java document.
- Once the project is open press run and the game begins!


## How does this project work?
### Hangmen Class
At the beginning of the code in hangmen.java we can see that, in this file that the hangman class is developed with all its methodes.
First, a file path of a text file is specified as the command line parameter. The words in the text file are line by line with as many lines as wished. There is only one word per line allowed. Furthermore, the words may only consist of the characters A-Z and a-z. Blank lines get ignored.
Secound, if these declarations are not given, then a exception will he thrown.

If the text file is correct, then the words get shuffled and the game can begin.

### The Hangmen Methods
The methodes are in the same file.

* `printGameEnd(words, winCounter)` - prints the results of played matches under a separator line. `words` is the list of words and `winCounter` is the counter of how many games were won.
* `printWordNumber(loopCounter)` - prints the number of the word that is currently played. `loopCounter`is the number of the current loop.
* `handleFileNotFoundException(FileNotFoundException e)`- handles a FileNotFoundException and prints the correct error. `e`is the FileNotFoundException.
* `checkForError(hasError, errorMessage)`- checks for an specific error by the given boolean and returns the given string. `hasError` is the boolean of the error check and `errorMessage`is the error message that will be printed.
* `printMisses(wrongPlayerGuesses, wrongCount)` - prints the count of the misses and the characters that were wrongly guessed. `wrongPlayerGuesses`is the wrongly guessed characters and `wrongCount`is the count of the wrong guesses.
* `printHeader(words)`- prints the header of the game, with the word count. `words` is the list of words.
* `printHangedMan(wrongCount)`- prints the hangman. `wrongCount`is the count of the wrongly guesses characters.
* `getPlayerGuess(keyboard, word, playerGuesses, wrongPlayerGuesses)`- gets the user input, checks it for validity and fills the array lists. `keyboard`is the scanner which reads the users input, `word` is the word which needs to be guessed, `playerGuesses`is the list of guesses and `wrongPlayerGuesses`is the list of wrong guesses.
* `printWordState(word,playerGuesses)` - prints the state of the currently guessed word and returns true if the word is correctly guessed. `word` is the word that is currectly guessed and `playerGuesses`is the list of guesses.


## Important Infomation

Good Luck! 

## Exercise files
* Exercise1 - [File1](exercise1.md)
* Exercise2 - [File2](exercise2.md)
* Exercise3 - [File3](exercise3.md)
* Exercise4 - [File4](exercise4.md)
* Exercise5 - [File5](exercise5.md)

## Links and Template

* Template - [Template](src/main/resources/log4j2.xml.template)

[FH JOANNEUM](https://www.fh-joanneum.at/mobile-software-development/bachelor/)
[GitHub](https://github.com/AllyssaUlz/msd21_Ulz_Allyssa.git)


