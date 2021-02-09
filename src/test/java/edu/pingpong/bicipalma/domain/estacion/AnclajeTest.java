package edu.pingpong.bicipalma.domain.estacion;

import org.junit.Before;
import org.junit.Test;
import edu.pingpong.bicipalma.domain.bicicleta.Bicicleta;
import edu.pingpong.bicipalma.domain.bicicleta.Movil;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnclajeTest {
    private Movil bicicleta = null;
    private Anclaje anclaje = null;

    @Before
    public void setupAnclaje() {
        this.bicicleta = new Bicicleta(100);
        this.anclaje = new Anclaje(true, this.bicicleta);
        assertNotNull(bicicleta);
        assertNotNull(anclaje);
    }

    @Test
    public void isOcupadoTest() {
        assertEquals(true, this.anclaje.isOcupado());
    }

    @Test
    public void getBiciTest() {
        assertEquals(100, this.anclaje.getBici().getId());
    }

    @Test
    public void liberarBiciTest() {
        this.anclaje.liberarBici();
        assertFalse(this.anclaje.isOcupado());
    }

    @Test
    public void anclarBiciTest() {
        Bicicleta bicicleta = new Bicicleta(10);
        this.anclaje.anclarBici(bicicleta);
        assertTrue(this.anclaje.isOcupado());
        assertEquals(10, this.anclaje.getBici().getId());
    }

}
