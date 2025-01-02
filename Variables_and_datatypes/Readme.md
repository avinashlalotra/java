## Variables
Variable is a container that holds data to be used in the program. 
In Java, variables:
    `-` Must be declared before use
    `-` Have a specific data type
    `-` Can be assigned and reassigned values
```java
int age;          
Bool isTrue ;
String name ;
```
## Naming Convention
Allowed Characters:
```
Letters (a-z, A-Z)
Numbers (0-9)
Underscore (_)
Dollar sign ($)
```
```java
int _count;    // valid but not recommended
int $price;    // valid but not recommended
int user123;   // valid
int 123age;    // cannot start with number
int my-score;  // hyphen not allowed
int void;      // cannot use reserved keywords
```

## Initialization and Declaration
```java
//  typename variableName ; // Declaration
int age ;
String name ;
double height ;

// variablname = Value ;  // Initialization
age = 25
name = "java";
height = 1.5 ;

// Declaration and Initalization Together;

int x = 1, y = 2, z = 3;  // multiple initialization
double distance, weight;     // multiple declaration
```
`Note` : Default values
```java
class Example {
    int number;       // default 0
    boolean flag;     // default false
    String text;      // default null
}
```

## Data types

1.Primitive Data Types:
```java
// Integer Types
byte b = 127;            // 8-bit  (-128 to 127)
short s = 32767;         // 16-bit (-32,768 to 32,767)
int i = 2147483647;      // 32-bit (-2^31 to 2^31-1)
long l = 9223372036854775807L; // 64-bit (-2^63 to 2^63-1)

// Floating Point Types
float f = 3.14f;         // 32-bit single-precision
double d = 3.14159;      // 64-bit double-precision

// Other Types
char c = 'A';            // 16-bit Unicode character
boolean bool = true;     // true or false
```
2. Other data types
```java
String name = "John";    // String class
Integer num = 100;       // Integer wrapper class
Double price = 99.99;    // Double wrapper class

// Arrays
int[] numbers = new int[5];
String[] names = {"John", "Jane", "Bob"};

// Objects
Scanner input = new Scanner(System.in);
Date today = new Date();
```


