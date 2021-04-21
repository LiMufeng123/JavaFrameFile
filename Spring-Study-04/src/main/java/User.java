public class User {
    public User(){
        System.out.println("USer的无参构造");
    }

    public User(String name) {
        this.name = name;
        System.out.println("有参构造被调用了");
    }

    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
