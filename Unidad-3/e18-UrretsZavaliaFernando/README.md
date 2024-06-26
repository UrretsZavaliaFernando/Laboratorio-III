[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/ECCYm6QA)
# Challenge "Stack"

> In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves 
> as a collection of elements, with two principal operations: push, which adds an element to the 
> collection, and pop, which removes the last element that was added.(Wikipedia)

A string containing only parentheses is balanced if the following is true: 
1. if it is an empty string
2. if A and B are correct, AB is correct, 
3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

## Input Format

There will be multiple lines in the input file, each having a single non-empty string. 
You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

## Output Format

For each case, print **_'true'_** if the string is balanced, **_'false'_** otherwise.

## Sample Input

```
{}()
({()})
{}(
[]
```

## Sample Output 0

```
true
true
false
true
```
