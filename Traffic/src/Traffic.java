import javax.swing.*;

public class Traffic {
    JFrame frame = new JFrame("Traffic Simulation");

    public Traffic (){
        frame.setSize(800,  600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main (String[] args){
        new Traffic ();
    }
}
