package segundo.programa;

import java.util.Date;

public abstract class Tarjeta {
	
	//Numero de la tarjeta de credito	
	private Integer numeroDeTarjeta;
	//Fecha de vencimiento
	private Date fecha_vencimiento;
	//Fecha de emision
	private Date fecha_emision;
	//Nombre y apellido del titular
	private String Nombre_y_apellido;
	//Codigo de seguridad
	private Integer codigoDeSeguridad;
	
	private Integer emisionSocial;

	
	
	public Tarjeta() {
		super();
	}

	public Tarjeta(Integer numeroDeTarjeta, Date fecha_vencimiento, Date fecha_emision, String nombre_y_apellido,
			Integer codigoDeSeguridad, Integer emisionSocial) {
		super();
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.fecha_vencimiento = fecha_vencimiento;
		this.fecha_emision = fecha_emision;
		Nombre_y_apellido = nombre_y_apellido;
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.emisionSocial = emisionSocial;
	}

	public Integer getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(Integer numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public Date getFecha_emision() {
		return fecha_emision;
	}

	public void setFecha_emision(Date fecha_emision) {
		this.fecha_emision = fecha_emision;
	}

	public String getNombre_y_apellido() {
		return Nombre_y_apellido;
	}

	public void setNombre_y_apellido(String nombre_y_apellido) {
		Nombre_y_apellido = nombre_y_apellido;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public Integer getEmisionSocial() {
		return emisionSocial;
	}

	public void setEmisionSocial(Integer emisionSocial) {
		this.emisionSocial = emisionSocial;
	}
	
	public abstract void processarPago();
}
