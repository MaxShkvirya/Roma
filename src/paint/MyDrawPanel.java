package paint;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
    // поверхность для рисования
    // запускается после всего в main для нарисовывания автоматически и изменяет цвет фигуры(перерисовывая всю панель-рамка отображения(рисования) при отловленом клике кнопки
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\Users\\Maks\\Pictures\\Screenshots\\111.jpg").getImage();
        g.setColor(Color.orange); // на оранжевом фоне
        g.fillRect(70, 70, 100, 100); // расположение фигуры

        g.drawImage(image, 30, 35, this);// размещаем картинку(это виджет(кнопка с надписью / поле)
                                        //в панель-рамке отображения(рисования)

        g.fillRect(80, 80, this.getWidth(), this.getHeight());// на картинке, начиная с этих пикселей, размещаем сверху панель-рамку отображения(рисования)

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue); //окружность и цвета случайные.
        g.setColor(randomColor);                        // случайный цвет
        g.fillOval(120, 120, 100, 100); // 70 слева пикселей, 70 пикселей сверху, размер 100, размер 100

//1111111111111111111111111111111111111111111111111111111111111111111111111111
//        Graphics2D g2d = (Graphics2D) g;
//
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//        Color startColor = new Color(red, green, blue);
//
//        red = (int) (Math.random() * 255);
//        green = (int) (Math.random() * 255);
//        blue = (int) (Math.random() * 255);
//        Color endColor = new Color(red, green, blue);
//
//        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
//        g2d.setPaint(gradient);
//        g2d.fillOval(70, 70, 100, 100);
    }
}
