import javax.swing.JOptionPane;

public class Adicao_Simples {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira o primeiro valor:");
        int A = Integer.parseInt(ValorA);
        String ValorB = JOptionPane.showInputDialog("Insira o segundo valor:");
        int B = Integer.parseInt(ValorB);
                int Total = A + B;
                
        JOptionPane.showMessageDialog(null, "O total é: " + Total);
    }
}