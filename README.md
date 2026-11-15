# Java-Inheritance-Example-Person-and-Teacher-# Java Inheritance Example (Person and Teacher)

A small Java program that demonstrates **inheritance**: `Teacher` extends `Person`, so a teacher can do everything a person can, plus more.

## What It Demonstrates

```java
class Person {
    void speak() {
        System.out.println("Person can speak");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher can teach");
    }
}
```

- `Teacher` inherits `speak()` from `Person` without redefining it
- `Teacher` adds its own method `teach()`
- A `Teacher` object can call both

## Output

```
Person can speak
Teacher can teach
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac InheritanceTest.java
java InheritanceTest
```

## Project Structure

```
.
├── InheritanceTest.java
└── README.md
```

## Next Steps

- Add fields such as `name` and `age` to `Person`
- Override `speak()` in `Teacher`
- Add another child class such as `Student`
