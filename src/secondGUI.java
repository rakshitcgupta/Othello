import sun.java2d.Disposer;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Rakshit on 12-Oct-16.
 */
public class secondGUI {
static JFrame frame = new JFrame();
    private JPanel pan;
    private JPanel count;
    public secondGUI() {
frame.setTitle("othello");
        //super("Othello.exe");
       /* JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menubar.add(menu);
        JMenuItem newgame,exit,about;
        newgame= new JMenuItem("New Game");
        menu.add(newgame);
        exit = new JMenuItem("Exit");
        menu.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu = new JMenu("Edit");
        menubar.add(menu);*/


        // if (state == STATE.MENU) {
        //Where the GUI is created:
/*        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

//Create the menu bar.
        menuBar = new JMenuBar();

//Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

//a group of JMenuItems
        menuItem = new JMenuItem("A text-only menu item",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Both text and icon",
                new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu.add(menuItem);

        menuItem = new JMenuItem(new ImageIcon("images/middle.gif"));
        menuItem.setMnemonic(KeyEvent.VK_D);
        menu.add(menuItem);

//a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();
        rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Another one");
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        menu.add(rbMenuItem);

//a group of check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Another one");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        menu.add(cbMenuItem);

//a submenu
        menu.addSeparator();
        submenu = new JMenu("A submenu");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JMenuItem("An item in the submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.ALT_MASK));
        submenu.add(menuItem);

        menuItem = new JMenuItem("Another item");
        submenu.add(menuItem);
        menu.add(submenu);

//Build second menu in the menu bar.
        menu = new JMenu("Another Menu");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);
*/
        frame.setSize(1200, 768);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     //   frame.setResizable(false);
        GameButtons a = new GameButtons();
       // new GameButtons();
        pan = GameButtons.getPanel();
        count = GameButtons.getPanelCount();
        frame.add(pan, BorderLayout.WEST);
        frame.add(count, BorderLayout.EAST);
        frame.setVisible(true);
//        setJMenuBar(menuBar);
        //  }
    }
    public static void removeFrame()
    {
        frame.dispose();
        new Game();
    }
}

/*private void initComponents(Container pane) {
		pane.setLayout(new GridBagLayout());
		GridBagConstraints constrains = new GridBagConstraints();
		ButtonGroup buttongroup = new ButtonGroup();
		JRadioButtonMenuItem radiobutton;

		/* paint the menubar */
//JMenuBar menubar = new JMenuBar();
    /* add menu and items */
/*JMenu menu = new JMenu("File");
		menubar.add(menu);
                JMenuItem exit, about;

                newgame = new JMenuItem("New Game");
                menu.add(newgame);

                exit = new JMenuItem("Exit");
                menu.add(exit);
                exit.addActionListener(new ActionListener() {

@Override
public void actionPerformed(ActionEvent evt) {
        System.exit(0);
        }
        });


        menu = new JMenu("Edit");
        menubar.add(menu);
        */
