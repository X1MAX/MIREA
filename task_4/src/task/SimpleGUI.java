package task;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI {
    private int AC_Milan = 0;
    private int Real_Madrid = 0;
    private static JButton b1 = new JButton("AC Milan");
    private static JButton b2 = new JButton("Real Madrid");
    private JFrame frame = new JFrame("Football");
    private JLabel label1 = new JLabel("Result: " + AC_Milan + " X " + Real_Madrid);  //Result: 0 X 0
    private JLabel label2 = new JLabel("/ Last Scorer: N/A");
    private Label label3 = new Label("/ Winner: DRAW");
    JPanel panel = new JPanel();


    public SimpleGUI() {

        panel.setLayout(new GridBagLayout());
        panel.add(b1);
        panel.add(b2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(550, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        b1.addActionListener(ae ->{
            AC_Milan += 1;
            label1.setText("Result: " + AC_Milan + " X " + Real_Madrid);
            label2.setText("/ Last Scorer: AC Milan");
            if(AC_Milan > Real_Madrid)
            {
                label3.setText("/ Winner: AC Milan");
            }
            else
            {
                label3.setText("/ Winner: Real Madrid");
            }
            if(AC_Milan == Real_Madrid)
            {
                label3.setText("/ Winner: DRAW");
            }
        });

        b2.addActionListener(ae ->{
            Real_Madrid += 1;
            label1.setText("Result: " + AC_Milan + " X " + Real_Madrid);
            label2.setText("/ Last Scorer: Real Madrid");
            if(AC_Milan > Real_Madrid)
            {
                label3.setText("/ Winner: AC Milan");
            }
            else
            {
                label3.setText("/ Winner: Real Madrid");
            }
            if(AC_Milan == Real_Madrid)
            {
                label3.setText("/ Winner: DRAW");
            }
        });
    }

}
