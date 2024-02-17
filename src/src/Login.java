package src;

public class Login {
    private String email;
    private String password;

    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public void login(){}
    
    public void register(String firstName, String lastName, String email, String phone){
        User user = new User(firstName, lastName, email, phone, null, true);
        SessionManager.getInstance().register(user);
        System.out.println("User registered succesfully.");
  }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
