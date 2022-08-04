import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        
            Pessoa pl = new Pessoa();
            String nm= JOptionPane.showInputDialog("nome da Pessoa: ");
            int idade= Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
            double ps= Integer.parseInt(JOptionPane.showInputDialog("Peso: "));
            double at= Integer.parseInt(JOptionPane.showInputDialog("Altura: "));
            pl.Cadastrar(nm, idade, ps, at);
            pl.Exibir();
            pl.CalcularImc();
    }
}
