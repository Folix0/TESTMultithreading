import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Road extends JPanel {

    final int LANE_HEIGHT = 80;
    final int LANE_AMOUNT = 2;
    final int ROAD_WIDTH = 800;

    ArrayList<Participant> cars = new ArrayList<Participant>();

    public Road(){
        super();
    }

    public void addCar(Participant p){
        cars.add(p);
    }

    public void paintComponent(Graphics g) {
        //calling JFrame paint function
        super.paintComponent(g);
        //filling the whole frame with black colour
        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        //Draw the dashed lane lines
        //dashes lane lines our painted until we reach our amount of (lanes * height) limit
        g.setColor(Color.WHITE);
        for (int i = LANE_HEIGHT; i < (LANE_HEIGHT * LANE_AMOUNT); i = i + LANE_HEIGHT) {
            for (int j = 0; j < getWidth() ; j = j + 40) {
                //painting the single dashed lane line until the width of our frame
                g.fillRect(j, i, 30,5);
            }
        }
        //Draw sidewalk solid lane line
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, LANE_AMOUNT * LANE_HEIGHT, this.getWidth(),5);

        //Draw cars
        for (int i = 0; i < cars.size() ; i++) {
            cars.get(i).paintMe(g);
            
        }
    }
    public void step(){
        for (int a = 0;  a <cars.size(); a ++) {
            Participant p = cars.get(a);
            p.setX( p.getX() + p.getSpeed());
            if(p.getX() > ROAD_WIDTH){
                p.setX(0);
            }
        }
    }
}
