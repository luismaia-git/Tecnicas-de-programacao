import javax.swing.*;
import java.awt.*;



class MinhaJanela extends JFrame {

    MinhaJanela(String titulo){
        super(titulo);
        
        JLabel image = new JLabel("gauss.png");
        image.setVisible(true);
        image.setSize(200,200);

        JPanel pane = new JPanel();
        JButton botao = new JButton ("Gerar valores");
        pane.add(botao);
        setContentPane(pane);
        pack();
        setVisible(true);
        setSize(900,700);

    }
}

public class GaussView{

    public static void main(String args[] ) {
        MinhaJanela home = new MinhaJanela("GaussViewer");





     }


}

