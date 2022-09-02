package ListenerTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMouseListener extends MouseAdapter implements MouseListener { //override MouseAdapter
    Color c;
    @Override
    public void mouseClicked(MouseEvent e){
        JButton b = (JButton) e.getSource(); //it does not compile if it is a text box
        System.out.println(b.getText());
        //System.out.println("Click!");
    }
    @Override
    public void mouseEntered(MouseEvent e){
        JButton b = (JButton) e.getSource(); //it does not compile if it is a text box
        c = b.getBackground();
        b.setBackground(Color.yellow);
    }
    @Override
    public void mouseExited(MouseEvent e){
        JButton b = (JButton) e.getSource(); //it does not compile if it is a text box
        b.setBackground(c);
    }


}