package HomeWorks;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework5 extends JPanel {

    public Homework5(){

        //Adding panels
        JPanel north = new JPanel();
        JPanel above = new JPanel();
        JPanel below = new JPanel();
        JPanel buttt = new JPanel();
        JPanel belBu = new JPanel(new BorderLayout());

        //Setting background color
        north.setBackground(Color.CYAN);
        above.setBackground(Color.CYAN);
        below.setBackground(Color.CYAN);
        buttt.setBackground(Color.CYAN);

        setLayout(new BorderLayout());

        north.setLayout(new FlowLayout(FlowLayout.CENTER));

        JTextField jTextField1 = new JTextField();

        jTextField1.setColumns(6);

        GridLayout gridLayout = new GridLayout(5, 2);
        above.setLayout(gridLayout);

        //Adding Radio Buttons
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton jrb1 = new JRadioButton("in Miles");
        JRadioButton jrb2 = new JRadioButton("in Kilometers");
        JRadioButton jrb3 = new JRadioButton("in Gallons");
        JRadioButton jrb4 = new JRadioButton("in Liters");
        JRadioButton jrb5 = new JRadioButton("in Pounds");
        JRadioButton jrb6 = new JRadioButton("in Kilograms");
        JRadioButton jrb7 = new JRadioButton("in MPH");
        JRadioButton jrb8 = new JRadioButton("in Knots");
        JRadioButton jrb9 = new JRadioButton("in Inches ");
        JRadioButton jrb10 = new JRadioButton("in Centimeters");

        //Adding the background color of Radio Buttons
        jrb1.setSelected(true);
        jrb1.setBackground(Color.CYAN);
        jrb2.setBackground(Color.CYAN);
        jrb3.setBackground(Color.CYAN);
        jrb4.setBackground(Color.CYAN);
        jrb5.setBackground(Color.CYAN);
        jrb6.setBackground(Color.CYAN);
        jrb7.setBackground(Color.CYAN);
        jrb8.setBackground(Color.CYAN);
        jrb9.setBackground(Color.CYAN);
        jrb10.setBackground(Color.CYAN);

        //Putting the Radio Buttons into group
        buttonGroup.add(jrb1);
        buttonGroup.add(jrb2);
        buttonGroup.add(jrb3);
        buttonGroup.add(jrb4);
        buttonGroup.add(jrb5);
        buttonGroup.add(jrb6);
        buttonGroup.add(jrb7);
        buttonGroup.add(jrb8);
        buttonGroup.add(jrb9);
        buttonGroup.add(jrb10);

        //Adding the Radio Buttons to the panel
        above.add(jrb1);
        above.add(jrb2);
        above.add(jrb3);
        above.add(jrb4);
        above.add(jrb5);
        above.add(jrb6);
        above.add(jrb7);
        above.add(jrb8);
        above.add(jrb9);
        above.add(jrb10);

        north.add(new JLabel("Input :"));
        north.add(jTextField1);

        below.setLayout(new FlowLayout(FlowLayout.LEFT));

        JTextArea jTextArea = new JTextArea(8,37);
        jTextArea.setEditable(false);

        JScrollPane scroll = new JScrollPane (jTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        below.add(scroll);
        below.add(belBu);
        belBu.add(buttt, BorderLayout.NORTH);

        GridLayout bgl = new GridLayout(4,3);

        above.setBorder( BorderFactory.createEmptyBorder(00,170,00,170) );

        buttt.setLayout(bgl);

        //Adding the buttons
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb0 = new JButton("0");
        JButton jbc = new JButton("c");
        JButton jbn = new JButton(".");
        JButton jbk = new JButton("Convert");

        //Adding the actions listeners of the buttons
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             jTextField1.setText(jTextField1.getText() + 1);
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 2);
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 3);
            }
        });

        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 4);
            }
        });

        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 5);
            }
        });

        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 6);
            }
        });

        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 7);
            }
        });

        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 8);
            }
        });

        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 9);
            }
        });

        jb0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + 0);
            }
        });

        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText(jTextField1.getText() + ".");
            }
        });

        jbc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField1.setText("");
            }
        });

        //Adding the action listener of Convert button and the converting operations
        jbk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double input = Double.parseDouble(jTextField1.getText());

                    if (jTextField1.getText().isEmpty() == false) {
                        if (jrb1.isSelected()) {
                            jTextArea.setText(jTextArea.getText() + input + " Miles equals " + input * 1.609 + " Kilometers\n");
                        } else if (jrb2.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Kilometers equals " + input / 1.609 + " Miles\n");
                        } else if (jrb3.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Gallons equals " + input * 3.785 + " Liters\n");
                        } else if (jrb4.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Liters equals " + input / 3.785 + " Gallons\n");
                        } else if (jrb5.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Pounds equals " + input / 2.205 + " Kilograms\n");
                        } else if (jrb6.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Kilograms equals " + input * 2.205 + " Pounds\n");
                        } else if (jrb7.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " MPH equals " + input / 1.151 + " Knots\n");
                        } else if (jrb8.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Knots equals " + input * 1.151 + " MPH\n");
                        } else if (jrb9.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Inches equals " + input * 2.54 + " Centimeters\n");
                        } else if (jrb10.isSelected()){
                            jTextArea.setText(jTextArea.getText() + input + " Centimeters equals " + input / 2.54 + " Inches\n");
                        }

                    } else {
                        jTextArea.setText(jTextArea.getText() + "invalid input\n");
                    }
                }catch (NumberFormatException ex){
                    jTextArea.setText(jTextArea.getText() + "invalid input\n");
                }
            }
        });

        //Setting the action of clicking Enter button
        jTextField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jbk.doClick();
            }
        });

        //adding the buttons to the panel
        buttt.add(jb1);
        buttt.add(jb2);
        buttt.add(jb3);
        buttt.add(jb4);
        buttt.add(jb5);
        buttt.add(jb6);
        buttt.add(jb7);
        buttt.add(jb8);
        buttt.add(jb9);
        buttt.add(jbc);
        buttt.add(jb0);
        buttt.add(jbn);
        belBu.add(jbk, BorderLayout.SOUTH);

        //adding the panles to the main panel
        add(north, BorderLayout.NORTH);
        add(above, BorderLayout.CENTER);
        add(below, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Homework 5");
        frame.getContentPane().add(new Homework5());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(580, 350);
        frame.setVisible(true);
    }
}



