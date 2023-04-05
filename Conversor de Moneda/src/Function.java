import javax.swing.JOptionPane;

public class Function {

	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas (double Minput) {
		
		//String opcion = (JOptionPane.showInputDialog(null,"Elige la moneda a la que deseas convertir", "monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Dolares","Euros" "Seleccion")).toString();
	
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda que desa convertir",
				"monedas", JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Dolares", "Euros" }, "selección"))
				.toString();
		
	switch(opcion) {
	case "Dolares":
		monedas.ConvertirPesosADolar(Minput);
		break;
		
	case "Euros":
		monedas.ConvertirPesosAEuro(Minput);
		break;
	
	}
	}

}
