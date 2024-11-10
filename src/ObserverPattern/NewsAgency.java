package ObserverPattern;

public class NewsAgency implements Observer {

    private String name;

    public NewsAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received weather update: " + message);
    }
}
