package physics.engine.body;

import com.google.common.collect.Lists;

import java.util.List;

public class Universe {

    private final List<Body> bodies = Lists.newArrayList();

    public void addBody(Body body) {
        bodies.add(body);
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public void simulate(double time, double xAcceleration, double yAcceleration) {
        // Do something
        bodies.forEach((body)-> updatePosition(body, time, xAcceleration, yAcceleration));
    }

    private void updatePosition(Body body, double time, double xForce, double yForce) {
        double distanceX = body.getXVelocity() * time;
        double distanceY = body.getYVelocity() * time;
        body.setXVelocity(body.getXVelocity()+((xForce / body.getMass()) * time));
        body.setYVelocity(body.getYVelocity()+((yForce / body.getMass()) * time));
        body.setXPosition(body.getXPosition()+distanceX);
        body.setYPosition(body.getYPosition()+distanceY);

    }

}
