package paint.circle;

import paint.panel.MyDrawPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C  implements ActionListener { //кнопка будет передаваться только тем, кто реализует ActionListener
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();                                       //  создается панель-рамка и закрытие при нажатии
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");   //  создаётся виджет(кнопка с надписью / поле)
        button.addActionListener(this);                //кнопка добавляется к нашей панель-рамке(наслоение на нее)(регистрируем заинтересованность и слущаем!!)

        MyDrawPanel drawPanel = new MyDrawPanel();              //создаётся панель-рамка отображения(рисования)

        frame.getContentPane().add(BorderLayout.SOUTH, button);  // добавляем кнопку внизу(юг) к панель-рамке
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel); // добавляем панель-рамку отображения(рисования) к панель-рамке по центру(наслоение на нее)
        frame.setSize(300, 300);                                  //присваиваем панель-рамке размер 300*300
        frame.setVisible(true);                                    // делаем панель-рамку видимой
    }

    @Override
    public void actionPerformed(ActionEvent e) {                    // метод обработки событий
        frame.repaint();                                            // перекрашивание при нажатии на кнопку
    }
}
