# 🚀 Strategy Design Pattern

The **Strategy Design Pattern** is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable.

---

## 📌 Intent

> **"Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it."**

---

## ✅ When to Use

- You have multiple ways to perform a task (e.g., payment methods, sorting techniques).
- You want to switch between algorithms dynamically at runtime.
- You want to avoid `if-else` or `switch` statements based on behavior.
- You follow the **Open/Closed Principle** – easily extend without modifying existing code.

---

## 🧱 Structure

```text
+------------------+
|     Context      |
+------------------+
| - strategy: IS   |
+------------------+
| + setStrategy()  |
| + execute()      |
+------------------+
         |
         v
+------------------+        +------------------------+
|   IStrategy      |<-------|   ConcreteStrategyA     |
+------------------+        +------------------------+
| + execute()      |        | + execute()            |
+------------------+        +------------------------+
                            |   ConcreteStrategyB     |
                            | + execute()            |
                            +------------------------+
