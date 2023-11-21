import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Programm {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("JFrame");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(494,494);
        frame.setLayout(new GridBagLayout());

		JLabel element_1700074294402 = new JLabel("label");
        GridBagConstraints constraints_element_1700074294402 = new GridBagConstraints();
        constraints_element_1700074294402.gridx = 1;
        constraints_element_1700074294402.gridy = 1;
        constraints_element_1700074294402.gridwidth = 1;
        constraints_element_1700074294402.gridheight = 1;
        constraints_element_1700074294402.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074294402, constraints_element_1700074294402);

		JTextField element_1700074300065 = new JTextField(20);
        GridBagConstraints constraints_element_1700074300065 = new GridBagConstraints();
        constraints_element_1700074300065.gridx = 2;
        constraints_element_1700074300065.gridy = 1;
        constraints_element_1700074300065.gridwidth = 2;
        constraints_element_1700074300065.gridheight = 1;
        constraints_element_1700074300065.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074300065, constraints_element_1700074300065);

		JButton element_1700074305369 = new JButton("button");
        GridBagConstraints constraints_element_1700074305369 = new GridBagConstraints();
        constraints_element_1700074305369.gridx = 6;
        constraints_element_1700074305369.gridy = 1;
        constraints_element_1700074305369.gridwidth = 2;
        constraints_element_1700074305369.gridheight = 1;
        constraints_element_1700074305369.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074305369, constraints_element_1700074305369);

		JLabel element_1700074314953 = new JLabel("label");
        GridBagConstraints constraints_element_1700074314953 = new GridBagConstraints();
        constraints_element_1700074314953.gridx = 9;
        constraints_element_1700074314953.gridy = 1;
        constraints_element_1700074314953.gridwidth = 1;
        constraints_element_1700074314953.gridheight = 1;
        constraints_element_1700074314953.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074314953, constraints_element_1700074314953);

		JLabel element_1700074297490 = new JLabel("label");
        GridBagConstraints constraints_element_1700074297490 = new GridBagConstraints();
        constraints_element_1700074297490.gridx = 1;
        constraints_element_1700074297490.gridy = 2;
        constraints_element_1700074297490.gridwidth = 1;
        constraints_element_1700074297490.gridheight = 1;
        constraints_element_1700074297490.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074297490, constraints_element_1700074297490);

		JTextField element_1700074301707 = new JTextField(20);
        GridBagConstraints constraints_element_1700074301707 = new GridBagConstraints();
        constraints_element_1700074301707.gridx = 2;
        constraints_element_1700074301707.gridy = 2;
        constraints_element_1700074301707.gridwidth = 2;
        constraints_element_1700074301707.gridheight = 1;
        constraints_element_1700074301707.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074301707, constraints_element_1700074301707);

		JButton element_1700074307018 = new JButton("button");
        GridBagConstraints constraints_element_1700074307018 = new GridBagConstraints();
        constraints_element_1700074307018.gridx = 6;
        constraints_element_1700074307018.gridy = 2;
        constraints_element_1700074307018.gridwidth = 2;
        constraints_element_1700074307018.gridheight = 1;
        constraints_element_1700074307018.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074307018, constraints_element_1700074307018);

		JLabel element_1700074316762 = new JLabel("label");
        GridBagConstraints constraints_element_1700074316762 = new GridBagConstraints();
        constraints_element_1700074316762.gridx = 9;
        constraints_element_1700074316762.gridy = 2;
        constraints_element_1700074316762.gridwidth = 1;
        constraints_element_1700074316762.gridheight = 1;
        constraints_element_1700074316762.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074316762, constraints_element_1700074316762);

		JButton element_1700074308261 = new JButton("button");
        GridBagConstraints constraints_element_1700074308261 = new GridBagConstraints();
        constraints_element_1700074308261.gridx = 6;
        constraints_element_1700074308261.gridy = 3;
        constraints_element_1700074308261.gridwidth = 2;
        constraints_element_1700074308261.gridheight = 1;
        constraints_element_1700074308261.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074308261, constraints_element_1700074308261);

		JLabel element_1700074318714 = new JLabel("label");
        GridBagConstraints constraints_element_1700074318714 = new GridBagConstraints();
        constraints_element_1700074318714.gridx = 9;
        constraints_element_1700074318714.gridy = 3;
        constraints_element_1700074318714.gridwidth = 1;
        constraints_element_1700074318714.gridheight = 1;
        constraints_element_1700074318714.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074318714, constraints_element_1700074318714);

		JButton element_1700074311442 = new JButton("button");
        GridBagConstraints constraints_element_1700074311442 = new GridBagConstraints();
        constraints_element_1700074311442.gridx = 6;
        constraints_element_1700074311442.gridy = 4;
        constraints_element_1700074311442.gridwidth = 2;
        constraints_element_1700074311442.gridheight = 1;
        constraints_element_1700074311442.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074311442, constraints_element_1700074311442);

		JLabel element_1700074320402 = new JLabel("label");
        GridBagConstraints constraints_element_1700074320402 = new GridBagConstraints();
        constraints_element_1700074320402.gridx = 9;
        constraints_element_1700074320402.gridy = 4;
        constraints_element_1700074320402.gridwidth = 1;
        constraints_element_1700074320402.gridheight = 1;
        constraints_element_1700074320402.fill = GridBagConstraints.HORIZONTAL;
        frame.add(element_1700074320402, constraints_element_1700074320402);

        element_1700074305369.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String numero1 = element_1700074300065.getText();
                String numero2 = element_1700074301707.getText();
                String resultado = numero1 + numero2;
                element_1700074314953.setText(resultado);
            }
            
        });

        frame.setVisible(true);
    }
}
