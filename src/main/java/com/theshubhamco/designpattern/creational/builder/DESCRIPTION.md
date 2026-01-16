## Builder Pattern in Action 

---

As the Employee Management System evolves, reporting requirements become richer and more flexible.

Initially, the ReportingClient exposed a simple method:

```java
String generateReport(Employee employee);
```

This worked for basic use cases, but it quickly showed limitations:
-	Reports started accumulating multiple optional fields
-	The return type was too generic (String)
-	Construction logic became unclear and hard to extend
-	Adding new report sections risked breaking existing code

### The Core Problem

We were no longer dealing with **behavior selection** or **type selection**.

Instead, we faced a **construction complexity problem**:

> How do we safely build a complex report object with many optional parts without constructor overloads or invalid states?

### The Solution: Builder Pattern

To address this, we introduced a dedicated **EmployeeReport model** and refactored:
```java
ReportingClient.generateReport();
```
to return:
```java
EmployeeReport
```

Instead of assembling report data via constructors or setters, we now use the Builder Pattern to:
-	Construct EmployeeReport step by step
-	Handle optional fields safely
-	Improve readability at the call site
-	Keep the final object immutable and valid

### Why Builder Fits Here
-	EmployeeReport is a value object
-	It represents a snapshot of employee data
-	It has many optional fields
-	It is created once and never mutated

This makes it an ideal candidate for the Builder Pattern.

>📌 Important Design Choice  
We deliberately did not apply Builder to the Employee domain entity.  
Domain entities carry identity, behavior, and lifecycle rules, which are better modeled using polymorphism, strategies, and services.

### Outcome

With Builder in place:
-	ReportingClient remains clean and intention-revealing
-	Object construction is explicit and safe
-	The design stays aligned with SRP, OCP, and DIP
-	The system becomes easier to extend without breaking callers

This step demonstrates how Builder complements Factory and Strategy, completing the creational design story in a real system.