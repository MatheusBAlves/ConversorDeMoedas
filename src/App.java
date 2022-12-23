import javax.swing.JOptionPane;

public class App {

    static boolean loop = true;

    public static void main(String[] args) {

        EscolhaMoedas funcaoMoedas = new EscolhaMoedas();
        EscolhaTemperaturas funcaoTemperaturas = new EscolhaTemperaturas();

        do {
            try {
                String opcao = JOptionPane
                        .showInputDialog(null, "Escolha uma opção", "Conversor - Matheus Alves", JOptionPane.PLAIN_MESSAGE, null,
                                new Object[] { "Conversor de Moedas", "Conversor de Temperatura" }, "Escolha")
                        .toString();
                switch (opcao) {

                    case "Conversor de Moedas":

                        try {
                            String input = JOptionPane.showInputDialog("Insira um valor");
                            double valorRecebido = Double.parseDouble(input);
                            boolean foiConvertido = funcaoMoedas.ConverterMoedas(valorRecebido);
                            if (foiConvertido) {

                                int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                                        "Deseja continuar?",
                                        1);

                                if (resposta == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                                    loop = false;
                                } else if (resposta == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa concluído");
                                    loop = false;
                                }
                            } else {
                                encerrarPrograma();
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Valor incorreto!", "ERRO", 2);
                        }
                        break;

                    case "Conversor de Temperatura":
                        try {
                            String input = JOptionPane.showInputDialog("Insira um valor");
                            double valorRecebido = Double.parseDouble(input);
                            boolean foiConvertido = funcaoTemperaturas.ConverterTemperaturas(valorRecebido);
                            if (foiConvertido) {

                                int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
                                        "Deseja continuar?",
                                        1);

                                if (resposta == JOptionPane.NO_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                                    loop = false;
                                } else if (resposta == JOptionPane.CANCEL_OPTION) {
                                    JOptionPane.showMessageDialog(null, "Programa concluído");
                                    loop = false;
                                }
                            } else {
                                encerrarPrograma();
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Valor incorreto!", "ERRO", 2);
                        }
                        break;

                }
            } catch (NullPointerException e) {
                encerrarPrograma();
            }

        } while (loop);

    }

    public static void encerrarPrograma() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?", "Deseja encerrar?",
                0);

        if (resposta == JOptionPane.YES_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
            loop = false;
        }
    }
}
