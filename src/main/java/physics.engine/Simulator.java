package physics.engine;

import physics.engine.body.Body;
import physics.engine.body.Particle;
import physics.engine.body.Photon;
import physics.engine.body.Universe;

import javax.swing.*;
import java.awt.*;

public class Simulator extends JPanel {

    private final static long SIMULATION_LENGTH = 100;
    private final static int UNIVERSE_SIZE_X = 1000;
    private final static int UNIVERSE_SIZE_Y = 1000;

    private final Universe universe = new Universe();

    public Simulator() {
        /*
        * Set Up The Universe here
        * universe.addBody(.....)
        */
        universe.addBody(new Particle(0,0,1,0,40));
        universe.addBody(new Photon(0,0,10,5));
        runSimulation();
    }

    private void runSimulation() {
        this.setPreferredSize(new Dimension(UNIVERSE_SIZE_X, UNIVERSE_SIZE_Y));

        Thread simulationThread = new Thread() {
            public void run() {
                int time = 0;
                while (time < SIMULATION_LENGTH) {
                    universe.simulate(1, 1, 0);
                    repaint();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {}
                    time++;
                }
            }
        };
        simulationThread.start();
    }

    /*
    * Paints the universe
    * positions are adjusted so (0,0) should be in the center of the screen
    */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Body body : universe.getBodies()){
            if(body instanceof Photon) {
                g.setColor(Color.RED);
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillOval(
                    (int)(UNIVERSE_SIZE_X / 2 + body.getXPosition()),
                    (int)(UNIVERSE_SIZE_Y / 2 - body.getYPosition()),
                    UNIVERSE_SIZE_X / 100,
                    UNIVERSE_SIZE_Y / 100
            );
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Physics Simulation");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setContentPane(new Simulator());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
