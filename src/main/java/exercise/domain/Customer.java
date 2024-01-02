package exercise.domain;

public class Customer {

    private String email;
    private String name;
    private String userId;

    public Customer(String email, String name, String userId) {
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
