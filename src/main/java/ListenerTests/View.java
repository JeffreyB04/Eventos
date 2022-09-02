package ListenerTests;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View {
    private JButton add;
    private JButton delete;
    private JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    public View() {  //it should be two different classes
        ButtonMouseListener bml = new ButtonMouseListener();
       // add.addMouseListener(bml);
       // delete.addMouseListener(bml);
//generated
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                System.out.println("Add!");
            }
        });
        delete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                System.out.println("Delete!");
            }
        });
    }

}


