package Lab4;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import javax.swing.*;
import javax.swing.border.Border;

public class Task1 {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {

                        JFrame labFrame = new lab5Window("Lab5_AOP");

                    }
                });


    }

    static class lab5Window extends JFrame
    {


        lab5Window(String title)
        {

            super(title);

            JPanel mainPanel = new MyPanel();

            int defaultX = 20;



            add(mainPanel);

            int windWidth = 400, windHeight = 450;
            setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2 - windWidth/2, Toolkit.getDefaultToolkit().getScreenSize().height/2 - windHeight/2, windWidth, windHeight);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color(237, 234, 230));
            setVisible(true);
        }

        class MyPanel extends JPanel
        {
            int defaultX = 20;
            MyPanel()
            {
                setLayout(null);
                setBackground(new Color(234, 255, 207));

                Font titleFont = new Font("Times New Roman", Font.BOLD|Font.ITALIC, 20);
                Font defaultFont = new Font("Times New Roman", Font.BOLD, 16);

                JLabel lTitle = new JLabel("<html><font color=green>Персональна інформація</font> ");
                lTitle.setBounds(defaultX,10,400,20);
                lTitle.setFont(titleFont);
                add(lTitle);

                JLabel lName = new JLabel("ПІБ:",SwingConstants.RIGHT);
                lName.setBounds(defaultX,40,80,20);
                lName.setFont(defaultFont);
                add(lName);

                JTextField tfName = new JTextField();
                tfName.setBounds(defaultX+85,40,200,20);
                tfName.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfName.setForeground(Color.gray);
                add(tfName);

                JLabel lMail = new JLabel("E-mail:",SwingConstants.RIGHT);
                lMail.setBounds(defaultX,75,80,20);
                lMail.setFont(defaultFont);
                add(lMail);


                JTextField tfMail = new JTextField();
                tfMail.setBounds(defaultX+85,75,200,20);
                tfMail.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMail.setForeground(Color.gray);
                add(tfMail);
                //35
                JLabel lPhone = new JLabel("Телефон:",SwingConstants.RIGHT);
                lPhone.setBounds(defaultX,110,80,20);
                lPhone.setFont(defaultFont);
                add(lPhone);


                JTextField tfPhone = new JTextField();
                tfPhone.setBounds(defaultX+85,110,200,20);
                tfPhone.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfPhone.setForeground(Color.gray);
                add(tfPhone);

                JLabel lInfo = new JLabel("<html><font color=red>Додаткова інформація:</font>");
                lInfo.setBounds(defaultX,145,200,20);
                lInfo.setFont(defaultFont);
                add(lInfo);

                JTextArea tfInfo = new JTextArea();
                tfInfo.setLineWrap(true);
                tfInfo.setForeground(Color.gray);
                tfInfo.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfInfo.setBounds(defaultX,170,340,100);
                add(tfInfo);

                JLabel lPass = new JLabel("Пароль:",SwingConstants.RIGHT);
                lPass.setBounds(defaultX,285,130,20);
                lPass.setFont(defaultFont);
                add(lPass);

                JPasswordField tfPass = new JPasswordField();
                tfPass.setBounds(defaultX+85+50,285,150,20);
                tfPass.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfPass.setForeground(Color.gray);
                add(tfPass);

                JLabel lPassAg = new JLabel("Пароль(повтор):",SwingConstants.RIGHT);
                lPassAg.setBounds(defaultX,320,130,20);
                lPassAg.setFont(defaultFont);
                add(lPassAg);

                JPasswordField tfPassAg = new JPasswordField();
                tfPassAg.setBounds(defaultX+85+50,320,150,20);
                tfPassAg.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfPassAg.setForeground(Color.gray);
                add(tfPassAg);

                JCheckBox chMailing = new JCheckBox("Хочу отримувати розсилку", true);
                chMailing.setBounds(defaultX,360,150,20);
                chMailing.setBackground(new Color(234, 255, 207));
                chMailing.setFont(new Font("Times New Roman", Font.ITALIC, 10));
                add(chMailing);

                JButton sendButton = new JButton("Продовжити");
                sendButton.setBounds(220,355,140,30);
                sendButton.setBackground(new Color(227, 227, 226));
                sendButton.setFont(defaultFont);
                sendButton.setBorder(BorderFactory.createLineBorder(new Color(210, 210, 210),1));
                add(sendButton);
            }

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(new Color(94, 160, 255));
                g2.fillRect(defaultX,65,340,5);
                g2.fillRect(defaultX,135,340,5);
                g2.fillRect(defaultX,275,340,5);
                g2.fillRect(defaultX,345,340,5);
            }
        }


    }

}
