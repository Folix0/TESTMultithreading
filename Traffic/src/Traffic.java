import javax.swing.*;
import java.awt.*;

//TODO watch the videos! https://www.youtube.com/watch?v=NJFvpozCasA

public class Traffic {
    JFrame frame = new JFrame("Traffic Simulation");
    Road road = new Road();

    public Traffic (){
        frame.setSize(800,  600);
        frame.setLayout(new BorderLayout());
        frame.add(road, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main (String[] args){
        new Traffic ();
    }
}
