## Abstract Factory: New Requirement: Multi-Format Employee Report Export

---

The Reporting team introduces a new requirement:

> HR wants to export employee reports in different formats.

### Functional requirements

- Export employee report in:
    - PDF
    - CSV
    - HTML
- Deliver the report via:
    - Email
    - Download
- Optionally notify the user via:
    - Email
    - SMS
    - Push notification

At first glance, this looks like a **classic Strategy problem**.  
However, upon closer inspection, we notice that the report format and delivery method are **interdependent**.   
For example, a PDF report might be best suited for email delivery, while a CSV report could be more appropriate for download.