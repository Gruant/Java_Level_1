package ru.antongrutsin;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setBounds(200, 200, 300, 310);
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
    }
}
