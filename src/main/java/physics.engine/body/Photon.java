package physics.engine.body;

public class Photon extends Body {


    public Photon(double x, double y, double vx, double vy) {
        super(x, y, vx, vy, 0);
    }

    @Override
    public void setXVelocity(double velocity) {

    }

    @Override
    public void setYVelocity(double velocity) {

    }

    @Override
    public void setMass(double mass) {
        super.setMass(mass);
    }
}
