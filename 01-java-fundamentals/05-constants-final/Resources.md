# Resources - Constants & final

## Official Documentation

- Oracle Java Documentation
  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

---

## Topics Covered

- final keyword
- Constants
- Java Naming Conventions
- Compile-time Errors
- Variables vs Constants
- Delayed Initialization

---

## Recommended Reading

### Java Language Specification (Optional)

- Final Variables
- Definite Assignment

These sections explain how the Java compiler determines whether a final variable has definitely been assigned before use.

---

## Best Practices

- Use final whenever a value should never change.
- Replace magic numbers with named constants.
- Use meaningful constant names.
- Follow the UPPER_SNAKE_CASE naming convention.
- Keep constants close to where they are used, unless they are shared across multiple classes.

---

## Common Mistakes

- Reassigning a final variable.
- Forgetting to initialize a final local variable before using it.
- Using unclear constant names.
- Ignoring naming conventions.
- Hardcoding numeric values instead of creating constants.

---

## Additional Practice Ideas

- Create constants for:
  - Months in a year
  - Hours in a week
  - Maximum score
  - Passing score
  - Speed of light (approximation)

- Rewrite an old program and replace all magic numbers with constants.

---

## Next Topic

Module 06 — String Basics