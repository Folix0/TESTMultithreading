import java.awt.*;

public class Pedestrian extends Participant {

    public Pedestrian(int newx, int newy){
        super(newx, newy);
        width = 10;
        height = 10;
        speed = 2;
    }


    public void paintMe(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x,y,width,height);
    }
}
