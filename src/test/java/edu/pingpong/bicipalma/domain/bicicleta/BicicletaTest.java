package edu.pingpong.bicipalma.domain.bicicleta;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class BicicletaTest {
    private Bicicleta bicicleta;

    @Before
    public void setupBicicletaTest() {
        this.bicicleta = new Bicicleta(3);
        assertNotNull(this.bicicleta);
    }

    @Test
    public void getIdTest() {
        assertEquals(3, this.bicicleta.getId());
    }


}
