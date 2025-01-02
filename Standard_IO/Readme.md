# Java Standard Input/Output (I/O)
## Basic Output

### System.out.println()
Prints output and adds a new line:
```java
System.out.println("Hello World!");  // Prints: Hello World!
System.out.println(42);             // Prints: 42
```

### System.out.print()
Prints output without a new line:
```java
System.out.print("Hello ");
System.out.print("World!");         // Prints: Hello World!
```

## Formatting Output

### printf() Method
Format specifiers for different data types:
```java
System.out.printf("Hello, %s!", "John");     // Hello, John!
System.out.printf("Number: %d", 42);         // Number: 42
System.out.printf("Float: %.2f", 3.14159);   // Float: 3.14
```

Common format specifiers:
- `%s`: Strings
- `%d`: Integers
- `%f`: Floating-point numbers
- `%c`: Characters
- `%b`: Booleans

## Basic Input

### Scanner Class
Most common way to read input:
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
```


## Common Input Methods

### Reading Different Data Types
```java
Scanner scanner = new Scanner(System.in);

// Reading String
String name = scanner.nextLine();      // Reads entire line
String word = scanner.next();          // Reads single word

// Reading Numbers
int number = scanner.nextInt();        // Reads integer
double decimal = scanner.nextDouble(); // Reads decimal number
float price = scanner.nextFloat();     // Reads float number

// Reading Character
char character = scanner.next().charAt(0); // Reads single character
```
