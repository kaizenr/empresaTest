import java.util.ArrayList;
import java.util.List;

public class Empresa {
	  private List<Departamento> departamentos = new ArrayList<>();
	    private List<Proyecto> proyectos = new ArrayList<>();

	    public void agregarDepartamento(Departamento departamento) {
	        departamentos.add(departamento);
	    }

	    public void agregarProyecto(Proyecto proyecto) {
	        proyectos.add(proyecto);
	    }

	    public List<Empleado> listarEmpleadosPorDepartamento(String nombreDepartamento) {
	        for (Departamento depto : departamentos) {
	            if (depto.getNombre().equals(nombreDepartamento)) {
	                return depto.getListaEmpleados();
	            }
	        }
	        return null;
	    }

	    public String departamentoConMasEmpleados() {
	        String nombreDepto = "";
	        int maxEmpleados = 0;

	        for (Departamento depto : departamentos) {
	            if (depto.getListaEmpleados().size() > maxEmpleados) {
	                maxEmpleados = depto.getListaEmpleados().size();
	                nombreDepto = depto.getNombre();
	            }
	        }
	        return nombreDepto;
	    }

	    public List<Empleado> empleadosConProyecto() {
	        List<Empleado> empleadosConProyecto = new ArrayList<>();
	        for (Proyecto proyecto : proyectos) {
	            if (!empleadosConProyecto.contains(proyecto.responsable)) {
	                empleadosConProyecto.add(proyecto.responsable);
	            }
	        }
	        return empleadosConProyecto;
	    }

	    public Proyecto proyectoMasLargo() {
	        Proyecto masLargo = null;
	        int duracionMaxima = 0;

	        for (Proyecto proyecto : proyectos) {
	            if (proyecto.informarDuracion() > duracionMaxima) {
	                duracionMaxima = proyecto.informarDuracion();
	                masLargo = proyecto;
	            }
	        }
	        return masLargo;
	    }

	    public double promedioProyectos() {
	        double totalCostos = 0;
	        for (Proyecto proyecto : proyectos) {
	            totalCostos += proyecto.getCosto();
	        }
	        return proyectos.size() > 0 ? totalCostos / proyectos.size() : 0;
	    }
}
	

