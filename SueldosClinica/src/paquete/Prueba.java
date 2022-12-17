package paquete;

import java.util.Iterator;

public class Prueba {

	public static void main(String[] args) {
		
		Clinica clinica1 = new Clinica("Colon");
		Domicilio domicilio1 = new Domicilio("Lijo Lopez",8980);
		Domicilio domicilio2 = new Domicilio("Venito Lynch",7829);
		Domicilio domicilio3 = new Domicilio("Salta",4534);
		Contrato contrato1 = new Contrato("A",40000);
		Contrato contrato2 = new Contrato("B",50000);
		Empleado medico1 = new Medico("Lucrecia",45890432,domicilio3,contrato2,564);
		Empleado medico2 = new Medico("Kevin",44758903,domicilio2,contrato1,508);
		Empleado enfermero1 = new Enfermero("Juan",44678932,domicilio1,5);
		
		clinica1.agregarEmpleado(medico1);
		clinica1.agregarEmpleado(medico2);
		clinica1.agregarEmpleado(enfermero1);
		
		System.out.println(medico1.getNombre());	
		
		Iterator<Empleado> iterator = clinica1.getEmpleados().iterator();
		while(iterator.hasNext()) {
			System.out.println(clinica1.generarReporte(iterator.next()));
		}
		
	}

}
