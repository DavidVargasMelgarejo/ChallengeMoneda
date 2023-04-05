import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolar(double valor) {
		double monedaDolar = valor / 18.00;
		monedaDolar = (double) Math.round(monedaDolar*100)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + "Dolares");
	}
	public void ConvertirPesosAEuro(double valor) {
		double monedaEuro = valor / 19.00;
		monedaEuro = (double) Math.round(monedaEuro*100)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + "Euros");
	}
}
