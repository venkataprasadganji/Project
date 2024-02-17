package src;


import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class Payment {
    private String paymentId;
    private String orderId;
    private double amount;
    private LocalDate paymentDate;

    public Payment(String paymentId, String orderId, double amount, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public void processPayment(){
        System.out.println("Processing Payment.... Please wait...");
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("Process finished.... Payment succesful!!");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Payment failed!!");
            e.printStackTrace();
        }
    }
}
