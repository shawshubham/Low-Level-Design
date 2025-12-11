## **Requirement Change & SRP Under Inheritance**

---

> ❓ What if each type of employee (FullTime, Contract, Intern) starts to have its own unique responsibilities or behaviors?

In such a case, the current implementation will break, we might think of using inheritance to define different employee types. But how we organize responsibilities (like saving, formatting, etc.) will determine whether we still respect the Single Responsibility Principle (SRP).