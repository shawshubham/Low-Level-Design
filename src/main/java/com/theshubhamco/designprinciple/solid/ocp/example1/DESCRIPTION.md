## Design Problem: Saving Employee Data to Different Destinations

---

In the SRP chapter, we split responsibilities into clean collaborators (`Employee`, `EmployeeFormatter`, `EmployeeFileSaver`, `EmployeeService`).  
In this OCP chapter, we build on that design and focus on **how to add new saving options without editing the existing service.**

### Initial Requirements Recap:

- We designed an `EmployeeService` that saves employees to a file using `EmployeeFileSaver`.

### Updated Requirement (New Business Need):

HR now wants to support **multiple data storage options**:

- ✅ Save to a local file
- ✅ Save to a database
- ✅ Save to a remote REST API
- 🔜 More destinations in the future (Kafka, S3, etc.)

👉 Your system should support these additions **without modifying** the existing core logic.