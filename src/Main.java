import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame("Hey Cool, a Window");
        mainWindow.setSize(300, 400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container firstContentPane = mainWindow.getContentPane();
        JButton button = new JButton("Click Me");
        firstContentPane.add(button);

        mainWindow.setVisible(true);
    }
}