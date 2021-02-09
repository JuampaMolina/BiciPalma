package edu.pingpong.bicipalma.domain.estacion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class EstacionTest {

    private Estacion estacion = null;

    @Before
    public void setup_estacion() {
        this.estacion = new Estacion(4, "Palma", 10);
    }

    @Test
    public void constructorTest() {
        assertNotNull(this.estacion);
    }

    @Test
    public void getDirecionTest() {
        assertEquals("Palma", this.estacion.getDireccion());
    }

    @Test
    public void anclajesLibresTest() {
        assertEquals( 10, this.estacion.anclajesLibres());
    }

    @Test
    public void getIdTest() {
        assertEquals(4, this.estacion.getId());
    }
}