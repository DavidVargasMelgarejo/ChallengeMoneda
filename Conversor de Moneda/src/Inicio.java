import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {

		Function monedas = new Function();

		boolean flag = true;
		while (flag) {

			String opciones = (JOptionPane.showInputDialog(null, "Bienvenido", "menú", JOptionPane.QUESTION_MESSAGE,
					null, new Object[] { "Conversor de Moneda",}, "selección")).toString();

			switch (opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input)) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Seleccione opción afirmativa");
					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Adíos");

					}
				}

			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
