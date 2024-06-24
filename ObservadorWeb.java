import java.util.Observable;
import java.util.Observer;

public class ObservadorWeb implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("Actualización en la página web: " + arg);
    }
}
