import javax.swing.*;

public class ativ_4 {
    public static void main(String[] args) {
        double n1, n2, n3, n4;
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 3° nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 4° nota: "));

        double media = (n1 + n2 + n3 + n4) / 4;

        javax.swing.JOptionPane.showMessageDialog(null, "Média de notas: " + media, "Numeros", JOptionPane.INFORMATION_MESSAGE);
    }
}
