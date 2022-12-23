import javax.swing.JOptionPane;

public class ConversoesTemperaturas {

    private double adicionaDecimais(double valor) {
        return (double) Math.round(valor * 100d) / 100;
    }

    public void celsiusParaFahrenheit(double valor) {
        valor = adicionaDecimais((valor * 1.8) + 32);
        JOptionPane.showMessageDialog(null, "A temperatura é " + valor + " F");
    }

    public void celsiusParaKelvin(double valor) {
        valor = adicionaDecimais(valor + 273);
        JOptionPane.showMessageDialog(null, "A temperatura é " + valor + " K");
    }

    public void fahrenheitParaCelsius(double valor) {
        valor = adicionaDecimais((valor / 1.8) - 32);
        JOptionPane.showMessageDialog(null, "A temperatura é " + valor + " C");
    }

    public void kelvinParaCelsius(double valor) {
        valor = adicionaDecimais(valor - 273);
        JOptionPane.showMessageDialog(null, "A temperatura é " + valor + " C");
    }

    public void kelvinParaFahrenheit(double valor) {
        valor = adicionaDecimais(1.8 * (valor - 273) + 32);
        JOptionPane.showMessageDialog(null, "A temperatura é " + valor + " F");
    }


}
