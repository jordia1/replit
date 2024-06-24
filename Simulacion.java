public class Simulacion {
    public static void main(String[] args) {
        Noticias noticias = new Noticias();
        ObservadorWeb web = new ObservadorWeb();
        ObservadorApp app = new ObservadorApp();
        ObservadorTV tv = new ObservadorTV();

        noticias.addObserver(web);
        noticias.addObserver(app);
        noticias.addObserver(tv);

        // Simulación de actualización de noticias
        noticias.actualizar("¡Nueva noticia publicada!");

        // Cada observador debería haber recibido la notificación y haber realizado su acción correspondiente
    }
}