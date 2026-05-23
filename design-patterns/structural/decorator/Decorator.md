## ✅ When to Use Decorator Design Pattern

- **Dynamic Behavior Addition**  
  Useful for adding responsibilities to individual objects dynamically without affecting other instances.

- **Avoiding Class Explosion**  
  Helps prevent the creation of numerous subclasses for every combination of features or behaviors.

- **Preserves Base Type**  
  Decorators and the base class share the same interface or superclass, allowing seamless substitution.

---

## 🔁 Summary

- Use when additional functionality is required **without modifying the original class**.
- Suitable when modifications **only add behavior**, not change existing behavior.
- Final output remains of the **same base type**.

---

## ❗ Why Not Inheritance?
Using inheritance to add every combination of toppings would lead to class explosion —
too many classes like:

CheesePizza

CheeseTomatoPizza

CheeseTomatoOnionPizza

CheeseTomatoOliveOnionPizza, and so on...

Maintaining such a growing set of classes becomes unmanageable and violates the Open/Closed Principle.

Decorator Pattern solves this by composing objects at runtime instead of creating a new subclass for every possible combination.

---

## 💥 What Is Class Explosion?
Class explosion refers to a situation where the number of subclasses grows excessively due to every possible feature combination requiring a separate subclass.
This makes the codebase:

- Hard to maintain
- Difficult to extend
- Prone to duplication and errors
The Decorator Pattern helps keep the class hierarchy flat and flexible.

---

## 💡 Key Benefit
- Prevents class explosion by enabling composition over inheritance.

---

## 🍕 Real-World Example

**Pizza Topping Example**  
Base: `PlainPizza`  
Decorators: `Cheese`, `Olives`, `Tomato`  
Result: Still a `Pizza`, just with additional features.

```java
interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    public String getDescription() { return "Plain Pizza"; }
    public double getCost() { return 5.00; }
}

abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;
    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }
}

class Cheese extends ToppingDecorator {
    public Cheese(Pizza newPizza) { super(newPizza); }
    public String getDescription() { return tempPizza.getDescription() + ", Cheese"; }
    public double getCost() { return tempPizza.getCost() + 1.50; }
}
```
