import javax.swing.*;
import java.awt.*;

/**
 * Created by tomas on 12/15/2017.
 */
public class SimpleWindowApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label, BorderLayout.CENTER);

        frame.pack();

        frame.setVisible(true);
    }
}
