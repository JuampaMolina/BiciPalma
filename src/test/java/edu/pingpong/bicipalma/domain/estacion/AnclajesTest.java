package edu.pingpong.bicipalma.domain.estacion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class AnclajesTest {
    private Anclajes[] anclajes = null;

    @Before
    public void setupAnclajes() {
        anclajes = new Anclajes[5];
        assertNotNull(anclajes);
    }

    @Test
    public void sizeAnclajesTest() {
        assertEquals( 5, anclajes.length);
    }
}
