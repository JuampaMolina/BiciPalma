package edu.pingpong.bicipalma.domain.tarjetausuario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class TarjetaUsuarioTest {
    private TarjetaUsuario tarjetaUsuario = null;

    @Before
    public void setupTarjetaUsuarioTest() {
        this.tarjetaUsuario = new TarjetaUsuario("123456789", false);
        assertNotNull(this.tarjetaUsuario);
    }

    @Test
    public void isActivadaTest() {
        assertEquals(false, this.tarjetaUsuario.isActivada());
    }

    @Test
    public void setActivadaTest() {
        this.tarjetaUsuario.setActivada(true);
        assertEquals(true, this.tarjetaUsuario.isActivada());
    }
}
