Notes

Type Casting

Type Casting is the process of converting a value from one primitive data type to another.

Types of Casting

Implicit Casting (Widening)

Performed automatically by Java.

Converts a smaller data type to a larger one.

No data loss.

Example:

int number = 10; double value = number; 

Explicit Casting (Narrowing)

Performed manually by the programmer.

Converts a larger data type to a smaller one.

May cause data loss.

Example:

double price = 19.99; int wholePrice = (int) price; 

Important Rules

Decimal digits are truncated, not rounded.

Casting before an operation changes the calculation.

Casting after an operation changes only the result type.

char values can be converted to their Unicode (ASCII) integer values.

Overflow can occur when converting to a smaller data type.

Common Mistakes

Assuming explicit casting rounds decimal numbers.

Forgetting to cast before integer division.

Ignoring overflow when narrowing values.

Confusing implicit and explicit casting.