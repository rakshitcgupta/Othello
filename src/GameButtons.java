import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import javax.swing.*;
import javax.swing.border.LineBorder;



public class GameButtons implements ActionListener {

    JButton buttons[][] = new JButton[8][8];
    static JPanel p = new JPanel();
    ImageIcon white, black,UO,LEL;
    boolean wturn = false;
    static JPanel p1=new JPanel();
    JLabel count = new JLabel();
    JLabel count1 = new JLabel();
    JLabel turn = new JLabel();
    JLabel total = new JLabel();
    private secondGUI gg;
    private Menu menu;

    public enum STATE{
        Menu,
        Game
    };
    public STATE gameState = STATE.Game;

    void count()
    {

        int black_count=0,white_count=0,legal_count=0;
        for(int i=0 ; i<8 ; i++)
        {
            for(int j=0 ; j<8 ; j++)
            {
                if (buttons[i][j].getName().compareTo("LEL") == 0)
                {
                    legal_count++;
                }
                if ((buttons[i][j].getName().compareTo("white")) == 0)
                {
                    white_count++;
                }
                else if ((buttons[i][j].getName().compareTo("black")) == 0)
                {
                    black_count++;
                }

            }
        }
        count.setText("black count  " + black_count);
        count.setFont(new Font("Verdana", 1, 20));
        count.revalidate();
    //    count.repaint();
        count.setVisible(true);

        count1.setText("white count  " + white_count);
        count1.setFont(new Font("Verdana", 1, 20));
        count1.revalidate();
     //   count1.repaint();
        count1.setVisible(true);

        total.setFont(new Font("Verdana", 1, 20));
        total.revalidate();
        total.repaint();
        total.setVisible(true);
        total.setText("     total " + (white_count+black_count));
        p1.add(count);
        p1.add(count1);
        p1.add(total);
        if(legal_count==0)
        {
            //JOptionPane popup = new JOptionPane();
            //popup.showInputDialog("woooooo");
            if (wturn == true) {
                int n = JOptionPane.showConfirmDialog(null, "Pass", "pass", JOptionPane.OK_OPTION);
                System.out.println(n);
                wturn = false;
            }
            else {
                if (black_count>white_count) {
                    int n = JOptionPane.showConfirmDialog(null, "Black wins \n Do you want to restart", "Black wins", JOptionPane.YES_NO_OPTION);
                    System.out.println(n);
                    if (n==0)
                    {

                        System.out.println("zhsgfygasfasdgysfdytfstgcyugsuhcvzxyugvctyvzxuycbiuzsbfyu");
                       // fra.setVisible(false);
                        //fra.getContentPane().remove(p1);
                       // fra.getContentPane().remove(p);
                        //fra.repaint();


                       // p.setEnabled(false);
                     //   p1.setEnabled(false);
                       // fra.getContentPane().removeAll();
                        p.setEnabled(false);
                        p.removeAll();
                      secondGUI.removeFrame();
                       // new Game();
                    }
                    else{
                        System.exit(0);
                    }
                }
                    else{
                int m = JOptionPane.showConfirmDialog(null, "white wins \n Do you want to restart", "white wins", JOptionPane.YES_NO_OPTION);
                System.out.println(m);
                    p.setEnabled(false);
                    p.removeAll();
                    secondGUI.removeFrame();
                   // new Game();
                  /*  if (m==0)
                    {
                        JFrame fraa ;
                        fraa=secondGUI.getFrame();
                        fraa.setVisible(false);
                        fraa.dispose();
                        new Game();
                    }
                    else{
                        System.exit(0);
                    }*/

                    }
            }
                /*JOptionPane.showInternalConfirmDialog(null,
                    "please choose one", "information",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);*/
                    /*JOptionPane.showInputDialog(null, "This is the message", "This is the default text")*/
        }

        else {


            if (wturn == true) {
                turn.setFont(new Font("Verdana", 1, 20));
                turn.setText("It is whites turn " );
                turn.revalidate();
                turn.repaint();
                turn.setVisible(true);
               // p1.setBackground(Color.white);

            }
            else
            {
                turn.setBounds(1200,300,100,100);
                turn.setFont(new Font("Verdana", 1, 20));
                turn.setText("It is blacks turn " );
                turn.revalidate();
                turn.repaint();
                turn.setVisible(true);
                //p1.setBackground(Color.black);

            }
        /* setFocusable(true);
    addKeyListener(new KeyList());
    System.out.println("GAME PANE FOCUS:" + this.isFocusOwner());

    scores.setVisible(true);
    lives = p.STARTLIVES;
    scores.setCurrentLives(lives);
    txtTest.setText("Hello");
    txtTest.setVisible(true);
    add(scores,new AbsoluteConstraints(0,550,50,800));
    Boolean displayable = scores.isDisplayable();
    System.out.println("Displayable" + displayable);

    scores.setEnabled(false);
    scores.revalidate();
    scores.repaint();
    scores.setVisible(true);*/
            //  JLabel label21=new JLabel("<html><br>hcghgjhgb<br></html>");
            // count.add(label21);

            p1.add(turn);
        }

    }

