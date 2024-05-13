import javax.swing.*;

public class ativ_3 {
    public static void main(String[] args) {
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° número: "));

        double soma = n1 + n2;

        javax.swing.JOptionPane.showMessageDialog(null, "Número digitado: " + soma, "Numeros", JOptionPane.INFORMATION_MESSAGE);
    }
}
