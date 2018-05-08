package liidesed;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    private JButton button1;
    private JPanel panelMain;
    private JFormattedTextField length;
    private JFormattedTextField mass;
    private double bmi;



    public double bmi(int mass, int length){
        bmi = mass/Math.pow((length/100.0), 2);
        return bmi;
    }

    public App() {
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int massValue = Integer.parseInt(mass.getText());
                int lengthValue = Integer.parseInt(length.getText());
                JOptionPane.showMessageDialog(null, "Sinu KMI on: " + String.valueOf(bmi(massValue,lengthValue)));
            }
        });

}

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
