package physics.engine.body;

public abstract class Body {

    private double x;
    private double y;
    private double vx;
    private double vy;
    private double mass;

    public Body(double x, double y, double vx, double vy, double mass) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.mass = mass;
    }

    public double getXPosition(){
        return x;
    }

    public double getYPosition(){
        return y;
    }

    public double getXVelocity() {
        return vx;
    }

    public double getYVelocity() {
        return vy;
    }

    public void setXPosition(Double XPosition) {
        this.x = XPosition;
    }

    public void setYPosition(Double YPosition) {
        this.y = YPosition;
    }

    public void setXVelocity(double velocity) {
        this.vx = velocity;
    }

    public void setYVelocity(double velocity) {
        this.vy = velocity;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
