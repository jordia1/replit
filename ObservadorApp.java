import java.util.Observable;
import java.util.Observer;

public class ObservadorApp implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("Notificación en la app móvil: " + arg);
    }
}
