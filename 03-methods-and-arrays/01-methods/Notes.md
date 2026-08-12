01-Methods — Notes

1. Method

A method is a named, reusable block of code that performs a specific task.

Methods help divide a program into smaller and more manageable parts.

public static void greet()
{
    System.out.println("Hello!");
}

The method above defines a method named "greet".

---

2. Method Declaration

A method declaration defines the structure and behavior of a method.

public static int add(int a, int b)
{
    return a + b;
}

Main parts:

- "public" → access modifier
- "static" → belongs to the class rather than an object
- "int" → return type
- "add" → method name
- "(int a, int b)" → parameters
- "{ ... }" → method body

---

3. Calling a Method

Defining a method does not execute it.

The method must be called.

greet();

Example:

public static void greet()
{
    System.out.println("Hello!");
}

public static void main(String[] args)
{
    greet();
}

Output:

Hello!

---

4. "void" Methods

A method with the return type "void" does not return a value.

public static void printMessage()
{
    System.out.println("Java");
}

It can perform an action without producing a return value.

---

5. Return Types

A method can return a value.

The return type specifies the type of value returned.

public static int getNumber()
{
    return 10;
}

The return type is "int", so the method must return an "int".

Other examples:

public static double getPrice()
{
    return 19.99;
}

public static String getName()
{
    return "Mehdi";
}

public static boolean isPositive()
{
    return true;
}

---

6. The "return" Statement

The "return" statement sends a value back to the caller.

public static int add(int a, int b)
{
    return a + b;
}

The returned value can be stored:

int result = add(10, 20);

Or used directly:

System.out.println(add(10, 20));

"return" also immediately ends the current method execution.

public static void test()
{
    System.out.println("A");
    return;
    // Code here would be unreachable.
}

---

7. Parameters

Parameters are variables declared in a method definition.

public static int add(int a, int b)
{
    return a + b;
}

Here:

- "a" is a parameter.
- "b" is a parameter.

Parameters receive values when the method is called.

---

8. Arguments

Arguments are the actual values passed to a method when it is called.

int result = add(10, 20);

Here:

- "10" is an argument.
- "20" is an argument.

Parameter vs Argument

Parameter → variable in method declaration
Argument  → actual value in method call

---

9. Methods Without Parameters

A method does not have to receive input.

public static void printWelcome()
{
    System.out.println("Welcome to Java!");
}

Call:

printWelcome();

---

10. Methods With Parameters

A method can receive one or more parameters.

public static void greet(String name)
{
    System.out.println("Hello " + name);
}

Call:

greet("Mehdi");

Output:

Hello Mehdi

---

11. Methods Without a Return Value

A "void" method can perform an action.

public static void printSum(int a, int b)
{
    System.out.println(a + b);
}

This method prints the result but does not return it.

---

12. Methods With a Return Value

A method can calculate a value and return it.

public static int calculateSum(int a, int b)
{
    return a + b;
}

The caller decides what to do with the result:

int result = calculateSum(10, 20);

System.out.println(result);

This is usually more reusable than printing directly inside the method.

---

13. The Four Main Method Forms

1. No Parameters + No Return Value

public static void greet()
{
    System.out.println("Hello");
}

2. No Parameters + Return Value

public static int getNumber()
{
    return 10;
}

3. Parameters + No Return Value

public static void greet(String name)
{
    System.out.println("Hello " + name);
}

4. Parameters + Return Value

public static int add(int a, int b)
{
    return a + b;
}

---

14. Local Variables

A variable declared inside a method is a local variable.

public static void calculate()
{
    int result = 10 + 20;

    System.out.println(result);
}

"result" exists only within its accessible scope.

It cannot be accessed from another method.

---

15. Block Scope

Variables declared inside a block are accessible only within that block.

if (true)
{
    int number = 10;
    System.out.println(number);
}

This is valid.

But this is invalid:

if (true)
{
    int number = 10;
}

System.out.println(number);

The variable "number" is outside its scope.

---

16. Method Parameters and Scope

Parameters are available inside the method body.

public static int square(int number)
{
    return number * number;
}

"number" is available inside "square()".

It cannot be accessed directly from outside the method.

---

17. Method Reusability

One of the main benefits of methods is reusability.

Instead of repeating:

int result1 = 10 + 20;
int result2 = 30 + 40;
int result3 = 50 + 60;

A reusable method can be created:

public static int add(int a, int b)
{
    return a + b;
}

Then:

int result1 = add(10, 20);
int result2 = add(30, 40);
int result3 = add(50, 60);

The calculation logic exists in one place.

---

18. Boolean Methods

Methods can return "boolean".

public static boolean isEven(int number)
{
    return number % 2 == 0;
}

