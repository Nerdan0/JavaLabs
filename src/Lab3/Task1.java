package Lab3;

import javax.swing.*;
import java.awt.*;

public class Task1 {

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
        int windWidth = 370, windHeight = 200;
        labFrame.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2 - windWidth/2, Toolkit.getDefaultToolkit().getScreenSize().height/2 - windHeight/2, windWidth, windHeight);
        labFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labFrame.setTitle("Gato negro");
        labFrame.add(new labComponent());
        return labFrame;
    }

    static class labComponent extends JComponent
    {
        @Override
        protected void paintComponent(Graphics g){

            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D)g;

            g2.setColor(Color.RED);
            g2.setFont(new Font("", Font.BOLD, 14));
            g2.drawString("Я пес Патрон. Я кохаю дівчат.",10, 20);

            g2.setColor(Color.pink);
            int xs[] = {10, 110, 120, 110, 10};
            int ys[] = {30, 30, 80 ,130, 130};
            g2.fillPolygon(xs,ys,5);

            g2.setColor(Color.BLUE);
            xs = new int[]{15, 105, 115, 105, 15};
            ys = new int[]{35, 35, 75 ,125, 125};
            g2.fillPolygon(xs,ys,5);

            g2.setColor(Color.green);
            xs = new int[]{20, 100, 110, 100, 20};
            ys = new int[]{40, 40, 70, 120, 120};
            g2.fillPolygon(xs,ys,5);

            g2.drawString("\uD83C\uDF7C\uD83D\uDD1E\uD83C\uDFECXxX_SHXVVD∆UN_SH∆LLY_XxX\uD83C\uDFEC \uD83D\uDD1E \uD83C\uDF7C",0, 150);
        }

    }
}
