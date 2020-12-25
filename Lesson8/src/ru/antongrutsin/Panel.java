package ru.antongrutsin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

    private final JLabel display;
    private final JPanel buttons;
    private String lastCommand;
    private double result;
    private boolean start;

    //так и не разобрался в менеджерах. До сих пор не понял, как выставить различные размеры
    public Panel() {
        setLayout(new BorderLayout());

        result = 0;
        lastCommand = "=";
        start = true;

        display = new JLabel("");
        display.setHorizontalAlignment(SwingConstants.CENTER);
        display.setSize(200, 40);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = e.getActionCommand();
                if(start) {
                    display.setText("");
                    start = false;
                }
                display.setText(input);
            }
        };

        ActionListener command = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        };

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(buttons, BorderLayout.CENTER);
    }
    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        buttons.add(button);
    }

    public void calculate(double x) {
        switch (lastCommand) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "*":
                result *= x;
                break;
            case "/":
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
        display.setText("" + result);
    }
}
