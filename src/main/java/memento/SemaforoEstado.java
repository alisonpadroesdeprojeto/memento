package memento;

public abstract class SemaforoEstado {

    public boolean ficarVerde(Semaforo semaforo) {
        return false;
    }

    public boolean ficarAmarelo(Semaforo semaforo) {
        return false;
    }

    public boolean ficarVermelho(Semaforo semaforo) {
        return false;
    }
}
