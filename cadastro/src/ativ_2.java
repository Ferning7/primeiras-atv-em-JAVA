import javax.swing.JOptionPane;

public class ativ_2 {
    public static void main(String[] args) {
        double n;
        n = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
        javax.swing.JOptionPane.showMessageDialog(null, "Número digitado: " + n, "Numeros", JOptionPane.INFORMATION_MESSAGE);

    }

}
