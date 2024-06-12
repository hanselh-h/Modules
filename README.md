# SortedStackProject- Module 5

## Overview

The SortedStackProject is a simple Java application that reads a list of integers from the user, sorts them, and stores them in a stack. The sorted stack is then displayed to the user. This project demonstrates basic usage of Java Collections, particularly the `Stack` class, and input handling with `Scanner`.

## Features

- Read a list of integers from user input.
- Sort the integers.
- Store the sorted integers in a stack.
- Display the sorted stack.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven (for building the project)
- A terminal or command prompt
- Git (for cloning the repository)
## Usage

1. **Clone the Repository:**
    ```bash
    git clone https://github.com/yourusername/SortedStack.git
    cd SortedStack
    ```

2. **Compile the Program:**
    ```bash
    javac SortedStack.java
    ```

3. **Run the Program:**
    ```bash
    java SortedStack
    ```

4. **Example:**
    ```
    Enter a list of integers, separated by spaces, and press enter when done:
    5 3 8 1 9
    Sorted stack: [1, 3, 5, 8, 9]
    ```

## Javadoc Generation

To generate Javadoc for the SortedStack program, follow these steps:

Generate Javadoc:

javadoc -d doc SortedStack.java
Open the Generated Documentation:
Open the index.html file located in the doc directory in your web browser to view the Javadoc.

# SortedLinkedList- Module 4
## Overview 
This Java program allows users to enter a list of integers, which are then sorted and displayed using a linked list. The program utilizes the LinkedList and Collections classes from the Java standard library to manage and sort the integers.

## Features

Accepts a list of integers from user input.
Stores the integers in a LinkedList.
Sorts the integers in ascending order.
Displays the sorted list.

## Running Project
## Step 1: Clone the Repository
git clone https://github.com/your-username/SortedLinkedList.git
cd SortedLinkedList
## Step 2: Compile the Java Program
javac SortedLinkedList.java
## Step 3: Run the Program
java SortedLinkedList
## Step 4: Enter the List of Integers
You will be prompted to enter a list of integers separated by spaces. Press enter when done.
Enter a list of integers, separated by spaces, and press enter when done:
3 1 4 1 5 9 2 6 5 3 5
## Step 5: View the Sorted List
The program will output the sorted list of integers.
Sorted linked list: [1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9]

## Generating Javadoc Documentation
## Step 1: Generate Javadoc

javadoc -d doc SortedLinkedList.java
This command will create a doc directory containing the generated HTML documentation.

## Step 2: View the Documentation
Open the index.html file located in the doc directory in your web browser to view the documentation.
open doc/index.html  # On macOS
xdg-open doc/index.html  # On Linux
start doc\index.html  # On Windows

