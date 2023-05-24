package memento;

public class SemaforoEstadoAmarelo extends SemaforoEstado {

    private SemaforoEstadoAmarelo() {};
    private static final SemaforoEstadoAmarelo instance = new SemaforoEstadoAmarelo();
    public static SemaforoEstadoAmarelo getInstance() {
        return instance;
    }

    public boolean ficarVerde(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoVerde.getInstance());
        return true;
    }

    public boolean ficarVermelho(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoVermelho.getInstance());
        return true;
    }
}
