package clases;

public class Admin {
     private static Admin instance;
    private String name;
    private int user;
    private String password;

    //private Employee() {
    //}

    private Admin() {
    }
    

    private Admin(String name, int user, String password) {
        this.name = name;
        this.user = user;
        this.password = password;
    }
    
    public static Admin getInstance(){
        if(instance == null){
            instance = new Admin();
        }
        return instance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setUser(int user){
        this.user = user;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getName(){
        return name;
    }
    
    public int getUser(){
        return user;
    }
    
    public String getPassword(){
        return password;
    }
    
}
