package data;

/**
 * Created by User on 17.11.2015.
 */
public class UserData {
    private String login;
    private String email;

    public UserData (String login){
        this.login = login;
        this.email = login + "@gmail.com";
    }

    public String getLogin(){
        return login;
    }
}
