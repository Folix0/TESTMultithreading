import java.awt.*;

public class Participant {

    int x;
    int y;
    int width;
    int height;
    int speed;

    public Participant(int newx, int newy){
        x = newx;
        y = newy;
    }

    public void paintMe(Graphics g) {

    }

    public int getX(){
        return x;
    }

    public void setX(int newx) {
        this.x = newx;
    }

    public int getSpeed() {
        return speed;
    }
}
