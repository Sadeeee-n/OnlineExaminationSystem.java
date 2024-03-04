import java.util.Scanner;

// Class representing a user
class User 
{
    private String username;
    private String password;
    private String profile;

    public User(String username, String password, String profile) 
    {
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    // Getter methods
    public String getUsername() 
    {
        return username;
    }

    public String getPassword() 
    {
        return password;
    }

    public String getProfile() 
    {
        return profile;
    }

    // Setter methods
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public void setProfile(String profile) 
    {
        this.profile = profile;
    }
}

// Class representing the online examination system
public class OnlineExaminationSystem 
{
    private User currentUser;
    private Scanner scanner;

    public OnlineExaminationSystem() 
    {
        this.scanner = new Scanner(System.in);
    }

    // Method to login
    public void login(String username, String password) 
    {
        // Implement your login logic here, like checking credentials from a database
        // For simplicity, just using hardcoded credentials
        if (username.equals("username") && password.equals("user321"))
        {
            currentUser = new User(username, password, "username");
            System.out.println("Your login was successful!");
        } else 
        {
            System.out.println("Invalid username or password!");
        }
    }

    // Method to update profile and password
    public void updateProfile(String username, String newPassword) 
    {
        // Implement your profile update logic here
        if (currentUser != null && currentUser.getUsername().equals(username)) 
        {
            currentUser.setPassword(newPassword);
            System.out.println("Your profile was successfully updated!");
        } else 
        {
            System.out.println("User not found");
        }
    }

    // Method to select answers for MCQs
    public void selectAnswers() 
    {
        // Implement MCQ selection logic here
        // This can involve presenting questions to the user and taking input for answers
    }

    // Method to start timer and auto-submit
    public void startTimerAndAutoSubmit() 
    {
        // Implement timer logic here
        // You can use TimerTask or similar mechanisms to implement the timer
        // Auto-submit can be done when the timer expires
    }

    // Method to close session and logout
    public void logout() 
    {
        currentUser = null;
        System.out.println("Logout successful!");
    }

    // Main method
    public static void main(String[] args) 
    {
        OnlineExaminationSystem system = new OnlineExaminationSystem();
        // Example usage
        system.login("username", "user321");
        system.updateProfile("username", "newPassword");
        // Other functionalities can be called similarly
        system.logout();
    }
}
