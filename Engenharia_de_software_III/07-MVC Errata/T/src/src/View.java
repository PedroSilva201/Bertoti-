package src;

import java.awt.BorderLayout;
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

public class View implements NameObserver {
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
        addButton = new JButton("Adicionar palavra");

        JPanel inputPanel = new JPanel();
        inputPanel.add(nameField);
        inputPanel.add(addButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

        // Adiciona um ActionListener ao campo de texto
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palavra = getNameInput();
                imprimirPalavra(palavra);
                clearNameInput();
            }
        });

        // Adiciona um ActionListener ao botão
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palavra = getNameInput();
                imprimirPalavra(palavra);
                clearNameInput();
            }
        });
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
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listener.actionPerformed(e);
            }
        });
    }

    public void imprimirPalavra(String palavra) {
        System.out.println("Palavra: " + palavra);
        // Ou você pode exibir a palavra em uma área de texto adicional na interface gráfica
    }

    @Override
    public void update(List<String> names) {
        displayNames(names);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        View view = new View();
    }
}
