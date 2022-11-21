package Lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class Task1 {

    public static void main(String[] args) {


        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() {

                        JFrame labFrame = new lab6Window("Lab6");

                    }
                });


    }

    static class lab6Window extends JFrame
    {


        lab6Window(String title)
        {

            super(title);

            JPanel mainPanel = new lab6Window.MyPanel();

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
                //setBackground(new Color(234, 255, 207));

                JMenuBar menuBar = new JMenuBar();
                JMenu programMenu = new JMenu("Програма");
                JMenu editMenu = new JMenu("Правка");

                JMenuItem checkMenuItem = new JMenuItem("Перевірка");
                JMenuItem calculateMenuItem = new JMenuItem("Обчислити");
                JMenuItem exitMenuItem = new JMenuItem("Вийти");

                programMenu.add(checkMenuItem);
                programMenu.add(calculateMenuItem);
                programMenu.addSeparator();
                programMenu.add(exitMenuItem);

                JMenuItem copyMenuItem = new JMenuItem("Копіювати");
                JMenuItem pasteMenuItem = new JMenuItem("Вставити");

                editMenu.add(copyMenuItem);
                editMenu.add(pasteMenuItem);

                menuBar.add(programMenu);
                menuBar.add(editMenu);

                add(menuBar);
                setJMenuBar(menuBar);
                Font defaultFont = new Font("Times New Roman", Font.BOLD, 16);

                int currPic = 1;

                ImageIcon pic1=new ImageIcon("E:\\ПП, 4 курс, 1 семестр\\Програмування застосунків в середовищі Java\\JavaLabs\\JavaLabs\\src\\Lab6\\pic1.png");
                Image image = pic1.getImage();
                Image newimg = image.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
                pic1 = new ImageIcon(newimg);

                ImageIcon pic2=new ImageIcon("E:\\ПП, 4 курс, 1 семестр\\Програмування застосунків в середовищі Java\\JavaLabs\\JavaLabs\\src\\Lab6\\pic2.png");
                image = pic2.getImage();
                newimg = image.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH);
                pic2 = new ImageIcon(newimg);

                JPopupMenu contextMenu = new JPopupMenu();
                JMenuItem changeMenuItem = new JMenuItem("Змінити");
                JMenuItem deleteMenuItem = new JMenuItem("Видалити");
                JMenuItem addBorderMenuItem = new JMenuItem("Додати рамку");
                contextMenu.add(changeMenuItem);
                contextMenu.add(deleteMenuItem);
                contextMenu.add(addBorderMenuItem);



                //JLabel lIcon = new JLabel("poopoo",pic1,SwingConstants.RIGHT);
                //doesn't work with relative path)))))))
                JLabel lIcon = new JLabel(pic1);
                lIcon.setBounds(defaultX,10,80,80);
                add(lIcon);

                ImageIcon finalPic = pic2;
                changeMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        lIcon.setIcon(finalPic);
                        revalidate();
                    }
                });

                addBorderMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        lIcon.setBorder(BorderFactory.createLineBorder(new Color(210, 210, 210),1));
                        revalidate();
                    }
                });

                deleteMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e)
                    {
                        lIcon.setIcon(null);
                        revalidate();
                    }
                });

                lIcon.setComponentPopupMenu(contextMenu);

                JLabel lName = new JLabel("ПІБ:",SwingConstants.RIGHT);
                lName.setBounds(defaultX,90,80,20);
                lName.setFont(defaultFont);
                add(lName);

                JTextField tfName = new JTextField();
                tfName.setBounds(defaultX+85,90,200,20);
                tfName.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfName.setForeground(Color.gray);
                add(tfName);

                JLabel lMark1 = new JLabel("Оцінка1:",SwingConstants.RIGHT);
                lMark1.setBounds(defaultX,120,80,20);
                lMark1.setFont(defaultFont);
                add(lMark1);

                JTextField tfMark1 = new JTextField();
                tfMark1.setBounds(defaultX+85,120,200,20);
                tfMark1.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMark1.setForeground(Color.gray);
                add(tfMark1);

                JLabel lMark2 = new JLabel("Оцінка2:",SwingConstants.RIGHT);
                lMark2.setBounds(defaultX,150,80,20);
                lMark2.setFont(defaultFont);
                add(lMark2);

                JTextField tfMark2 = new JTextField();
                tfMark2.setBounds(defaultX+85,150,200,20);
                tfMark2.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMark2.setForeground(Color.gray);
                add(tfMark2);

                JLabel lMark3 = new JLabel("Оцінка3:",SwingConstants.RIGHT);
                lMark3.setBounds(defaultX,180,80,20);
                lMark3.setFont(defaultFont);
                add(lMark3);

                JTextField tfMark3 = new JTextField();
                tfMark3.setBounds(defaultX+85,180,200,20);
                tfMark3.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMark3.setForeground(Color.gray);
                add(tfMark3);

                JLabel lMark4 = new JLabel("Оцінка4:",SwingConstants.RIGHT);
                lMark4.setBounds(defaultX,210,80,20);
                lMark4.setFont(defaultFont);
                add(lMark4);

                JTextField tfMark4 = new JTextField();
                tfMark4.setBounds(defaultX+85,210,200,20);
                tfMark4.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMark4.setForeground(Color.gray);
                add(tfMark4);

                JLabel lMark5 = new JLabel("Оцінка5:",SwingConstants.RIGHT);
                lMark5.setBounds(defaultX,240,80,20);
                lMark5.setFont(defaultFont);
                add(lMark5);

                JTextField tfMark5 = new JTextField();
                tfMark5.setBounds(defaultX+85,240,200,20);
                tfMark5.setBorder(BorderFactory.createLineBorder(new Color(198, 217, 175),1));
                tfMark5.setForeground(Color.gray);
                add(tfMark5);

                JButton sendButton = new JButton("Продовжити");
                sendButton.setBounds(125,355,140,30);
                sendButton.setBackground(new Color(227, 227, 226));
                sendButton.setFont(defaultFont);
                sendButton.setBorder(BorderFactory.createLineBorder(new Color(210, 210, 210),1));
                sendButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int sum =Integer.parseInt(tfMark1.getText())+Integer.parseInt(tfMark2.getText())+Integer.parseInt(tfMark3.getText())+Integer.parseInt(tfMark4.getText())+Integer.parseInt(tfMark5.getText());
                            JOptionPane.showMessageDialog(lab6Window.this,
                                    sum/5,
                                    "Середня оцінка",
                                    JOptionPane.PLAIN_MESSAGE);
                        }
                        catch (NumberFormatException er)
                        {
                            JOptionPane.showMessageDialog(lab6Window.this,
                                    "Введіть натуральні числові оцінки",
                                    "Помилка",
                                    JOptionPane.WARNING_MESSAGE);
                        }


                    }
                });
                add(sendButton);

                exitMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                //shitcode
                checkMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            if (Integer.parseInt(tfMark1.getText())>=0 &&Integer.parseInt(tfMark1.getText())<=100 &&
                                    Integer.parseInt(tfMark2.getText())>=0 &&Integer.parseInt(tfMark2.getText())<=100 &&
                                    Integer.parseInt(tfMark3.getText())>=0 &&Integer.parseInt(tfMark3.getText())<=100 &&
                                    Integer.parseInt(tfMark4.getText())>=0 &&Integer.parseInt(tfMark4.getText())<=100 &&
                                    Integer.parseInt(tfMark5.getText())>=0 &&Integer.parseInt(tfMark5.getText())<=100)
                            {
                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Віп оцінки",
                                        "Перевірка оцінок",
                                        JOptionPane.PLAIN_MESSAGE);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Retarded monke",
                                        "PoroSad",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        catch (NumberFormatException er)
                        {
                            JOptionPane.showMessageDialog(lab6Window.this,
                                    "Введіть натуральні числові оцінки",
                                    "Помилка",
                                    JOptionPane.WARNING_MESSAGE);
                        }


                    }
                });

                calculateMenuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int sum =Integer.parseInt(tfMark1.getText())+Integer.parseInt(tfMark2.getText())+Integer.parseInt(tfMark3.getText())+Integer.parseInt(tfMark4.getText())+Integer.parseInt(tfMark5.getText());
                            JOptionPane.showMessageDialog(lab6Window.this,
                                    sum/5,
                                    "Середня оцінка",
                                    JOptionPane.PLAIN_MESSAGE);
                            System.exit(0);
                        }
                        catch (NumberFormatException er)
                        {
                            JOptionPane.showMessageDialog(lab6Window.this,
                                    "Введіть натуральні числові оцінки",
                                    "Помилка",
                                    JOptionPane.WARNING_MESSAGE);
                        }


                    }
                });

                //30
                /*
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
                sendButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Pattern onlyCyrillicPattern = Pattern.compile("[\\p{IsCyrillic}]");
                        Pattern onlyCyrillicPattern = Pattern.compile(".*\\p{InCyrillic}.*");
                        Pattern containCyrillicPattern = Pattern.compile("[\\p{IsCyrillic}]");
                        Pattern mailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",Pattern.CASE_INSENSITIVE);
                        Matcher cyrillicMatcher = onlyCyrillicPattern.matcher(tfName.getText());
                        Matcher mailMatcher = mailPattern.matcher(tfMail.getText());
                        //System.out.println(cyrillicMatcher.find());
                        //System.out.println(cyrillicMatcher.matches());
                        //System.out.println(tfName.getText());
                        //System.out.println(cyrillicMatcher.group());
                        //System.out.println(textField1.getText());

                        if (chMailing.isSelected()&&!tfPass.getText().trim().isEmpty()&&!tfPassAg.getText().trim().isEmpty()
                                &&!tfPhone.getText().trim().isEmpty()&&!tfMail.getText().trim().isEmpty()&&!tfName.getText().trim().isEmpty())
                        {
                            if (!cyrillicMatcher.matches())
                            {
                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Неправильне ім'я",
                                        "Помилка",
                                        JOptionPane.WARNING_MESSAGE);
                            } else if (!mailMatcher.matches()) {

                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Неправильна пошта",
                                        "Помилка",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                            else if (!tfPassAg.getText().equals(tfPass.getText())||(tfPassAg.getText().contains(" ")||tfPass.getText().contains(" "))
                                    ||Pattern.matches(".*\\p{InCyrillic}.*",tfPassAg.getText())||Pattern.matches(".*\\p{InCyrillic}.*",tfPass.getText()))
                            {
                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Неправильні паролі",
                                        "Помилка",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(lab6Window.this,
                                        "Персональна інформація передана Світовому Уряду",
                                        "",
                                        JOptionPane.PLAIN_MESSAGE);
                            }
                        }
                    }
                });
                add(sendButton);*/
            }

            /*@Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(new Color(94, 160, 255));
                g2.fillRect(defaultX,65,340,5);
                g2.fillRect(defaultX,135,340,5);
                g2.fillRect(defaultX,275,340,5);
                g2.fillRect(defaultX,345,340,5);
            }*/
        }


    }

}
