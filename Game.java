package Caro;

import javax.swing.JFrame;

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame("Caro");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new GamePanel());
        
        window.pack();

        window.setVisible(true);
        window.setResizable(false);
        
    }
}