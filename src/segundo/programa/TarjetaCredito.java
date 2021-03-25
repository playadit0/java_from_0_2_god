package segundo.programa;

import java.util.Date;

public class TarjetaCredito extends Tarjeta{

	/*
	 * PRIMERO ATTRIBUTO
	 * DESPUES CONTRUCTORES
	 * DESPUES METODOS
	 * 
	 * 
	 * DESPUES METODOS
	 * DESPUES CONTRUCTORES
	 * PRIMERO ATTRIBUTO
	 * 
	 * 
	 * */
	
	
	/*
	
	PRIVADO 	= Nadie ademas de si mismo puede acceder y modificar el contenido de sus atributos
	PUBLICO 	= Cualquiera puede acceder y modificar  al contenido de mis atributos
	PROTEGIDO	= Solo mis hijos pueden accceder y modificar el contenido directamente 
	
	*/
	public TarjetaCredito() {
		super();
	}

	
	@Override
	public void processarPago() {
		System.out.println("proceso tarjeta de CREDITO");
	}

}
