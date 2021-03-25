package segundo.programa;

import java.util.Date;


/**
 * HERENCIA
 * ENCAPSULACION
 * POLIMORFISMO
 * @author Laboratorio
 *
 */
public class MainApplication {

	public static void main(String[] args) {
		TarjetaCredito tarjetaCreditoUno = new TarjetaCredito();
		System.out.println(tarjetaCreditoUno.toString());
		

		/*
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.fecha_vencimiento = fecha_vencimiento;
		this.fecha_emision = fecha_emision;
		Nombre_y_apellido = nombre_y_apellido;
		this.codigoDeSeguridad = codigoDeSeguridad;
		*/
		Date fechaEmision = new Date();
		Date fechaVencimiento = new Date();
		
		tarjetaCreditoUno.setEmisionSocial(123456);
		System.out.println(tarjetaCreditoUno.getEmisionSocial());
		
		Tarjeta tarjetaCredito = new TarjetaCredito();
		tarjetaCredito.processarPago();
		Tarjeta tarjetaDebito = new TarjetaDebito();
		tarjetaDebito.processarPago();
	}

}
