

# Switch Pattern Matching

## Overview

Switch Pattern Matching modernizes traditional switch statements by allowing type patterns directly inside switch cases.

Benefits:

- Less Boilerplate
- Better Readability
- Stronger Type Safety
- Cleaner Branching Logic

## Traditional Switch

Before modern Java:

```java
String status = "SUCCESS";

switch (status) {
    case "SUCCESS":
        System.out.println("Processed");
        break;
    case "FAILED":
        System.out.println("Rejected");
        break;
    default:
        System.out.println("Unknown");
}
```

## Modern Switch Expression

```java
String result = switch (status) {
    case "SUCCESS" -> "Processed";
    case "FAILED" -> "Rejected";
    default -> "Unknown";
};
```

Benefits:

- No break Statements
- Returns Values Directly
- Cleaner Syntax

## Pattern Matching In Switch

```java
Object value = "Java 17";

String result = switch (value) {
    case String text -> text.toUpperCase();
    default -> "Unsupported";
};
```

Flow:

```text
Object
   ↓
Type Match
   ↓
Pattern Variable
   ↓
Business Logic
```

## Multiple Types Example

```java
Object input = 100;

String result = switch (input) {
    case String text -> "String: " + text;
    case Integer number -> "Number: " + number;
    case Long value -> "Long: " + value;
    default -> "Unknown";
};
```

## Sealed Classes With Switch

```java
sealed interface Payment
        permits CardPayment, UpiPayment {
}
```

```java
String process(Payment payment) {
    return switch (payment) {
        case CardPayment card -> "Card Payment";
        case UpiPayment upi -> "UPI Payment";
    };
}
```

Benefits:

- Exhaustive Checking
- Better Domain Modeling
- Safer Business Logic

## Records With Switch

```java
record CardPayment(String cardNumber)
        implements Payment {
}
```

```java
switch (payment) {
    case CardPayment card ->
            System.out.println(card.cardNumber());
    default -> {
    }
}
```

## Traditional Switch vs Pattern Matching Switch

| Traditional Switch | Pattern Matching Switch |
| ------------------ | ---------------------- |
| Manual Casting | Automatic Pattern Variable |
| More Boilerplate | Less Boilerplate |
| Limited Type Support | Type-Based Matching |
| Harder Maintenance | Cleaner Design |

## Production Use Cases

### Event Processing

```java
switch (event) {
    case OrderCreatedEvent e -> processOrder(e);
    case PaymentCompletedEvent e -> processPayment(e);
    default -> handleUnknown();
}
```

### Message Processing

```java
switch (message) {
    case EmailMessage email -> sendEmail(email);
    case SmsMessage sms -> sendSms(sms);
    default -> logUnknown();
}
```

## Most Asked Interview Questions

1. What is Switch Pattern Matching?
2. How is it different from traditional switch?
3. What are switch expressions?
4. What are the benefits?
5. How does it work with Sealed Classes?
6. What is exhaustive checking?
7. Where is it useful in production systems?

## Quick Revision

### Priority

⭐⭐⭐⭐ High Priority

### Remember

- Switch expressions return values.
- Pattern Matching removes manual casting.
- Works well with Records.
- Works exceptionally well with Sealed Classes.
- Supports exhaustive checking.
- Improves readability and maintainability.
- Common Java 17 interview topic.