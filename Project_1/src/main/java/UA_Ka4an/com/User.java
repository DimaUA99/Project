package UA_Ka4an.com;


public class User {
    private long id;
    private String name;
    private int age;
    private Object login;
    private Object password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getLogin() {
        return (Object) login;
    }

    public void setLogin(Object login) {
        this.login = login;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }
}

