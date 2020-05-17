package company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class PasekAdresu {
    JTextField poleTekstowe;

    public PasekAdresu(Okno frame){
        poleTekstowe = new JTextField("");
        frame.okno.add(poleTekstowe);
        poleTekstowe.setSize(frame.okno.getWidth(),30);
        poleTekstowe.setEditable(true);

        ActionListener EnterEvent = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
                frame.HistoriaAdresow[frame.numer++] = poleTekstowe.getText();
            }
        };

        KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0);
        poleTekstowe.registerKeyboardAction(EnterEvent,enter,JComponent.WHEN_FOCUSED);
    }



}

