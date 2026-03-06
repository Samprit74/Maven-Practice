# Maven Practice

This repository demonstrates Maven dependency usage.

Projects:
- mylib → reusable search algorithms
- app → application consuming the library

Concepts practiced:
- Maven archetype
- local repository (.m2)
- dependency management
- exec-maven-plugin


# Algorithm Toolkit (Java)

A modular Java **algorithm library** built using **Apache Maven multi-module architecture**.
The toolkit provides reusable implementations of common **search, sorting, and mathematical algorithms** that can be imported into other Java projects.

---

## Libraries

### 1. Search Library (`search-lib`)

Provides common search algorithms.

**Algorithms included**

* Linear Search
* Binary Search
* Jump Search
* Exponential Search
* Interpolation Search

**Supported data structures**

* Arrays
* Lists
* 2D Arrays
* List of Lists
* List of Arrays

---

### 2. Sort Library (`sort-lib`)

Collection of widely used sorting algorithms.

**Algorithms included**

* Quick Sort
* Merge Sort
* Insertion Sort
* Selection Sort
* Shell Sort
* Counting Sort
* Radix Sort
* Bucket Sort

Also includes:

* Quick Select (k-th smallest element)

---

### 3. Math Library (`math-lib`)

Utility functions for mathematical and number-theory operations.

**Features**

* GCD
* LCM
* Factorial
* Fibonacci
* Power
* Prime check
* Next prime
* Prime generation
* nCr (Combination)
* nPr (Permutation)
* Bit utilities

---

## Architecture

The project is implemented as a **Maven multi-module library**:

```
algorithm-toolkit
│
├── search-lib
├── sort-lib
├── math-lib
└── algo-toolkit
```

Each module produces its own **JAR library** which can be used independently or together.

---

## Build

Build the entire toolkit:

```
mvn clean install
```

This generates the JAR files in each module's `target` directory.

---

## Usage

Add the generated libraries to your Java project's classpath and import the required classes.

Example:

```
import com.roy.algo.Sort;
import com.roy.algo.Search;
import com.roy.algo.MathAlgo;
```

---

## Technologies

* Java
* Apache Maven
* Multi-module project structure

---
