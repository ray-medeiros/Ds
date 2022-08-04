import javax.swing.JOptionPane;

public class Aluno {
    public String nome;
    public int rm;
    public double not1;
    public double not2;

    public void Cadastrar(String nm, int rm, double n1, double n2){
        this.nome=nm;
        this.rm=rm;
        this.not1=n1;
        this.not2=n2;
    
    }

    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome: "+ this.nome+
                                            "\nrm: "+ this.rm+
                                            "\nnot1: "+ this.not1+
                                            "\nnot2: "+ this.not2);
    }
    public void CadastrarMedia(){
        double med=(this.not1+this.not2)/2;
        JOptionPane.showMessageDialog(null, "nome: "+this.nome+"\nMedia: "+med);
    }
}
