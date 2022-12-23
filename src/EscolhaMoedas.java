import javax.swing.JOptionPane;

public class EscolhaMoedas {

    ConversoesMoedas moedas = new ConversoesMoedas();

    public boolean ConverterMoedas(double valorRecebido) {
        try {
            String opcao = JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter seu dinheiro",
                    "Moeda", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
                            "Real para Dólar", "Real para Euro", "Real para Libra", "Real para Iene",
                            "Real para Won Sul-Coreano", "Dólar para Real", "Euro para Real", "Libra para Real",
                            "Iene para Real", "Won Sul-Coreano para Real"
                    },
                    "Escolha").toString();

            switch (opcao) {

                case "Real para Dólar":
                    moedas.realParaDolar(valorRecebido);
                    break;

                case "Real para Euro":
                    moedas.realParaEuro(valorRecebido);
                    break;

                case "Real para Libra":
                    moedas.realParaLibra(valorRecebido);
                    break;

                case "Real para Iene":
                    moedas.realParaIene(valorRecebido);
                    break;

                case "Real para Won Sul-Coreano":
                    moedas.realParaWonSulCoreano(valorRecebido);
                    break;

                case "Dólar para Real":
                    moedas.dolarParaReal(valorRecebido);
                    break;

                case "Euro para Real":
                    moedas.euroParaReal(valorRecebido);
                    break;

                case "Libra para Real":
                    moedas.libraParaReal(valorRecebido);
                    break;

                case "Iene para Real":
                    moedas.ieneParaReal(valorRecebido);
                    break;

                case "Won Sul-Coreano para Real":
                    moedas.wonParaReal(valorRecebido);
                    break;

            }
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

}
