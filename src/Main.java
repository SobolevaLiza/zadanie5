import Observer.CompanyGroup;
import Observer.User;

public class Main {
    public static void main(String[] args) {
        CompanyGroup amazon = new CompanyGroup();
        CompanyGroup google = new CompanyGroup();

        User user1 = new User("Павел");
        User user2 = new User("Иван");
        User user3 = new User("Олег");

        amazon.addObserver(user1);
        amazon.addObserver(user2);
        amazon.addObserver(user3);
        google.addObserver(user1);
        google.addObserver(user2);
        amazon.removeObserver(user1);

        amazon.sendMessage("акции amazon растут");
        google.sendMessage("акции google растут");
    }
}