    GameButtons() {
        if (gameState == STATE.Game) {
            white = new ImageIcon("src//white3.png");
            black = new ImageIcon("src//black3.png");
            p.setLayout(new GridLayout(8, 8, 2, 2));
            p.setPreferredSize(new Dimension(700, 480));
            p1.setPreferredSize(new Dimension(276, 480));
            //  p1.setLocation(110,500);
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    buttons[i][j] = new JButton("UO");
                    buttons[i][j].setName("UO");
                    buttons[i][j].setText("");
                    buttons[i][j].setBackground(Color.RED);
                    p.add(buttons[i][j]);
                    buttons[i][j].addActionListener(this);
                }
            }


            //	buttons[3][3].setBackground(Color.RED);
            buttons[3][3].setIcon(white);
            try {
                buttons[3][3].setBounds(null);
            } catch (Exception e) {
            }
            buttons[4][4].setText("white");
            buttons[4][4].setIcon(white);
            buttons[3][4].setIcon(black);
            buttons[4][3].setText("black");
            buttons[4][3].setIcon(black);
            buttons[3][3].setName("white");
            buttons[4][4].setName("white");
            buttons[3][4].setName("black");
            buttons[4][3].setName("black");
            this.legal();
            count();
        }
        else
            if (gameState == STATE.Menu)
            {
                new Menu();
            }
    }


    //}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println(e.getSource());
        JButton bt = (JButton) e.getSource();
        int y = bt.getY();
        int x = bt.getX();
        System.out.println("x=" + x + "  `y= " + y);
        System.out.println("point"+p.getSize().getHeight());
        int totaly = (int)p.getSize().getHeight();
        int totalx = (int)p.getSize().getWidth();
        totalx /=8;
        totaly /=8;
        /*x = x / 88;
        y = y / 85;*/
        x = x / totalx;
        y = y / totaly;

		/*
		 * int i=0,j=0; for(i=0;i<8;i++) { for(j=0;j<8;j++) {
		 * if(buttons[i][j]==bt) { break; } } }
		 */
        System.out.println("x=" + x + "  `y= " + y);
        // p.setText("bye");
        if(bt.getName().compareTo("LEL")==0){
            if (wturn == false) {
                bt.setName("black");
                bt.setText("black");
                bt.setIcon(black);
                bt.setBackground(Color.red);
                this.resetLegal();
                this.fliptile(y, x);
                wturn = true;
                this.legal();
                count();

            } else {
                bt.setName("white");
                bt.setText("white");
                bt.setIcon(white);
                bt.setBackground(Color.red);
                this.resetLegal();
                this.fliptile(y, x);
                wturn = false;
                this.legal();
                count();

            }
        }
        // setText("bye");
        // System.out.println(getName());
        // if(getName()=="hi33")
        // {
        // hi44.setName("lol");
        // }
    }

    void legal() {
        int tx;
        int ty;
        int c;
        int d;
        boolean x = wturn;
        if (x == true) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((buttons[i][j].getName().compareTo("white")) == 0) {
                        // System.out.println(i+" "+j+" "+a[i][j]);
                        if ((i == 0 || i == 7) && (j == 0 || j == 7)) {
                        } else if ((i == 0) || (i == 7) || (j == 0) || (j == 7)) {
                        } else {
                            for (int n = i - 1; n <= i + 1; n++) {

                                for (int m = j - 1; m <= j + 1; m++) {
                                    // System.out.println(n+" "+m+" "+a[n][m]);
                                    if ((m != j) || (n != i)) {
                                        // System.out.println(n+" "+m+"
                                        // "+a[n][m]);


                                        try{
                                            if (buttons[n][m].getName().compareTo("black") == 0) {
                                                // System.out.println(n+" "+m+"
                                                // "+a[n][m]);
                                                tx = n - i;
                                                ty = m - j;
                                                c = n + tx;
                                                d = m + ty;
                                                // System.out.println(c+" "+d+"
                                                // "+a[c][d]);
                                                if (buttons[c][d].getName().compareTo("UO") == 0) {
                                                    buttons[c][d].setName("LEL");
                                                    buttons[c][d].setText("");
                                                    buttons[c][d].setBackground(Color.yellow);
                                                }
                                                while ((c < 8) && (c > 0) && (d < 8) && (d > 0)
                                                        && (buttons[c][d].getName() != "LEL")) {
                                                    if (buttons[c][d].getName().compareTo("white") == 0) {
                                                        break;
                                                    }
                                                    if (buttons[c][d].getName().compareTo("black") == 0) {
                                                        c = c + tx;
                                                        d = d + ty;
                                                    }
                                                    if (buttons[c][d].getName().compareTo("UO") == 0) {
                                                        buttons[c][d].setName("LEL");
                                                        buttons[c][d].setText("");
                                                        buttons[c][d].setBackground(Color.yellow);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        catch(Exception e)
                                        {
                                            System.out.println(e);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        } else {

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (buttons[i][j].getName().compareTo("black") == 0) {
                        // System.out.println(i+" Q "+j+" W "+a[i][j]);
                        if ((i == 0 || i == 7) && (j == 0 || j == 7)) {
                        } else if ((i == 0) || (i == 7) || (j == 0) || (j == 7)) {
                        } else {
                            for (int n = i - 1; n <= i + 1; n++) {

                                for (int m = j - 1; m <= j + 1; m++) {
                                    // System.out.println(n+" E "+m+" R
                                    // "+a[n][m]);
                                    if ((m != j) || (n != i)) {
                                        // System.out.println(n+" T "+m+" Y
                                        // "+a[n][m]);


                                        try{
                                            if (buttons[n][m].getName().compareTo("white") == 0) {
                                                // System.out.println(n+" U "+m+" I
                                                // "+a[n][m]);
                                                tx = n - i;
                                                ty = m - j;
                                                c = n + tx;
                                                d = m + ty;
                                                // System.out.println(c+" O "+d+" P
                                                // "+a[c][d]);
                                                if (buttons[c][d].getName().compareTo("UO") == 0) {
                                                    buttons[c][d].setName("LEL");// ="LEL";
                                                    buttons[c][d].setText("");
                                                    buttons[c][d].setBackground(Color.yellow);
                                                    System.out.println("working");
                                                }
                                                while ((c < 8) && (c > 0) && (d < 8) && (d > 0)
                                                        && (buttons[c][d].getName().compareTo("LEL") != 0)) {
                                                    if (buttons[c][d].getName().compareTo("black") == 0) {
                                                        break;
                                                    }

                                                    if (buttons[c][d].getName().compareTo("white") == 0) {
                                                        c = c + tx;
                                                        d = d + ty;
                                                        // System.out.println(c+" A
                                                        // "+d+" S "+a[c][d]);
                                                    }
                                                    if (buttons[c][d].getName().compareTo("UO") == 0) {
                                                        buttons[c][d].setName("LEL");// ="LEL";
                                                        buttons[c][d].setText("");
                                                        buttons[c][d].setBackground(Color.yellow);
                                                        // System.out.println(c+" D
                                                        // "+d+" F "+a[c][d]);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        catch(Exception e)
                                        {System.out.println(e);
                                        }

                                    }
                                }

                            }
                        }
                    }
                }
            }

            System.out.println("xyz");
        }

    }

    void resetLegal() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (buttons[i][j].getName().compareTo("LEL") == 0) {
                    buttons[i][j].setName("UO");
                    buttons[i][j].setText("");
                    buttons[i][j].setBackground(Color.red);
                }
            }
        }

    }

    void fliptile(int x, int y) {
        System.out.println("hi int");
        int tx, ty, c, d;
        if (wturn == true) {
            System.out.println("hi int2");
            for (int n = x - 1; n <= x + 1; n++) {
                System.out.println("hi int3");
                for (int m = y - 1; m <= y + 1; m++) {
                    if ((n != x) || (m != y)) {

                        try{
                            if (buttons[n][m].getName().compareTo("black") == 0) {
                                tx = n - x;
                                ty = m - y;
                                c = n + tx;
                                d = m + ty;
                                while (buttons[c][d].getName().compareTo("black") == 0) {
                                    c = c + tx;
                                    d = d + ty;
                                    System.out.println("hi1");
                                }
                                if (buttons[c][d].getName().compareTo("white") == 0) {
                                    c = c - tx;
                                    d = d - ty;
                                    while (buttons[c][d].getName().compareTo("black") == 0) {
                                        // a[c][d] = 'w';
                                        buttons[c][d].setName("white");
                                        buttons[c][d].setText("white");
                                        buttons[c][d].setIcon(white);
                                        c = c - tx;
                                        d = d - ty;
                                        System.out.println("hi2");
                                    }
                                }
                            }
                        }
                        catch(Exception e)
                        {System.out.println(e);}

                    }
                }
            }
        } else {
            for (int n = x - 1; n <= x + 1; n++) {
                System.out.println("hi int bl");
                for (int m = y - 1; m <= y + 1; m++) {
                    System.out.println("hi int bl2");
                    if ((n != x) || (m != y)) {
                        System.out.println("hi int b3");

                        try{
                            if (buttons[n][m].getName().compareTo("white") == 0) {
                                System.out.println("hi int bl4");
                                tx = n - x;
                                ty = m - y;
                                c = n + tx;
                                d = m + ty;
                                while (buttons[c][d].getName().compareTo("white") == 0) {
                                    c = c + tx;
                                    d = d + ty;
                                    System.out.println("hi int bl15");
                                }
                                if (buttons[c][d].getName().compareTo("black") == 0) {
                                    System.out.println("hi int bl16");
                                    c = c - tx;
                                    d = d - ty;
                                    while (buttons[c][d].getName().compareTo("white") == 0) {
                                        // a[c][d] = 'b';
                                        System.out.println("hi int bl17");
                                        buttons[c][d].setName("black");
                                        buttons[c][d].setText("black");
                                        buttons[c][d].setIcon(black);
                                        c = c - tx;
                                        d = d - ty;
                                    }
                                }
                            }
                        }
                        catch(Exception e)
                        {
                            System.out.println(e);
                        }

                    }
                }
            }
        }
    }

    static JPanel getPanel() {
        return p;
    }
    static JPanel getPanelCount() {
        // JLabel label  = new JLabel("", JLabel.CENTER);
        // int ll=12;

       /* label.setText("SCORE");
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);*/
        /////   /*JLabel label=new JLabel("SCORE",JLabel.LEFT);
        /////  label.setFont(new Font("Verdana",1,20));
        /////  p1.setBorder(new LineBorder(Color.BLACK));
        ////  p1.add(label);*/
        /*JLabel jlabel = new JLabel("This is a label");
    jlabel.setFont(new Font("Verdana",1,20));
    panel.add(jlabel);
    panel.setBorder(new LineBorder(Color.BLACK)); // make it easy to see*/
       // if (wturn == true)
    //    p1.setBounds(1200,300,100,100);

        return p1;
    }
}
