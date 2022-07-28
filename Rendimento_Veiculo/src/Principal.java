import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        Veiculo veic = new Veiculo();
        double Sal = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade abastecida"));
        double dist = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida"));
        double rd=veic.CalcRend(dist, quant);
        veic.ExibeRendimento(rd);
    }
}
