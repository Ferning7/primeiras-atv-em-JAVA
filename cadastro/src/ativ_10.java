import javax.swing.*;

public class ativ_10 {
    public static void main(String[] args) {
        double F, C;
        C = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira uma temperatura em Celsius: "));
        F = C / 5 * 9 + 32;

        javax.swing.JOptionPane.showMessageDialog(null, C + " °C em Farenheit: " + F, "Conversor de °C para °F", JOptionPane.INFORMATION_MESSAGE);

    }
}
