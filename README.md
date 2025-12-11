# 📘 Java Collections Practice Project

## 📌 Description
This project focuses on core concepts of Java Collections, practicing the most commonly used classes from the `java.util` library such as `ArrayList`, `HashSet`, `HashMap`, and `ListIterator`.

Throughout the exercises, you will work with:

- Creation and manipulation of collections  
- Duplicate handling  
- Object comparison and ordering  
- File reading and writing  
- Basic user interaction  
- Good programming practices (clean code, separation of responsibilities, English naming)

The goal is to strengthen your understanding of how Java manages data structures and to help you design clear, maintainable, and well-structured programs.

## 🧱 Project Structure

src/
├── level01A/ # ArrayList, HashSet, Iterator
├── level01B/ # ListIterator and reversed lists
├── level01C/ # Capital Game (HashMap + file IO)
├── level02A/ # Restaurant equality (HashSet)
├── level02AandB/ # Comparable/Comparator ordering
resources/
├── countries.txt
└── classificacio.txt
---

# 🚀 Level 1

## **Exercise 1 — Duplicates**
Create a `Month` class containing a `name` attribute.

Steps:

1. Add 11 months to an `ArrayList` except for *August*.  
2. Insert *August* in its correct position.  
3. Check that the order is correct.  
4. Convert the `ArrayList` into a `HashSet` to verify duplicate handling.  
5. Traverse the collection using:
   - A `for` loop  
   - An `Iterator`

---

## **Exercise 2 — ListIterator**
Practice list manipulation and bidirectional iteration.

Steps:

1. Create and fill a `List<Integer>`.  
2. Create a second list and insert the same elements in reverse order.  
3. Use a `ListIterator` to read elements from the first list and add them to the second.

---

## **Exercise 3 — Capital Game**
A small game to practice file handling, maps, and user input.

### Requirements:
- Read `countries.txt`, containing country–capital pairs separated by commas.  
- Load the data into a `HashMap<String, String>`.  
- Ask the user for their name.  
- Randomly select **10 different countries** and ask for the capital.  
- Award 1 point per correct answer.  
- Display the total score.  
- Save the player's name and score into `classificacio.txt`.

This strengthens skills in:
- File reading (`BufferedReader`)
- Maps and key–value structures
- Random selection without repetition
- Writing results to a file

---

# 🔥 Level 2

## **Exercise 1 — HashSet without exact duplicates**
Create a `Restaurant` class with:

- `name` (String)  
- `qualification` (int)

Override `equals()` and `hashCode()` so that:

- Two restaurants are duplicates **only if both name and qualification match**.  
- Same names with different scores are allowed.

Ensures correct behavior inside a `HashSet`.

---

## **Exercise 2 — Multi-criteria Sorting**
Extend ordering logic for `Restaurant`:

### Sorting rules:
1. Alphabetically by **name** (ascending).  
2. If names coincide, order by **qualification** (descending).

You may implement this using:

- `Comparable<Restaurant>`  
or  
- A custom `Comparator`

### Expected Output:
Restaurant A — 9
Restaurant A — 7
Restaurant B — 8

---

# 🛠 Technologies
- Java 21  
- IntelliJ IDEA  
- Java Collections Framework  
- File I/O (BufferedReader, FileWriter)  
- Git & GitHub  

---

# ▶️ Running the Project

1. Clone the repository:
git clone <repository-url>

2. Open the project in IntelliJ IDEA.

3. Run the appropriate `Main` classes located in each level:
   - `MonthMain`
   - `IntegerListReverserMain`
   - `CountryCapitalGameMain`
   - `MainRestaurant`

4. Ensure the `countries.txt` file is located in the project directory where the program expects it.

---

# 📂 Resources
- `countries.txt`: Country–capital pairs for the Capital Game  
- `classificacio.txt`: Output file containing saved scores  

---

# 📌 Notes
- Code is written in English following clean code standards.
- Classes and methods follow the principle of single responsibility.
- Logic is modular and avoids placing all behavior inside `main`.
- Exercises follow Sprint 0 recommendations for code quality and structure.

