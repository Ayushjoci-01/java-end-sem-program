import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VowelCountGUI extends JFrame {

    private JTextField inputField;
    private JTextField outputField;
    private JButton countButton;
    private JButton resetButton;
    private JButton exitButton;

    public VowelCountGUI() {
        // Set up the JFrame
        setTitle("Vowel Count Application");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create components
        JLabel inputLabel = new JLabel("Enter a string:");
        inputField = new JTextField(20);

        JLabel outputLabel = new JLabel("Number of vowels:");
        outputField = new JTextField(10);
        outputField.setEditable(false); // Output field should not be editable

        countButton = new JButton("CountVowel");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        // Layout setup using BorderLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(inputLabel, constraints);

        constraints.gridx = 1;
        panel.add(inputField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(outputLabel, constraints);

        constraints.gridx = 1;
        panel.add(outputField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(countButton, constraints);

        constraints.gridy = 3;
        panel.add(resetButton, constraints);

        constraints.gridy = 4;
        panel.add(exitButton, constraints);

        // Add panel to the JFrame
        add(panel);

        // Event handling for buttons
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                int vowelCount = countVowels(input);
                outputField.setText(String.valueOf(vowelCount));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                outputField.setText("");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Method to count vowels in a string
    private int countVowels(String str) {
        int count = 0;
        String lowercaseStr = str.toLowerCase();
        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VowelCountGUI().setVisible(true);
            }
        });
    }
}
