package memento;

public class SemaforoEstadoVermelho extends SemaforoEstado {

    private SemaforoEstadoVermelho() {};
    private static final SemaforoEstadoVermelho instance = new SemaforoEstadoVermelho();
    public static SemaforoEstadoVermelho getInstance() {
        return instance;
    }

    public boolean ficarAmarelo(Semaforo semaforo) {
        semaforo.setEstado(SemaforoEstadoAmarelo.getInstance());
        return true;
    }
}
