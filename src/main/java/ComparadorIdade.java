import javax.swing.JOptionPane;

public class ComparadorIdade {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira seu ano de nascimento:");
        int A = Integer.parseInt(ValorA);
                
        if (A >= 15 && A <= 25)
        {
            JOptionPane.showMessageDialog(null, "ACEITA.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "NÃO ACEITA.");
        }       
     }
}