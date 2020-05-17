package company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Okno {
    JFrame okno;
    PasekAdresu pasekAdresu;
    public static int numer = 0;
    public String HistoriaAdresow[] = new String[1024];
    public Okno(){
        okno = new JFrame("WireFox");
        okno.setSize(800,600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
        okno.setExtendedState(JFrame.MAXIMIZED_BOTH);

       /* JTextField pole = new JTextField("spr");
        okno.add(pole);
        pole.setSize(okno.getWidth(),30);
        pole.setLocation(0,100);
        pole.setEditable(true);

        KeyStroke alt = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        pole.registerKeyboardAction(show,alt,JComponent.WHEN_FOCUSED);
        */

        pasekAdresu = new PasekAdresu(this);

    }
    /*
    ActionListener show = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event){
            for(int i=0;i<10;i++){
                if(HistoriaAdresow[i]!=null)
                    System.out.println(HistoriaAdresow[i]);
            }
            System.out.println("---");
        }


    };*/
}