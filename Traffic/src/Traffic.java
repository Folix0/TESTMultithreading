import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO watch the videos! https://www.youtube.com/watch?v=WGwce942leg

public class Traffic implements ActionListener, Runnable{
    JFrame frame = new JFrame("Traffic Simulation");
    Road road = new Road();
    //South container
    JButton start = new JButton("Start");
    JButton stop = new JButton("Stop");
    Container south = new Container();
    //West container
    JButton car = new JButton("Add Car");
    JButton pedestrian = new JButton("Add Pedestrian");
    Container west = new Container();

    boolean running = false;


    public Traffic (){
        frame.setSize(1000,  800);
        frame.setLayout(new BorderLayout());
        frame.add(road, BorderLayout.CENTER);

        south.setLayout(new GridLayout(1,2));
        south.add(start);
        start.addActionListener(this);
        south.add(stop);
        stop.addActionListener(this);
        frame.add(south,BorderLayout.SOUTH);

        west.setLayout(new GridLayout(3,1 ));
        west.add(car);
        car.addActionListener(this);
        west.setLayout(new GridLayout(3,1 ));
        west.add(pedestrian);
        pedestrian.addActionListener(this);
        frame.add(west, BorderLayout.WEST);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Car testCar = new Car(10,20);
        road.addCar(testCar);
        frame.repaint();

        Pedestrian testPedestrian = new Pedestrian(10,200);
        road.addCar(testPedestrian);
        frame.repaint();
    }

    public static void main (String[] args){
        new Traffic ();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource().equals(start)){
            if (running == false){
                running = true;
                Thread t = new Thread(this);
                t.start();
            }
        }
        if (event.getSource().equals(stop)){
            running = false;
        }

    }

    @Override
    public void run() {
        while (running == true){
            road.step();
            frame.repaint();
            try{
                Thread.sleep(20);
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
