package Task2;

public class User {
    private String name;
    private Integer age;
    private Double height;
    private String group;
    private String password;
    private String email;

    public User(String name, Integer age, Double height, String group, String password, String email){
        this.name = name;
        this.age = age;
        this.height = height;
        this.group = group;
        this.password  = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if(height>0) {
            this.height = height;
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
