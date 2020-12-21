import java.awt.*;

public class Car extends Participant{

    public Car(int newx, int newy){
        super(newx, newy);
        width = 80;
        height = 40;
        speed = 5;
    }

    // TEST TEST


    public void paintMe(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x,y,width,height);
    }
}
