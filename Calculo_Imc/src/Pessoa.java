import javax.swing.JOptionPane;

public class Pessoa {
    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public void Cadastrar(String nm, int idade, double ps, double at){
        this.nome=nm;
        this.idade=idade;
        this.peso=ps;
        this.altura=at;
    }
    public void Exibir(){
        JOptionPane.showMessageDialog(null, "nome: "+this.nome+
                                            "\nidade: "+ this.idade+
                                            "\npeso: "+ this.peso+
                                            "\naltura: "+ this.altura);
    }
    public void CalcularImc(){
        double imc=(this.peso*this.altura)/this.altura;
        JOptionPane.showMessageDialog(null, "nome: "+this.nome+"\nImc: "+imc);
    }

    }


