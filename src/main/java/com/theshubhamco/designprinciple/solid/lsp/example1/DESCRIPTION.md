## New Requirement: Attendance-Based Deductions

---

Our Employee Management System currently supports:

- Full-time employees (base + bonus)
- Contract employees (hourly rate × hours worked)
- Interns (fixed stipend)

A new HR requirement arrives:

> **“We want attendance-based salary deductions and a new Employee Type”**

### Final Requirement

HR has added a new employee type: **Commission-Based Employees (New)**

- Base pay
- Tiered commission (5%, 7%, 10%) depending on monthly sales
- Deductions are based on compliance penalties, not attendance

#### Deduction Rules:

| Employee Type                        | Rule                                                                                       |
| ------------------------------------ | ------------------------------------------------------------------------------------------ |
| **Full-Time**                        | Deduction = daysAbsent × 50                                                                |
| **Contract**                         | Missing hours → pro-rated deduction                                                        |
| **Interns**                          | No deductions                                                                              |
| **Commission-Based Employees (New)** | No attendance-based deduction — deductions are tied to _compliance penalties_, not absence |

This changing and inconsistent set of rules sets the perfect stage to demonstrate how a **wrong abstraction** can break the **Liskov Substitution Principle (LSP)**.