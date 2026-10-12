# Static Members

## 1. Overview

The `static` keyword defines members that belong to a class rather than to individual objects.

Java supports two main types of static members:

- Static fields
- Static methods

## 2. Static Fields vs. Instance Fields

A **static field** belongs to the class and is shared among its objects.

An **instance field** belongs to an individual object. Each object has its own instance field values.

Example:

```java
class Student {
    static int studentCount = 0;
    String name;

    public Student(String name) {
        this.name = name;
        studentCount++;
    }
}
```

When two objects are created, both share the same `studentCount` field, but each object has its own `name` field.

```java
Student student1 = new Student("Ali");
Student student2 = new Student("Sara");

System.out.println(student1.name);
System.out.println(student2.name);
System.out.println(Student.studentCount);
```

Expected output:

```text
Ali
Sara
2
```

### Comparison

| Feature | Static Field | Instance Field |
|---|---|---|
| Belongs to | Class | Individual object |
| Shared among objects | Yes | No |
| Access through class name | Yes | No |
| Example | `studentCount` | `name` |

## 3. Static Methods vs. Instance Methods

A **static method** belongs to the class and can be called without creating an object.

An **instance method** is associated with an object and can directly access its instance members.

Example:

```java
public static void displayStudentCount() {
    System.out.println(Student.studentCount);
}

public void displayName() {
    System.out.println(name);
}
```

Calling these methods:

```java
Student.displayStudentCount();
student1.displayName();
```

### Comparison

| Feature | Static Method | Instance Method |
|---|---|---|
| Associated with | Class | Object |
| Can be called without creating an object | Yes | No, when called externally |
| Direct access to instance fields | No | Yes |
| Direct access to static fields | Yes | Yes |
| Has an implicit `this` reference | No | Yes |

## 4. Access Rules

A static method can directly access static members but cannot directly access instance members.

For example, the following method does not compile if `name` is an instance field:

```java
public static void displayName() {
    System.out.println(name);
}
```

The method has no implicit reference to a particular object.

To access an instance field from a static method, pass an object reference:

```java
public static void displayName(Student student) {
    System.out.println(student.name);
}
```

### Accessing Static Members

Use the class name to access static members:

```java
Student.studentCount;
Student.displayStudentCount();
```

This approach clearly identifies the members as belonging to the class.

## 5. Static Members and Constructors

A constructor can update a static field whenever an object is created.

Example:

```java
static int studentCount = 0;

public Student(String name) {
    this.name = name;
    studentCount++;
}
```

Each constructor call increments the shared counter.

**Important:** This counter records how many times it has been incremented. It does not automatically track how many objects currently exist in memory.

## 6. Common Mistakes

- Assuming every object has its own copy of a static field.
- Declaring an instance field as `static` when each object needs a separate value.
- Accessing an instance field directly from a static method.
- Using an object reference to access a static member instead of the class name.
- Assuming a static counter automatically tracks the number of existing objects.

## 7. Key Takeaways

- Static members belong to the class.
- Instance members belong to individual objects.
- Static fields are shared among objects of the same class.
- Static methods can be called without creating an object.
- Static methods cannot directly access instance members without an object reference.
- Static methods do not have an implicit `this` reference.
- Constructors can update static fields.
- The class name is the preferred way to access static members.