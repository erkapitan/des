/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eedUnidad_4;

/**
 *
 * @author Francico Javier Cabrerizo Membrilla & Rubén Alarcón Gálvez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Juan López","1000-2365-85-123456789",2500);
		operativa_cuenta(cuenta1, null);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );
    }

	private static void operativa_cuenta(CCuenta cuenta1, Float cantidad) {
		try
		{
			cuenta1.retirar(cantidad);
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
			System.out.println("Fallo al retirar");
		}
		
		try
		{
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(cantidad);
		} catch (Exception e)
		{
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar");
		}
	}

}