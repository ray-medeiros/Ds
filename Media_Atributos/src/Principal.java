import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) throws Exception {
        Aluno al = new Aluno();
        String nm= JOptionPane.showInputDialog("nome do aluno: ");
        int rm= Integer.parseInt(JOptionPane.showInputDialog("Rm: "));
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
        al.Cadastrar(nm, rm, n1, n2);
        al.Exibir();
        al.CadastrarMedia();
    }
}
