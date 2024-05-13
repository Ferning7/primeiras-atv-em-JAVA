import javax.swing.*;

public class ativ_5 {
    public static void main(String[] args) {
        double metros;

        metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite uma medida em metros: "));
        double cm = (metros * 100);

        javax.swing.JOptionPane.showMessageDialog(null, metros + " metros convertido em Cm: " + cm, "Conversor de M para Cm", JOptionPane.INFORMATION_MESSAGE);
    }
}
