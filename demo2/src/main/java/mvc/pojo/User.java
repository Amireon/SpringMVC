package mvc.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;

    public User() {

    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
