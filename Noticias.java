import java.util.Observable;

public class Noticias extends Observable {
    public void actualizar(String noticia) {
        setChanged();
        notifyObservers(noticia);
    }
}

