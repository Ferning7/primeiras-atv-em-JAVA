import javax.swing.*;

public class ativ_8 {
    public static void main(String[] args) {
        double porH, horaM;
        porH = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto você ganha por hora: "));
        horaM = Double.parseDouble(JOptionPane.showInputDialog(null, "Número de horas trabalhadas no mês: "));

        javax.swing.JOptionPane.showMessageDialog(null, "Salário total do mês: " + (porH * horaM), "Calcula seu salário mensal", JOptionPane.INFORMATION_MESSAGE);

    }
}
