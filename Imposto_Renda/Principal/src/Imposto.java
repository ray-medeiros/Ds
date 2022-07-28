import javax.swing.JOptionPane;

public class Imposto {
    public double CalcIr(double sal, double ir){
        double desconto;
        return desconto;

        if (sal >=1903.98){
            ir = 0;
    }else if (sal >=2826.66){
         ir = 2826.66*0.75;
    }else if (sal >=3751.05){
        ir = (3751.05*0.15);
    }else if(sal <=4664.68){
        ir = (4664.68*0.22);
    }else{
        ir = (4664.68*27)
    }

    public void ExibeImposto (double lion){
        JOptionPane.showMessageDialog(null, "Desconto:");
    }
}