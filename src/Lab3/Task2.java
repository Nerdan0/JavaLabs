package Lab3;

import javax.swing.*;
import java.awt.*;

public class Task2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {

                        JFrame labFrame = constructFrame();

                    }
                });
    }

    static JFrame constructFrame()
    {
        JFrame labFrame = new JFrame();
        labFrame.setVisible(true);
        int windWidth = 330, windHeight = 350;
        labFrame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2 - windWidth/2, Toolkit.getDefaultToolkit().getScreenSize().height/2 - windHeight/2, windWidth, windHeight);
        labFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labFrame.setTitle("Wise Oak Tree");
        labFrame.add(new Task2.labComponent());
        return labFrame;
    }

    static class labComponent extends JComponent
    {
        @Override
        protected void paintComponent(Graphics g){

            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D)g;

            g2.setColor(Color.BLUE);
            g2.setFont(new Font("", Font.ITALIC, 14));
            g2.drawString("Зведення генштабу",10, 20);

            g2.setColor(Color.pink);
            g2.drawLine(10,30,10,300);
            g2.drawLine(10,300,300,300);

            g2.setColor(Color.BLUE);
            g2.fillRect(11,295,50,5);
            g2.fillRect(61,60,50,240);
            g2.fillRect(111,260,50,40);

            g2.setFont(new Font("", Font.PLAIN,10));
            g2.drawString("Проти:1",11, 290);
            g2.drawString("За:48",61, 55);
            g2.drawString("Байдуже:8",111, 255);


        }

    }



}
