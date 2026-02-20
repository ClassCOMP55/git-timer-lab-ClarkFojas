import acm.graphics.*;
import acm.program.*;

import javax.swing.*;
import java.awt.event.*;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {

    private GLabel myLabel;
    private int numTimes;
    private Timer t;

    public void run() {
        myLabel = new GLabel("# of times called?", 20, 40);
        add(myLabel);

        numTimes = 0;

        t = new Timer(1000, this);
        t.setInitialDelay(3000);
        t.start();
    }

    public void actionPerformed(ActionEvent e) {
        numTimes++;

        myLabel.move(5, 0);
        myLabel.setLabel("times called? " + numTimes);

        if (numTimes == 10) {
            t.stop();
        }
    }

    // Launcher for modern Eclipse/JDK (applets don't work on Java 25)
    public static void main(String[] args) {
        new MyFirstTimer().start();
    }
}