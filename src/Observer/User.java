package Observer;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String action) {
        System.out.println(name + " уведомление об акции: " + action);
    }
}
