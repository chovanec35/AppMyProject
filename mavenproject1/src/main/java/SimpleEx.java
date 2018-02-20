
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleEx {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(500, 500);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setLayout(null);
        panel.setBounds(10, 10, 100, 100);
        window.add(panel);

        JButton button1 = new JButton("^");
        button1.setBounds(50, 0, 50, 50);
        panel.add(button1);
        
        JButton button2 = new JButton("v");
        button2.setBounds(50, 100, 50, 50);
        panel.add(button2);

    }

}
