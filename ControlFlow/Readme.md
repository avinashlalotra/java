# Java Control Flow Guide
A comprehensive guide to conditional statements and loops in Java.

## Conditional Statements

### Basic if-else Syntax
```java
if (condition) {
    // code executed if condition is true
} else {
    // code executed if condition is false
}
```

### Multiple Conditions (else-if)
```java
if (condition1) {
    // executed if condition1 is true
} else if (condition2) {
    // executed if condition2 is true
} else {
    // executed if all conditions are false
}
```

### Nested if Statements
```java
if (outerCondition) {
    if (innerCondition) {
        // executed if both conditions are true
    }
}
```

### Logical Operators
- `&&` (AND): Both conditions must be true
- `||` (OR): At least one condition must be true
- `!` (NOT): Inverts the condition

```java
if (age >= 18 && hasLicense) {
    System.out.println("Can drive");
}

if (isHoliday || isWeekend) {
    System.out.println("Day off");
}

if (!Strike) {
    System.out.println("Attend classes");
}
```



## Loops

### For Loop
Basic structure:
```java
for (initialization; condition; increment/decrement) {
    // code to be repeated
}
```

Example:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}
```

### While Loop
```java
while (condition) {
    // code to be repeated
}
```

Example:
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

## Switch statements

The switch expression is evaluated once.
The value of the expression is compared with the values of each case.
If there is a match, the associated block of code is executed.
The break and default keywords are optional,

```java

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```