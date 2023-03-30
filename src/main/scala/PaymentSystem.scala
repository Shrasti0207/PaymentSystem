
package com.knoldus

trait PaymentMethod {
  def paymentProcess(amount: Double): Boolean
}

// Credit card payment method
case class CreditCardPayment(cardNumber: String, cardholderName: String, expirationDate: String, cvv: String) extends PaymentMethod {
  override def paymentProcess(amount: Double): Boolean = {
    true // Implement credit card payment
  }
}

// PayPal payment method
case class PayPalPayment(email: String, password: String) extends PaymentMethod {
  override def paymentProcess(amount: Double): Boolean = {
    true // Implement Paypal Payment
  }
}

// Bank transfer payment method
case class BankTransferPayment(accountNumber: String, routingNumber: String) extends PaymentMethod {
  override def paymentProcess(amount: Double): Boolean = {
    true // Implement Bank transfer Payment
  }
}

// Payment processor class
case class PaymentProcessor(paymentMethods: List[PaymentMethod] = List.empty) {
  def paymentProcess(amount: Double): Boolean = {
    //  Processing the payment with each payment method
    paymentMethods.exists(_.paymentProcess(amount))
  }

  def listPaymentMethods(): List[PaymentMethod] = {
    paymentMethods
  }
}