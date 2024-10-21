package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTest {
	@Test
    void testGetNombre() {
        Empleado empleado = new Empleado("Juan", 2000);
        assertEquals("Juan", empleado.getNombre());
    }

    @Test
    void testGetSalario() {
        Empleado empleado = new Empleado("Juan", 2000);
        assertEquals(2000, empleado.getSalario());
    }
}

