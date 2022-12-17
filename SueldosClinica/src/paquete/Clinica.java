package paquete;

import java.util.ArrayList;

public class Clinica {
	private String nombre;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Clinica(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	public String generarReporte(Empleado empleado) {
		return (empleado.getNombre()+" tiene un sueldo a liquidar de "+empleado.informarSueldo());
	}
	
}
