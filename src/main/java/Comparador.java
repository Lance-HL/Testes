import javax.swing.JOptionPane;

public class Comparador {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira o primeiro valor:");
        int A = Integer.parseInt(ValorA);
        String ValorB = JOptionPane.showInputDialog("Insira o segundo valor:");
        int B = Integer.parseInt(ValorB);
        
        if (A > B) {
            JOptionPane.showMessageDialog(null, A + " é o maior.");
        }
        else if (A < B) {
            JOptionPane.showMessageDialog(null, B + " é o maior.");
        }
        
        else if (A - B == 0) {
        JOptionPane.showMessageDialog(null, A + " é igual a: " + B);
        }
    }
}