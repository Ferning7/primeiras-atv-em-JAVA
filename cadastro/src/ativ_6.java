import javax.swing.*;

public class ativ_6 {
    public static void main(String[] args) {

        double raio;
        raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um o raio: "));
        javax.swing.JOptionPane.showMessageDialog(null, "Para pi = 3,14, a área é : " + (3.14 * Math.pow(raio, 2)), "Mostra o Raio do quadrado", JOptionPane.INFORMATION_MESSAGE);

    }
}
