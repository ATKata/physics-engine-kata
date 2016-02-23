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

    public void simulate() {
        // Do something
    }

}
