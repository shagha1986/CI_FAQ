
public class User {
    private String name, email;
    private int id;
    public User(){}
    public User(int id, String name, String email){
        super();
        this.id = id;
        this.name = name;
        this.email = email;

    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " Email: " + email;
    }
}
