package isp.incorrect;

public class CashPaymentFail implements PaymentFail {

    public void calculatePayment() {
        // Correcto
    }

    public void creditCardPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

    public void bankTransferPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

    public void cashPayment() {
        // Correcto
    }
}
