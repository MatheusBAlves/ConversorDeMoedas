import javax.swing.JOptionPane;

public class EscolhaTemperaturas {

    ConversoesTemperaturas temperaturas = new ConversoesTemperaturas();

    public boolean ConverterTemperaturas(double valorRecebido) {
        try {
            String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter seu dinheiro",
                    "Moeda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                            "Celsius para Fahrenheit", "Celsius para Kelvin", "Fahrenheit para Celsius",
                            "Kelvin para Celsius", "Kelvin para Fahrenheit"
                    },
                    "Escolha").toString();

            switch (opcao) {

                case "Celsius para Fahrenheit":
                    temperaturas.celsiusParaFahrenheit(valorRecebido);
                    break;

                case "Celsius para Kelvin":
                    temperaturas.celsiusParaKelvin(valorRecebido);
                    break;

                case "Fahrenheit para Celsius":
                    temperaturas.fahrenheitParaCelsius(valorRecebido);
                    break;

                case "Kelvin para Celsius":
                    temperaturas.kelvinParaCelsius(valorRecebido);
                    break;

                case "Kelvin para Fahrenheit":
                    temperaturas.kelvinParaFahrenheit(valorRecebido);
                    break;
            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

}
