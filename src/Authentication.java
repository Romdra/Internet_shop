import java.io.*;

public class Authentication {

    private String login;
    private String password;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void inputLog() {

        try {
            System.out.println("Введите логин");
            this.login = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void inputPassword() {

        try {
            System.out.println("Введите пароль");
            this.password = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
