# Notes - String Methods

## Project Information

- **Project:** Java Roadmap
- **Module:** 01 - Java Fundamentals
- **Topic:** String Methods

---

# What is a String Method?

A String method is a built-in function that performs a specific operation on a String object.

Examples:

- Convert text to uppercase.
- Remove spaces.
- Search for text.
- Compare Strings.
- Extract part of a String.

---

# Important Concept

## String is Immutable

A String object **cannot be changed** after it is created.

Methods such as:

- toUpperCase()
- replace()
- trim()

do **not** modify the original String.

Instead, they return a **new String**.

Example:

```java
String text = "java";

text.toUpperCase();

System.out.println(text);
```

Output:

```
java
```

Correct:

```java
text = text.toUpperCase();
```

---

# String Methods Learned

## length()

Returns the number of characters.

```java
text.length();
```

---

## toUpperCase()

Converts all letters to uppercase.

```java
text.toUpperCase();
```

---

## toLowerCase()

Converts all letters to lowercase.

```java
text.toLowerCase();
```

---

## trim()

Removes leading and trailing spaces.

```java
text.trim();
```

---

## contains()

Checks whether a String contains another String.

Returns:

- true
- false

```java
text.contains("Java");
```

---

## startsWith()

Checks whether the String starts with specific text.

```java
text.startsWith("Java");
```

---

## endsWith()

Checks whether the String ends with specific text.

```java
text.endsWith("ing");
```

---

## replace()

Replaces part of the String.

Returns a new String.

```java
text.replace("Java","Python");
```

---

## substring()

Extracts part of a String.

```java
text.substring(beginIndex,endIndex);
```

### Rule

Starts from:

```
beginIndex
```

Stops **before**

```
endIndex
```

---

## equals()

Compares two Strings.

Case-sensitive.

```java
text.equals(other);
```

---

## equalsIgnoreCase()

Compares two Strings.

Ignores uppercase and lowercase.

```java
text.equalsIgnoreCase(other);
```

---

# Important Rules

- String objects are immutable.
- Most String methods return a new String.
- Save the returned String if you need the result.
- equals() compares content.
- Do not use == to compare String contents.
- substring(begin,end) stops before end.

---

# Common Mistakes

❌

```java
text.toUpperCase();
```

✔

```java
text = text.toUpperCase();
```

---

❌

```java
text == other;
```

✔

```java
text.equals(other);
```

---

❌

```java
substring(2,6)
```

when length is 5.

Result:

```
StringIndexOutOfBoundsException
```

---

# End Boundary Rule

If

```java
text.length() == N
```

Then

Last index

```
N - 1
```

Maximum valid endIndex

```
N
```

Example

```
ABCDE
```

```
A B C D E
0 1 2 3 4
```

```
substring(1,5)
```

Output

```
BCDE
```

---

# Summary

After this topic you can:

- Measure String length.
- Convert letter case.
- Remove spaces.
- Search text.
- Compare Strings.
- Replace text.
- Extract text.
- Explain String immutability.
- Use substring() correctly.