
public class Main {
	   public static void main(String[] args) {
	        Empresa empresa = new Empresa();

	        Empleado empleado1 = new Empleado("Juan", 2000);
	        Empleado empleado2 = new Empleado("Ana", 2500);
	        Empleado empleado3 = new Empleado("Luis", 2200);

	        Departamento depto1 = new Departamento("Desarrollo");
	        Departamento depto2 = new Departamento("Marketing");

	        depto1.agregarEmpleado(empleado1);
	        depto1.agregarEmpleado(empleado2);
	        depto2.agregarEmpleado(empleado3);

	        empresa.agregarDepartamento(depto1);
	        empresa.agregarDepartamento(depto2);

	        Proyecto proyecto1 = new Proyecto("Proyecto A", empleado1, 12, 50000);
	        Proyecto proyecto2 = new Proyecto("Proyecto B", empleado3, 18, 75000);

	        empresa.agregarProyecto(proyecto1);
	        empresa.agregarProyecto(proyecto2);

	        System.out.println("Gasto salarial del departamento Desarrollo: " + depto1.calcularGastoSalarial());

	        System.out.println("Empleados en Desarrollo:");
	        for (Empleado emp : empresa.listarEmpleadosPorDepartamento("Desarrollo")) {
	            System.out.println(emp.getNombre());
	        }

	        System.out.println("Departamento con más empleados: " + empresa.departamentoConMasEmpleados());

	        System.out.println("Proyecto más largo: " + empresa.proyectoMasLargo().getNombre());

	        System.out.println("Promedio de los costos de los proyectos: " + empresa.promedioProyectos());
	   }
}