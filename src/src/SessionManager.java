package src;

public class SessionManager {
    private static SessionManager single_instance = null;
    
    // Declaring a variable of type String
    public User loggedInUser;
 
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private SessionManager(){}
 

    public void register(User user){
        this.loggedInUser = user;
    }
    public void login(User user){
        this.loggedInUser = user;
    }
    public void logout(User user){
        this.loggedInUser = null;
    }

    public boolean isLoggedIn(){
        return loggedInUser != null;
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized SessionManager getInstance()
    {
        if (single_instance == null)
            single_instance = new SessionManager();

        return single_instance;
    }

}
