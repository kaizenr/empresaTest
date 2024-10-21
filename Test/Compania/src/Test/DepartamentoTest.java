package Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;


class DepartamentoTest {

	private Departamento departamento;
	private Empleado empleado1;
	private Empleado empleado2;

	@BeforeEach
	void setUp() {
		departamento = new Departamento("Desarrollo");
		empleado1 = new Empleado("Juan", 2000);
		empleado2 = new Empleado("Ana", 2500);
	}

	@Test
	void testAgregarEmpleado() {
		departamento.agregarEmpleado(empleado1);
		List<Empleado> empleados = departamento.getListaEmpleados();
		assertTrue(empleados.contains(empleado1));
	}

	@Test
	void testCalcularGastoSalarial() {
		departamento.agregarEmpleado(empleado1);
		departamento.agregarEmpleado(empleado2);
		assertEquals(4500, departamento.calcularGastoSalarial());
	}

	@Test
	void testGetNombre() {
		assertEquals("Desarrollo", departamento.getNombre());
	}

}
