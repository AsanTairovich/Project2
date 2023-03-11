package productStore.product;

public class Manager {
    public static final String login = "tairovasan11@gmail.com";
    public static final String password = "asan24101999";

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "productStore.product.Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
