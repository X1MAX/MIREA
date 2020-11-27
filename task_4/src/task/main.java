package task;

import java.awt.*;
import javax.swing.*;
public class main
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                SimpleGUI centeredJLabel = new SimpleGUI();
            }
        });
    }
}