package memento;

import java.util.ArrayList;
import java.util.List;

public class Semaforo {

    private SemaforoEstado estado;
    private List<SemaforoEstado> memento = new ArrayList<>();

    public Semaforo() {
        this.estado = SemaforoEstadoVerde.getInstance();
        this.memento.add(this.estado);
    }

    public void setEstado(SemaforoEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<SemaforoEstado> getEstados() {
        return this.memento;
    }

    public boolean ficarVerde() {
        return estado.ficarVerde(this);
    }

    public boolean ficarAmarelo() {
        return estado.ficarAmarelo(this);
    }

    public boolean ficarVermelho() {
        return estado.ficarVermelho(this);
    }

    public SemaforoEstado getEstado() {
        return estado;
    }
}