## New Requirement: Salary Calculation Rules

---

Until now, our Employee Management System handled:

- Employee types
- Formatting
- Persistence (via OCP Example 1)

**But we never implemented salary calculations.**

HR now introduces a new requirement:

| Employee Type     | Salary Rule                                   |
|-------------------|-----------------------------------------------|
| Full-Time         | base salary + bonus                           |
| Contract          | hourly rate × hours worked                    |
| Intern            | fixed stipend                                 |

And future types are expected:

- Commission-based
- Part-time
- Overseas employees with currency conversion
- Apprentices

This means salary calculation logic will **grow over time**.

This is a perfect scenario to apply the **Open/Closed Principle**.