import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {         
        String ValorA = JOptionPane.showInputDialog("Insira o primeiro valor:");
        double A = Double.parseDouble(ValorA);
        String ValorB = JOptionPane.showInputDialog("Insira o segundo valor:");
        double B = Double.parseDouble(ValorB);
        double resultado;
                
        int controle;
        
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar ?"
        + " \n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisâo"));
        
        switch (controle){
            
            case 1:
                resultado = A + B;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            
            case 2:
                resultado = A - B;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
                
            case 3:
                resultado = A * B;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            
            case 4:
                resultado = A / B;
                JOptionPane.showMessageDialog(null,"O resultado é: " + resultado);
            break;
            
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida! ");
            break;
        }
    }
}