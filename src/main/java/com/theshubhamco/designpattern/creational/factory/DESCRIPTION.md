## After SOLID in Action – Employee Management System

---

If we look closely at the current persistence design, we can notice an important limitation:

- The **client is still responsible for creating concrete persistence strategy objects**
- Even when persistence is not the primary concern, the client must still decide *which implementation* to instantiate and pass to `EmployeeService`

This means that **object creation logic is leaking into client code**.

While this design already follows **Strategy**, **OCP**, and **DIP**, it can be improved further.

To **fully decouple clients from concrete implementations** and centralize creation logic, we introduce the **Factory Method pattern**.

The Factory encapsulates *which persistence strategy to create*, allowing clients to depend only on abstractions.

> 📌 We have already solved a **similar problem earlier** in the *salary calculation* section using Strategy.  
> Here, Factory Method complements Strategy by handling **object creation**, not behavior selection.

This step moves the design closer to a production-ready architecture.