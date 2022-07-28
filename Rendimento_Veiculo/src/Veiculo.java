import javax.swing.JOptionPane;

public class Veiculo {
    public double CalcRend(double dist, double quant){
       double Rendimento = dist/quant;
       return Rendimento;
    }
    public void ExibeRendimento (double rend){
        JOptionPane.showMessageDialog(null, "Rendimento:");
    }
}
