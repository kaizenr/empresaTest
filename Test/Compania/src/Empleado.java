import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

class Departamento {
    private String nombre;
    private List<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public double calcularGastoSalarial() {
        double gastoTotal = 0;
        for (Empleado emp : listaEmpleados) {
            gastoTotal += emp.getSalario();
        }
        return gastoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
}

