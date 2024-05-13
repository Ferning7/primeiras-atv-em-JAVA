import javax.swing.*;

public class ativ_9 {
    public static void main(String[] args) {
        double F, C;
        F = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira uma temperatura em Fareinheit: "));
        C = (5 * (F - 32) / 9);
        javax.swing.JOptionPane.showMessageDialog(null, F + " °F em Celcius: " + C, "Conversor de °F para °C", JOptionPane.INFORMATION_MESSAGE);


    }
}
