---
# Project Basic Information
title: "Card Payment Service with Design Patterns"
description: "A robust payment processing system implementing Strategy and Factory patterns in Spring Boot, showcasing advanced design pattern implementations"
showcase: true
order: 5

# Technologies
technologies:
  - "Java"
  - "Spring Boot"
  - "Design Patterns"
  - "REST API"
  - "Maven"

# Features
features:
  - "Strategy Pattern Implementation"
  - "Factory Pattern Implementation"
  - "Flexible Payment Processing"
  - "Extensible Architecture"
  - "Clean Code Principles"
---

# Card Payment Service using Strategy and Factory Design Patterns
This project demonstrates a card payment service built with Java and Spring Boot, utilizing both the Strategy and Factory design patterns to enhance flexibility and maintainability.

---

## Overview
The card payment service is designed to handle various types of card payments such as credit cards, debit cards, etc. By employing the Strategy pattern, we can define a family of algorithms, encapsulate each one, and make them interchangeable. The Factory pattern is used to create instances of these strategies at runtime, promoting loose coupling between the client and the strategies.

---

## Design Patterns Used
### Strategy Pattern
The Strategy pattern is used to define a set of payment algorithms, each implementing a common interface. This allows the service to choose the appropriate algorithm at runtime based on the type of card being used.

- [CardPaymentStrategy](src%2Fmain%2Fjava%2Fcom%2Fmemrevatan%2Fstrategyfactorypattern%2Fservice%2Fstrategy%2FCardPaymentStrategy.java) Interface: Defines a common interface for all payment algorithms.
- [CardPaymentContext](src%2Fmain%2Fjava%2Fcom%2Fmemrevatan%2Fstrategyfactorypattern%2Fservice%2Fstrategy%2FCardPaymentContext.java): Implements the payment algorithm for credit cards.
### Factory Pattern
The Factory pattern is employed to instantiate the appropriate payment strategy based on the type of card. This promotes the Open/Closed Principle, allowing new payment strategies to be added without modifying existing code.

- [CardPaymentFactory](src%2Fmain%2Fjava%2Fcom%2Fmemrevatan%2Fstrategyfactorypattern%2Fservice%2Ffactory%2FCardPaymentFactory.java): Contains logic to create instances of payment strategies based on the card type.

---

## How to Run
* Clone the repository.
* Navigate to the project directory.
* Build the project using Maven: mvn clean install.
* Run the application: mvn spring-boot:run.
* Use Postman or any other API client to make a POST request to /api/payment with type parameter.

---

## Conclusion
By combining the Strategy and Factory design patterns, this card payment service is both flexible and scalable. New payment methods can be added easily without affecting existing code, adhering to the principles of solid software design.

