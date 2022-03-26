package Triangulate;

import javax.swing.*;

public class TriangleTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 700);
        frame.setTitle("Triangulator Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MouseComponent component = new MouseComponent();
        frame.add(component);
        frame.setVisible(true);

    }
}
