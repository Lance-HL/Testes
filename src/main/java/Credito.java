import javax.swing.JOptionPane;

public class Credito {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira o sálario bruto:");
        double A = Double.parseDouble(ValorA);
        String ValorB = JOptionPane.showInputDialog("Insira o valor da prestação:");
        double B = Double.parseDouble(ValorB);
        
        if ((A * 0.3) > B)
        {
            JOptionPane.showMessageDialog(null, "Empréstimo concedido");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Empréstimo não concedido");
        }       
     }
}