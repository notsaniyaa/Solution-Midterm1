# OnlinePaymentGateway

## Project Overview
OnlinePaymentGateway is a simple payment platform that supports multiple payment methods such as Credit Card, PayPal, and Cryptocurrency. The project demonstrates the use of **Factory Method** and **Adapter** design patterns.

## Design Patterns Used
### 1. Factory Method Pattern
- Encapsulates the creation of different payment methods.
- The `PaymentFactory` class determines which payment method to instantiate.
- Each payment class (`CreditCardPayment`, `PayPalPayment`, `CryptoPayment`) implements the `PaymentMethod` interface.

### 2. Adapter Pattern
- Integrates an external mock API (`ExternalPaymentAPI.java`).
- `PaymentAdapter` acts as an adapter, ensuring that the external API conforms to the `PaymentMethod` interface.

## Project Structure
```
OnlinePaymentGateway/
│── src/
│   ├── main/
│   │   ├── payment/
│   │   │   ├── PaymentMethod.java
│   │   │   ├── CreditCardPayment.java
│   │   │   ├── PayPalPayment.java
│   │   │   ├── CryptoPayment.java
│   │   │   ├── PaymentFactory.java
│   │   ├── adapter/
│   │   │   ├── ExternalPaymentAPI.java  # Mock external API
│   │   │   ├── PaymentAdapter.java
│   │   ├── transaction/
│   │   │   ├── Transaction.java
│   │   │   ├── TransactionLogger.java
│   │   ├── ui/
│   │   │   ├── OnlinePaymentGateway.java  # Main class (demo)
│── README.md
```

## How the Code Works
1. **User selects a payment method** (e.g., Credit Card, PayPal, or Crypto).
2. `PaymentFactory` creates the appropriate payment object.
3. The selected payment method processes the payment using `processPayment(amount)`.
4. If the method requires external API integration, `PaymentAdapter` interacts with `ExternalPaymentAPI`.
5. The transaction status (pending, completed, failed) is logged in `TransactionLogger`.

## Running the Project
![image](https://github.com/user-attachments/assets/1c5948a4-9487-4844-9ca5-f9b57e7cdcd6)

---



# CoffeeShopSimulator

## Project Overview
CoffeeShopSimulator is a simple coffee ordering system that demonstrates the use of **Factory Method** and **Decorator** design patterns.

## Design Patterns Used
### 1. Factory Method Pattern
- Used to create different types of coffee (`Americano`, `Cappuccino`, `Espresso`, `Latte`).
- The `CoffeeFactory` class is responsible for instantiating the correct coffee type.

### 2. Decorator Pattern
- Allows dynamic addition of ingredients (milk, caramel, chocolate, whipped cream).
- `CoffeeDecorator` acts as a base class for all additional ingredients.

## Project Structure
```
CoffeeShopSimulator/
│── src/
│   ├── Coffee/                    # Interface and factory
│   │   ├── Coffee.java
│   │   ├── CoffeeFactory.java
│   ├── CoffeeTypes/               # Different types of coffee
│   │   ├── Americano.java
│   │   ├── Cappuccino.java
│   │   ├── Espresso.java
│   │   ├── Latte.java
│   ├── Decorators/                # Add-ons (decorators)
│   │   ├── CoffeeDecorator.java
│   │   ├── CaramelDecorator.java
│   │   ├── ChocolateDecorator.java
│   │   ├── MilkDecorator.java
│   │   ├── WhippedCreamDecorator.java
│   ├── CoffeeShop.java             # Main class for demonstration
│── README.md
```

## How the Code Works
1. **User selects a base coffee type** (e.g., Espresso, Latte, Americano, Cappuccino).
2. `CoffeeFactory` creates the selected coffee object.
3. The user can add extra ingredients (milk, caramel, chocolate, whipped cream).
4. Each decorator modifies the coffee’s description and cost dynamically.
5. The final coffee order is displayed with its total cost.

## Running the Project
![image](https://github.com/user-attachments/assets/080c77a1-aa25-4fe3-be69-e3c1e5026fe0)


---



