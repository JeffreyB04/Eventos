package ListenerTests;

import javax.swing.*;

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


    }

}


