## Abstract Factory: New Requirement: Multi-Format Employee Report Export

---

The Reporting team introduces a new requirement:

> HR wants to export employee reports in different formats:
>
> - PDF
> - Excel
> - HTML

Each export format must produce a **complete and consistent report**, including:

- Report formatting rules
- Layout/template
- Output writer
- Naming conventions

And most importantly:

> **❗ PDF components must never mix with Excel or HTML components**

This is where naive factories break down.