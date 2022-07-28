import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Imposto Im = new Imposto ();
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
        double ir = Double.parseDouble(JOptionPane.showInputDialog("Digite "));
        double lion=Im.CalcIr(sal, ir);
        Im.ExibeImposto(lion);
    }
    }
}
