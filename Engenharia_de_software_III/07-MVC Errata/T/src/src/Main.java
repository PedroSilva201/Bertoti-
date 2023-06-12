package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

// --- Strategy Pattern ---


// --- Observer Pattern ---
// --- Composite Pattern ---
// --- Singleton Pattern ---
// --- Facade Pattern ---
// --- View ---
// --- Controller ---
// --- Main ---
public class Main {
    public static void main(String[] args) {
        MVCFacade mvcFacade = new MVCFacade();
        ((MVCFacade) mvcFacade).start();
    }
}
