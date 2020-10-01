package escuelaing.edu.ieti.taskplanner.model;

public class User{
    private String id;
    private String name;
    private String mail;

    public User(String id, String name, String mail){
        this.id=id;
        this.name=name;
        this.mail=mail;
    }

    public String getUserId(){
        return id;
    }

    public void setUserId(String id){
        this.id=id;
    }

    public String getUserName(){
        return name;
    }

    public void setUserName(){
        this.name=name;
    }

    public String getUserMail(){
        return mail;
    }

    public void setUserMail(){
        this.mail=mail;
    }
}