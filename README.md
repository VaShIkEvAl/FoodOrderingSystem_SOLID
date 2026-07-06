# Food Ordering System

## Overview

This repository demonstrates the difference between a **Bad Design** and a **Good Design** of a Food Ordering System using the **SOLID Principles**.

The project consists of two implementations:

- **Bad Design** – A tightly coupled implementation that violates multiple SOLID principles.
- **Good Design** – A modular, extensible implementation that follows all five SOLID principles.

The purpose of this project is to understand how applying SOLID principles improves code quality, maintainability, scalability, and flexibility.

---

# Bad Design

## Features

- Place food orders
- Credit Card payment
- UPI payment
- Delivery/PickUp orders
- Email notification
- SMS notification

---

## Problems in Bad Design

### 1. Single Responsibility Principle (SRP) Violation

The `FoodOrderingSystem` class performs multiple responsibilities:

- Managing orders
- Processing payments
- Handling delivery
- Sending notifications
- Storing orders

A single class should have only one responsibility.

---

### 2. Open/Closed Principle (OCP) Violation

Whenever a new payment method is introduced (e.g., Wallet Payment), the existing `FoodOrderingSystem` class must be modified.

Similarly, introducing a new delivery type or notification method requires modifying existing methods.

---

### 3. Liskov Substitution Principle (LSP) Violation

The system directly depends on concrete implementations and string comparisons instead of interchangeable objects.

---

### 4. Interface Segregation Principle (ISP) Violation

There are no interfaces for payment, delivery, or notification.

The system is tightly coupled with specific implementations.

---

### 5. Dependency Inversion Principle (DIP) Violation

`FoodOrderingSystem` directly depends on concrete methods such as:

- Credit Card Payment
- UPI Payment
- Email Notification
- SMS Notification

instead of depending on abstractions.

---

## Other Limitations

- High coupling
- Code duplication
- Hard-coded string comparisons
- Difficult to maintain
- Difficult to extend
- Poor scalability
- Low reusability

---

# Good Design

The Good Design overcomes all the above limitations by following the SOLID Principles.

---

## Improvements

### ✅ Single Responsibility Principle (SRP)

Responsibilities are separated into independent classes.

- `Order` → Stores order information
- `PaymentService` → Handles payment
- `DeliveryType` → Handles delivery
- `NotificationService` → Sends notifications
- `FoodOrderingSystem` → Coordinates the ordering process

Each class has only one responsibility.

---

### ✅ Open/Closed Principle (OCP)

The system is open for extension but closed for modification.

New features can be added simply by creating new classes.

Examples:

- `WalletPayment implements PaymentService`
- `DroneDelivery implements DeliveryType`
- `WhatsAppNotification implements NotificationService`

No modification is required in `FoodOrderingSystem`.

---

### ✅ Liskov Substitution Principle (LSP)

Every implementation can replace its interface without affecting the system.

Examples:

- `UPIPayment`
- `CreditCardPayment`
- `WalletPayment`

all implement

```java
PaymentService
```

Similarly,

- `HomeDelivery`
- `PickupDelivery`
- `DroneDelivery`

can all be used wherever `DeliveryType` is expected.

---

### ✅ Interface Segregation Principle (ISP)

The system provides small and focused interfaces:

- `PaymentService`
- `DeliveryType`
- `NotificationService`

Each class implements only the interface it actually needs.

---

### ✅ Dependency Inversion Principle (DIP)

`FoodOrderingSystem` depends on abstractions rather than concrete implementations.

Instead of creating payment or notification objects internally, they are supplied through interfaces.

This makes the system loosely coupled and highly flexible.

---

# Advantages of Good Design

- Loosely coupled architecture
- Highly maintainable
- Easy to extend
- Easy to test
- Improved code readability
- Better scalability
- Reusable components
- Eliminates duplicate code
- Supports future enhancements without modifying existing code

---

# Comparison

| Feature | Bad Design | Good Design |
|----------|------------|-------------|
| SRP | ❌ Violated | ✅ Followed |
| OCP | ❌ Requires modifying existing code | ✅ Add new classes without modification |
| LSP | ❌ Uses concrete implementations | ✅ Uses interchangeable implementations |
| ISP | ❌ No interfaces | ✅ Small, focused interfaces |
| DIP | ❌ Depends on concrete classes | ✅ Depends on abstractions |
| Coupling | High | Low |
| Extensibility | Poor | Excellent |
| Maintainability | Difficult | Easy |
| Scalability | Low | High |
| Code Reusability | Low | High |

---

# Technologies Used

- Java
- Object-Oriented Programming (OOP)
- SOLID Principles

---

# Conclusion

The **Bad Design** implementation demonstrates how tightly coupled code becomes difficult to maintain and extend as requirements evolve.

The **Good Design** applies all five SOLID principles to create a modular, loosely coupled, and extensible architecture. New payment methods, delivery types, and notification channels can be introduced by simply implementing the appropriate interfaces, without modifying existing code. This results in cleaner, more maintainable, and scalable software.
