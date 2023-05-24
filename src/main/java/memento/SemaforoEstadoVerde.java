package memento;

public class SemaforoEstadoVerde extends SemaforoEstado {

    private SemaforoEstadoVerde() {};
    private static final SemaforoEstadoVerde instance = new SemaforoEstadoVerde();
    public static SemaforoEstadoVerde getInstance() {
        return instance;
    }

    public boolean ficarAmarelo(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        return true;
    }
}
