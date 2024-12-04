// Importing packages/libraries 

import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 

// Class that makes the GUI

public class Pet extends JFrame{
    // Create member vars of class 
    // Properties of pet
    private int hunger = 50; 
    private int happiness = 50;
    private int energy = 50;

    //labels for GUI
    private JLabel statusLabel; 
    private JLabel petLabel;

    //constructor class

    public VirtualPet(){
        //set title 
        super("Virtual Pet - Nibbles");

        // Set size of window 
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // create label for pet img
        petLabel = new JLabel("<html>^._.^<br> (=>^<=)</html>", SwingConstants.CENTER);
        petLabe;.setFont(new Font("Monospaced", Font.PLAIN, 24));

        statusLabel = new JLabel("", SwingConstants.CENTER);
        updateStatus();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create button to feed 
        JButton feedButtom = new JButton("Feed");

        feedButton.addActionListener(e -> {
            hunger = Math.max(0, hunger - 20);
            energy = Math.min(100, energy + 10);
            updateStatus();
            petLabel.setText("<html>^o.o^<br>  (=>^<=)</html>");
            new Timer(1000, evt ->{
                petLabel.setText("<html>^._.^<br> (=>^<=)</html>")
                ((Timer)evt.getSource()).stop;
            }).start();
        });

    JButton playButton = new JButton("Play");

    playButton.addactionListenr(e -> {
        
        hunger = Math.max(0, happiness + 20);

        energy = Math.min(100, energy -20);

        hunger = Math.min(100, hunger +10);

        updateStatus();
        petLabel.setText("")
    })

    }




}