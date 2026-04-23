# Java PacMan Engine 👾

A fully-functional, standalone PacMan graphical game built from scratch using Core Java, Swing, and AWT. This project demonstrates foundational software engineering concepts including event-driven game loops, axis-aligned physics (AABB), and memory-efficient data structures without relying on heavy external game engines.

---

## 🎮 How to Play

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Installation & Execution
You can compile and run the engine directly from your terminal. Navigate to the root directory `d:\pacman` and run:

```bash
# 1. Navigate to the source folder
cd src

# 2. Compile the core classes
javac App.java PacMan.java

# 3. Launch the game
java App
```

### Controls
*   **Up Arrow**: Move Up
*   **Down Arrow**: Move Down
*   **Left Arrow**: Move Left
*   **Right Arrow**: Move Right

*   **Objective**: Eat all the food pellets while avoiding the Ghosts.
*   **Restart**: If you lose all 3 lives, press any arrow key to restart the board!

---

## 📚 Technical Documentation & Interview Prep

This repository is built not just as a game, but as a demonstration of computer science architectures. Please refer to the following documents for comprehensive write-ups on the constraints solved and the patterns used:

*   [ARCHITECTURE.md](./ARCHITECTURE.md): A deep-dive into the technical bottlenecks solved, the Event-Driven Swing Timer Loop, and highly technical resume bullet points.
*   [CS_Concepts_Interviews.md](./CS_Concepts_Interviews.md): A breakdown of how core Object-Oriented Principles (Polymorphism, Inheritance), Data Structures (HashSets), and Memory concepts apply directly to this codebase.

---

## 🏗️ Project Structure

*   `src/App.java`: The Main Thread driver and OS Window (JFrame) instantiation.
*   `src/PacMan.java`: The core game engine containing the rendering loops, Physics AABB collision models, and the embedded `Block` state containers.
*   `src/*.png`: The static graphical sprite assets eagerly loaded into JVM memory on boot.
