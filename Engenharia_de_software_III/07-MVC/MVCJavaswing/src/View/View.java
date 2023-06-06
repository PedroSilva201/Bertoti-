package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class View {
    private JFrame frame;
    private JList<String> namesList;
    private JTextField nameField;
    private JButton addButton;

    public View() {
        frame = new JFrame("Inserção de Palavras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        namesList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(namesList);

        nameField = new JTextField(20);
        addButton = new JButton("Adicionar");

        JPanel inputPanel = new JPanel();
        inputPanel.add(nameField);
        inputPanel.add(addButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public String getNameInput() {
        return nameField.getText();
    }

    public void clearNameInput() {
        nameField.setText("");
    }

    public void displayNames(List<String> names) {
        namesList.setListData(names.toArray(new String[0]));
    }

    public void addNameListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}
