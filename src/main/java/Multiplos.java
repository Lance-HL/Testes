

import javax.swing.JOptionPane;

public class Multiplos {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira o valor:");
        int A = Integer.parseInt(ValorA);
        if (A % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é multiplo de 2.");
        } else
            JOptionPane.showMessageDialog(null, "O número não é multiplo de 2.");
        }
                }
