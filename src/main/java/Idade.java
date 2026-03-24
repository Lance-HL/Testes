import javax.swing.JOptionPane;

public class Idade {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira seu ano de nascimento:");
        int A = Integer.parseInt(ValorA);
        String ValorB = JOptionPane.showInputDialog("Insira o ano atual:");
        int B = Integer.parseInt(ValorB);
        int idade = B - A;
                
        if (A >= B)
        {
            JOptionPane.showMessageDialog(null, "Ano de nascimento invalido.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "sua idade é: " + idade);
        }       
     }
}