package edu.pingpong.bicipalma.domain.estacion;

import edu.pingpong.bicipalma.domain.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;
    private Movil bici = null;

    // Mantenemos el constructor por defecto
    public Anclaje() {
    }

    // Constructor necesario para los casos test
    public Anclaje(boolean ocupado, Movil bici) {
        this.ocupado = ocupado;
        this.bici = bici;
    }

    boolean isOcupado() {
        return this.ocupado;
    }

    Movil getBici() {
        return this.bici;
    }

    void anclarBici(Movil bici) {
        this.ocupado = true;
        this.bici = bici;
    }

    void liberarBici() {
        this.ocupado = false;
        this.bici = null;
    }

    @Override
    public String toString() {
        return "ocupado: " + isOcupado();
    }
}
