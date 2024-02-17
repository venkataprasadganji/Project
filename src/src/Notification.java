package src;


import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class Notification {
    private String notificationId;             
    private String userId;                     
    private String message;                    
    private LocalDate timestamp;


    public Notification(String notificationId, String userId, String message, LocalDate timestamp) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.timestamp = timestamp;
    }

    public void sendNotification(){
        System.out.println("Sending Notification to the user: "+ userId + "\nmessage: "+ message);
        try {
            TimeUnit.SECONDS.sleep(5);
            System.out.println("....\nNotification sent succesful!!");
        } catch (InterruptedException e) {
            System.out.println("....\nError Sending notification!!");
            e.printStackTrace();
        }
    }
}
