## Singleton Pattern – Mechanics & Correct Implementations (Java)

---

This module contains **step-by-step implementations of the Singleton design pattern in Java**, focusing on **mechanics, 
thread safety, and JVM guarantees**.

The goal of this project is **not** to argue when Singleton should be used, **but to clearly demonstrate how 
different Singleton implementations behave**, why some are unsafe, and which approaches are recommended in modern Java.

### What This Repository Covers

The examples walk through Singleton evolution in a practical, incremental way:
- **Eager Initialization**
  - Instance created at class loading time 
  - Simple but often wasteful
- **Lazy Initialization (Non-Thread-Safe)**
  - Demonstrates race conditions in multithreaded access
- **Synchronized Method Singleton**
  - Correct but performance-heavy
- **Synchronized Block Singleton** 
  - Thread-safe but inefficient due to unnecessary locking
- **Double-Checked Locking (DCL)**
  - Optimized, thread-safe lazy initialization
  - Explains why volatile is required
- **Initialization-on-Demand Holder Idiom (Bill Pugh Singleton)**
  - JVM-backed lazy loading 
  - Cleanest and most recommended implementation
- **Enum-Based Singleton**
  - JVM-guaranteed single instance 
  - Safe against reflection and serialization attacks

Each implementation is intentionally isolated so that behavior, trade-offs, and pitfalls are easy to observe.

### What This Repository Does NOT Cover

-	Business-level usage decisions
-	Dependency Injection vs Singleton trade-offs
-	When Singleton becomes a design smell

Those topics are intentionally covered in a **separate conceptual chapter** to keep this module focused on 
implementation correctness.