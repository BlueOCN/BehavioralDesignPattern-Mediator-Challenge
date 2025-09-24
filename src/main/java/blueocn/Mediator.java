package blueocn;

public class Mediator {

    private Plane plane;
    private Runway runway;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;

    public Mediator() {
        this.plane = new Plane(123);
        this.runway = new Runway();
        this.planesInFlight = new PlanesInFlight();
        this.planesOnGround = new PlanesOnGround();
    }

    public void takeOff() {
        if(!this.plane.getIsInTheAir() && this.runway.getIsAvailable()) {
            System.out.println("Plane " + this.plane.getId() + " is taking off...");
            this.planesOnGround.removePlane(this.plane);
            this.planesInFlight.addPlane(this.plane);
            this.plane.setIsInTheAir(true);
            this.runway.setIsAvailable(false);
        }

    }
}
