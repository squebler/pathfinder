import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Created by tomas on 12/15/2017.
 */
public class SimpleWindowApp {

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("FrameDemo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label, BorderLayout.CENTER);

        BufferedImage image = ImageIO.read(new File("C:\\Users\\tomas\\Dropbox\\documents2\\PathfinderCG\\automation\\blessing-of-the-gods.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(picLabel, BorderLayout.CENTER);

        frame.pack();

        frame.setVisible(true);
    }
}
