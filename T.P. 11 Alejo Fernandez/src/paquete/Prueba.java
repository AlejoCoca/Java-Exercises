package paquete;

public class Prueba {

	public static void main(String[] args) {

		CuentaBancaria cu = new CuentaUniversitaria("Alejo");
		cu.depositar(5000);
		System.out.println(cu);
		cu.extraer(400);
		System.out.println(cu);
		cu.extraer(400);
		System.out.println(cu);
		cu.extraer(400);
		System.out.println(cu);
		CuentaUniversitaria cuentaU =(CuentaUniversitaria) cu;
		cuentaU.resetearMonto();
		System.out.println(cuentaU);
		cuentaU.extraer(600);
		System.out.println(cuentaU);
		
		CuentaBancaria cCorriente = new CuentaCorriente("Pepe", 1000);
		CuentaCorriente corriente =(CuentaCorriente) cCorriente;
		corriente.depositar(2000);
		System.out.println(corriente);
		corriente.extraer(1500);
		System.out.println(corriente);
		corriente.extraer(1000);
		System.out.println(corriente);
		corriente.extraer(1000);
		System.out.println(corriente);
		corriente.extraer(200);
		System.out.println(corriente);
		
		CajaAhorro cAhorro = new CajaAhorro("Juan");
		CajaAhorro ahorro = (CajaAhorro) cAhorro;
		ahorro.depositar(3000);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
		ahorro.extraer(100);
		System.out.println(ahorro);
	}

}
