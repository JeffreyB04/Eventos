package pruebas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BotonMouseListener extends MouseAdapter implements MouseListener {  //override MouseAdapter
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("Click!");
    }

}