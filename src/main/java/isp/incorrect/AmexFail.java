package isp.incorrect;

public class AmexFail implements PaymentFail{

    public void calculatePayment() {
        // Correcto
    }

    public void creditCardPayment() {
        // Correcto
    }

    public void bankTransferPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

    public void cashPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

}
