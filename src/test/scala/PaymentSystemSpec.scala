
package com.knoldus
import org.scalatest.funsuite.AnyFunSuite
class PaymentSystemSpec extends AnyFunSuite{

  test("PaymentProcessor should process payment with one payment method") {
    val creditCard = CreditCardPayment("1234 5678 9012 3456", "Shrasti Gupta", "12/24", "123")
    val paymentProcessor = PaymentProcessor(List(creditCard))
    assert(paymentProcessor.paymentProcess(100.0))
  }
  test("PayPalPayment should return true for paymentProcess") {
    val paypal = PayPalPayment("shrasti.gupta@example.com", "password123")
    assert(paypal.paymentProcess(100.0))
  }

  test("BankTransferPayment should return true for paymentProcess") {
    val bankTransfer = BankTransferPayment("123456789", "987654321")
    assert(bankTransfer.paymentProcess(100.0))
  }

  test("PaymentProcessor should list all payment methods") {
    val creditCard = CreditCardPayment("1234 5678 9012 3456", "Shrasti Gupta", "12/24", "123")
    val paypal = PayPalPayment("shrasti.gupta@example.com", "password123")
    val bankTransfer = BankTransferPayment("123456789", "987654321")
    val paymentProcessor = PaymentProcessor(List(creditCard, paypal, bankTransfer))
    assert(paymentProcessor.listPaymentMethods() == List(creditCard, paypal, bankTransfer))
    assert(paymentProcessor.paymentProcess(100.0))
  }
}
