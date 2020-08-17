package isp.incorrect;

public class BankTransferFail implements PaymentFail{

    public void calculatePayment() {
        //Correcto
    }

    public void creditCardPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

    public void bankTransferPayment() {
        //Corecto
    }

    public void cashPayment() {
        //Este no tiene ninguna funcionalidad en este caso
    }

}
