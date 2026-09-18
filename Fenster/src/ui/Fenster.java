package ui;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame {



    public Fenster() {
        setSize(500, 500);
        addWindowListener(new MyWindowListener());
        Button button = new Button("Drück mich");
        add(button);
        button.addActionListener(e->ausgabe());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Fenster();
    }

    private void beenden() {
        // Daten speichert
        dispose();
    }

    private void ausgabe() {
        System.out.println("Button wurde gedrückt");
    }

    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(final WindowEvent e) {
            beenden();
        }
    }

}
