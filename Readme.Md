## Payment System
<br>
Payment System is a Scala program that implements a simple payment processing system. It contains three different payment methods, including Credit Card, PayPal, and Bank Transfer.
The PaymentMethod trait provides a paymentProcess method that needs to be implemented in each of the payment methods.
<br>
CreditCardPayment: This class represents a credit card payment method. It has the following parameters: cardNumber, cardholderName, expirationDate, and cvv. The paymentProcess method is implemented to return true.<br>
PayPalPayment: This class represents a PayPal payment method. It has the following parameters: email and password. The paymentProcess method is implemented to return true.<br>
BankTransferPayment: This class represents a bank transfer payment method. It has the following parameters: accountNumber and routingNumber. The paymentProcess method is implemented to return true.<br>
The PaymentProcessor class contains a list of payment methods and provides methods for processing payments and listing payment methods.
paymentProcess: This method takes an amount as a parameter and returns true if the payment is processed successfully. It processes the payment with each payment method in the list.<br>
listPaymentMethods: This method returns a list of payment methods.