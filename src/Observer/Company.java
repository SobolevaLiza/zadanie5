package Observer;

public interface Company {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendMessage(String action);
}
