import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//import static javax.swing.JFrame.EXIT_ON_CLOSE;

//import static com.sun.glass.ui.Cursor.setVisible;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Rakshit on 12-Oct-16.
 */
public class Menu {

    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){

    }

    public Menu()
    {
      //  super("othello");
        JFrame frame = new JFrame("Menu");

        frame.setSize(700, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.getGraphics();
        frame.setName("ghchg");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(8, 8, 1, 1));
     /*   //GameButtons a = new GameButtons();
       JPanel panel12 = new JPanel();
        /*JButton button[] = new JButton[3];
        button[0] = new JButton("start");
        button[0].setName("start");
        button[0].setText("Start Game");
       // button[0].addActionListener(e);
        panel12.add(button[0]);
        panel12.setVisible(true);*/
/*
        JButton jb = new JButton("staert");
        jb.setEnabled(true);

       panel12.add(jb);*/
        frame.add(p);
        frame.setVisible(true);
    }
   /* public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(100,100,100,100);
    }*/
 /*  public static void main(String args[])
   {
       new Menu();
   }**/
}