Usage:

if (isEven(10))
{
    System.out.println("Even");
}

Boolean methods are useful for validation and decision-making.

Good boolean method names often start with:

- "is"
- "has"
- "can"
- "should"

Examples:

isValid()
isPositive()
hasPermission()
canLogin()

---

19. Calculation Methods

A calculation method should generally return the calculated value when that value may be needed elsewhere.

public static double calculateArea(double length, double width)
{
    return length * width;
}

Then the caller can decide how to use the result:

double area = calculateArea(5, 4);

System.out.println(area);

Returning the result makes the method more reusable than directly printing it.

---

20. Single Responsibility

A method should generally have one clear responsibility.

Avoid methods that perform many unrelated tasks.

Less focused:

public static void process()
{
    // Read input
    // Calculate result
    // Validate data
    // Print report
}

Prefer smaller focused methods when the logic becomes complex.

readInput();
calculateResult();
validateData();
printReport();

---

21. Meaningful Method Names

Method names should clearly describe what the method does.

Good:

calculateTotal()
validateAge()
printWelcomeMessage()
isEven()
findMaximum()

Poor:

doIt()
test()
abc()
method1()

Use descriptive names and follow Java naming conventions:

lowerCamelCase

---

22. Common Mistakes

Forgetting the return value

Incorrect:

public static int add(int a, int b)
{
}

The method promises an "int" but does not return one.

Correct:

public static int add(int a, int b)
{
    return a + b;
}

Using the wrong return type

Incorrect:

public static int getName()
{
    return "Mehdi";
}

Correct:

public static String getName()
{
    return "Mehdi";
}

Confusing parameters and arguments

add(10, 20);

"10" and "20" are arguments.

add(int a, int b);

"a" and "b" are parameters.

Accessing a local variable outside its scope

public static void test()
{
    int number = 10;
}

System.out.println(number);

This is invalid.

Unreachable code after "return"

public static int getNumber()
{
    return 10;

    // Unreachable
    // System.out.println("Java");
}

---

23. "main()" Is Also a Method

The entry point commonly used to start a Java application is:

public static void main(String[] args)
{
}

It is a method with:

- "public" access
- "static" modifier
- "void" return type
- method name "main"
- one parameter: "String[] args"

The JVM calls this method when launching a standard Java application.

---

24. Method Execution Flow

Consider:

public static int add(int a, int b)
{
    int result = a + b;

    return result;
}

Call:

int sum = add(10, 20);

Execution conceptually follows:

main()
   ↓
add(10, 20)
   ↓
a = 10
b = 20
   ↓
result = 30
   ↓
return 30
   ↓
sum = 30

The called method completes and control returns to the caller.

---

25. Method Design Guidelines

When designing a method, ask:

1. What is the single purpose of this method?
2. Does it need parameters?
3. Does it need to return a value?
4. What should the return type be?
5. Are the parameter names meaningful?
6. Is the method reusable?
7. Is the method doing too many unrelated tasks?
8. Is the method name clear?

A good method should have a clear contract:

Input → Processing → Output

For example:

Input:
two integers

Processing:
addition

Output:
one integer

public static int add(int a, int b)
{
    return a + b;
}

---

Quick Review

Method

A reusable block of code that performs a specific task.

Parameter

A variable declared in a method definition.

Argument

The actual value passed to a method call.

Return Type

The type of value a method returns.

"void"

Indicates that the method does not return a value.

"return"

Returns a value and ends the current method execution.

Local Variable

A variable whose accessibility is limited to its scope.

Scope

The region of code where a variable can be accessed.

Reusability

The ability to use the same method from multiple places.

---

Four Method Forms

Parameters| Return Value| Example
No| No| "void greet()"
No| Yes| "int getNumber()"
Yes| No| "void printName(String name)"
Yes| Yes| "int add(int a, int b)"

---

Key Takeaways

- A method is a reusable unit of behavior.
- A method must be defined before it can be called.
- Parameters receive input.
- Arguments provide actual values.
- The return type specifies the returned value's type.
- "void" means no value is returned.
- "return" returns a value and ends method execution.
- Local variables are limited by their scope.
- Block variables cannot be accessed outside their block.
- Boolean methods are useful for conditions and validation.
- Calculation methods are often more reusable when they return results.
- Methods should have clear names and focused responsibilities.
- Good method design improves readability, maintainability, and reuse.

---

Quick Review Questions

1. What is a method?
2. What is the difference between a parameter and an argument?
3. What does "void" mean?
4. What is a return type?
5. What happens when "return" executes?
6. What is a local variable?
7. What is block scope?
8. What are the four main forms of methods?
9. Why is returning a calculation often more reusable than printing it?
10. What makes a method well-designed?