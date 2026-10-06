# Constructors — Notes

## 1. Constructor

A constructor is a special class member used to initialize an object.

```java
Student student = new Student();
```

When the object is created, the appropriate constructor is executed.

## 2. No-Argument Constructor

A constructor with zero parameters:

```java
Student() {
    name = "Unknown";
    age = 0;
}
```

## 3. Parameterized Constructor

A constructor that receives values:

```java
Student(String studentName, int studentAge) {
    name = studentName;
    age = studentAge;
}
```

Example:

```java
Student student = new Student("Ali", 20);
```

## 4. Default Constructor

If a class declares no constructor, Java provides a default no-argument constructor automatically.

A user-defined no-argument constructor is not called a default constructor.

## 5. Constructor Overloading

A class can have multiple constructors when their parameter lists are different:

```java
Book()
Book(String title)
Book(String title, double price)
```

Java selects the appropriate constructor based on the arguments supplied to `new`.

## 6. Constructor vs Method

| Constructor                 | Method                 |
| --------------------------- | ---------------------- |
| Initializes an object       | Performs an operation  |
| Same name as class          | Any valid name         |
| No return type              | May have a return type |
| Runs during object creation | Called explicitly      |

## 7. Important Distinction

The constructor should initialize the object.

For example:

```java
Employee(String employeeName) {
    name = employeeName;
    employeeId = 0;
    salary = 0.0;
}
```

A separate method can display the object's state:

```java
void displayInfo() {
    System.out.println("Name: " + name);
}
```

## 8. Project Note

`this` is intentionally not used in this lesson because it is covered in the next lesson:

`03 — this Keyword`
