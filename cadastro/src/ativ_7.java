import javax.swing.*;

public class ativ_7 {
    public static void main(String[] args) {
        Double area;
        area = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a area: "));
        javax.swing.JOptionPane.showMessageDialog(null, "Dobro da área digitada: " + (area * area), "Mostra a area do quadrado", JOptionPane.INFORMATION_MESSAGE);

    }
}
