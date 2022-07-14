package com.tripathy;



    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.net.InetAddress;

public class SwingUwu {


        public static void main(String[] args) {
            new IpSpoofs();



           /* JFrame f = new JFrame();
            f.setSize(400,600);
            f.setLayout(null);
            f.setVisible(true);

            JButton b = new JButton("uwu");
            b.setBounds(180,100,100,100);

            f.add(b);


            final JTextField oof = new JTextField();
            oof.setBounds(100,80,80,90);
            f.add(oof);

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    oof.setText("pros ");

                }
            });

            JButton b2 = new JButton(new ImageIcon("/Users/abheektripathy/Documents/Renders/helo.png"));
            b2.setSize(300,300);
            b2.setBounds(400,300,300,300);
            f.add(b2);

            JLabel l1 = new JLabel("hemlo");
            l1.setBounds(50,50,50,500);
            l1.setSize(100,100);
            f.add(l1);







*/

        }
    }

    class IpSpoofs extends Frame implements ActionListener{

        JTextField j2;
        JButton b3;
        JLabel l3;
        JFrame f2;

        public IpSpoofs() {

            j2 = new JTextField();
            j2.setBounds(50,50,50,50);

            b3 = new JButton();
            b3.setBounds(75,75,75,75);

            l3 = new JLabel();
            l3.setBounds(30,30,30,30);

            b3.addActionListener(this);

            add(b3);
            add(j2);
            add(l3);
            setSize(1000,2000);
            setLayout(null);
            setVisible(true);


        }


        @Override
        public void actionPerformed(ActionEvent e) {

            try{
                String H = j2.getText();
                String ip = String.valueOf(InetAddress.getByName(H));
                l3.setText("Ip of " + j2.getText() + " is "+ ip);
            } catch (Exception E){
                System.out.println(E);
            }



        }
    }




