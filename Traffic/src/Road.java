import javax.swing.*;
import java.awt.*;

public class Road extends JPanel {

    final int LANE_HEIGHT = 150;

    public Road(){
        super();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        g.setColor(Color.WHITE);
        for (int i = LANE_HEIGHT; i < 600; i = i + LANE_HEIGHT) {
            for (int j = 0; j < getWidth() ; j = j + 40) {
                g.fillRect(j, i, 30,5);
            }
        }
    }
}
