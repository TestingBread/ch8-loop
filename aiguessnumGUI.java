import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class aiguessnumGUI {
    private int score = 100;
    private int target;
    private Random RNG = new Random();
    
    // UI Components
    private JFrame frame;
    private JTextField inputField;
    private JLabel messageLabel;
    private JLabel scoreLabel;
    private JProgressBar scoreBar;

    String[] encouragements = {
        "Keep going, you're doing great! ✨",
        "So close! Give it another shot. 🎯",
        "I believe in you! 🌟",
        "You've almost got it! 🔥",
        "Great guess, try again! 🌈"
    };

    public aiguessnumGUI() {
        target = RNG.nextInt(100) + 1;
        initializeUI();
    }

    private void initializeUI() {
        // Setup Window
        frame = new JFrame("The Happy Number Guesser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        // Components
        messageLabel = new JLabel("I've picked a number between 1-100!", SwingConstants.CENTER);
        inputField = new JTextField();
        JButton guessButton = new JButton("Guess!");
        scoreLabel = new JLabel("Score: 100", SwingConstants.CENTER);
        
        scoreBar = new JProgressBar(0, 100);
        scoreBar.setValue(100);
        scoreBar.setForeground(Color.GREEN);

        // Action Listener
        guessButton.addActionListener(e -> checkGuess());
        
        // Add to frame
        frame.add(messageLabel);
        frame.add(inputField);
        frame.add(guessButton);
        frame.add(scoreLabel);
        frame.add(scoreBar);

        frame.setVisible(true);
    }

    private void checkGuess() {
        try {
            int number = Integer.parseInt(inputField.getText());

            if (number == target) {
                messageLabel.setText("🎉 Correct! You're a star! 🎉");
                JOptionPane.showMessageDialog(frame, "Final Score: " + score + "\nExcellent job!");
                System.exit(0);
            } else if (number > target) {
                messageLabel.setText("Too high! " + encouragements[RNG.nextInt(encouragements.length)]);
                score--;
            } else {
                messageLabel.setText("Too low! " + encouragements[RNG.nextInt(encouragements.length)]);
                score--;
            }

            updateScore();
            inputField.setText("");
            inputField.requestFocus();

        } catch (NumberFormatException ex) {
            messageLabel.setText("Oops! That's not a number! 😅");
        }
    }

    private void updateScore() {
        scoreLabel.setText("Score: " + score);
        scoreBar.setValue(score);
        
        // Change bar color as it gets lower
        if (score < 50) scoreBar.setForeground(Color.ORANGE);
        if (score < 20) scoreBar.setForeground(Color.RED);
    }

    public static void main(String[] args) {
        // Run in the Event Dispatch Thread for Swing safety
        SwingUtilities.invokeLater(() -> new aiguessnumGUI());
    }
}