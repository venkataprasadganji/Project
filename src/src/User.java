package src;


public class User {

    private String firstName;
    private String lastName;
    public String email;
    private String phone;
    private String profileImage;
    private Boolean enabled;


    public User(String firstName, String lastName, String email, String phone, String profileImage, Boolean enabled) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.profileImage = profileImage;
        this.enabled = enabled;
    }




  public void updateProfile(String firstName, String lastName, String email, String phone, String profileImage) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.profileImage = profileImage;
  }

  public void addImage(String imageUrl){
    profileImage = imageUrl;
  }
  public User viewProfile(){
        return this;
  }

  public void managePayments(){}
  public void receiveNotifications(){}
  public void requestAssistance(){}
  public void manageOrders(){}
  public void trackOrder(){}
  public void browseVehicleCatalog(){}
  public void selectVariant(){}
  public void viewPricing(){}
  public void reserveVehicle(){}
  public void purchaseVehicle(){}
  public void cancelReservation(){}
}
