import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

    private String login;
    private String password;
    private Basket basket;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void inputLogPass() {

        try {
            System.out.println("Введите логин");
            this.login = reader.readLine();
            System.out.println("Введите пароль");
            this.password = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public Basket chooseProducts(Product product) {

        Product[] products = {product};
        this.basket = new Basket(products);
        return basket;
    }
}
