package segundo.programa;

public class TarjetaDebito extends Tarjeta{

	@Override
	public void processarPago() {
		System.out.println("procesando Tarjeta de debito");
	};
}
