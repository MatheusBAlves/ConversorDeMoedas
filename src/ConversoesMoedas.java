import javax.swing.JOptionPane;

public class ConversoesMoedas{

    private double adicionaDecimais(double valor) {
        return (double) Math.round(valor * 100d) / 100;
    }

    public void realParaDolar(double valor) {
        valor = adicionaDecimais(valor / 5.17);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valor + " Dólares");
    }

    public void realParaEuro(double valor) {
        valor = adicionaDecimais(valor / 5.48);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valor + " Euros");
    }

    public void realParaLibra(double valor){
        valor = adicionaDecimais(valor/6.22);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valor + " Libras");
    }

    public void realParaIene(double valor){
        valor = adicionaDecimais(valor/25.62);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valor + " Iene Japonês");
    }

    public void realParaWonSulCoreano(double valor){
        valor = adicionaDecimais(valor/247.93);
        JOptionPane.showMessageDialog(null, "Você tem $ " + valor + " Won Sul-Coreano");
    }


    public void dolarParaReal(double valor) {
        mensagemReal(adicionaDecimais(valor*0.19));
    }

    public void euroParaReal(double valor) {
        mensagemReal(adicionaDecimais(valor*0.18));
    }

    public void libraParaReal(double valor){
        mensagemReal(adicionaDecimais(valor*0.16));
    }

    public void ieneParaReal(double valor){
        mensagemReal(adicionaDecimais(valor*0.039));
    }

    public void wonParaReal(double valor){
        mensagemReal(adicionaDecimais(valor*0.004));
    }

    

    private void mensagemReal(double valor){
        JOptionPane.showMessageDialog(null, "Você tem R$ " + valor + " reais");
    }


}
