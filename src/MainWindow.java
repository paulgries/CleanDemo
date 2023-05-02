import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(String title) {
        this.setTitle(title);
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container firstContentPane = this.getContentPane();
        JButton button = new JButton("Click Me");
        firstContentPane.add(button);
    }
}
