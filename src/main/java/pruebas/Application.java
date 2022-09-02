package pruebas;
import javax.swing.*;
public class Application {
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NumbusLookAndFeel");}
        catch(Exception ex){};
        View view = new View();
        JFrame window = new JFrame();
        window.setSize(600,300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Botones");
        window.setContentPane(view.getPanel());
        window.setVisible(true);
    }
}
