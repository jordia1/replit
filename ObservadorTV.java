import java.util.Observable;
import java.util.Observer;

public class ObservadorTV implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("Difusión en canales de TV: " + arg);
    }
}
