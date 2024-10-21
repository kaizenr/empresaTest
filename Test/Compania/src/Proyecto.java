
public class Proyecto {
	  private String nombre;
	    private Empleado responsable;
	    private int duracionMeses;
	    private double costo;

	    public Proyecto(String nombre, Empleado responsable, int duracionMeses, double costo) {
	        this.nombre = nombre;
	        this.responsable = responsable;
	        this.duracionMeses = duracionMeses;
	        this.costo = costo;
	    }

	    public void asignarEmpleado(Empleado empleado) {
	        this.responsable = empleado;
	    }

	    public int informarDuracion() {
	        return duracionMeses;
	    }

	    public double getCosto() {
	        return costo;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	

}
