package exercises.technology.gear;

public class Laptop extends Computer{

    private boolean pluggedIn = true;

    public Laptop(boolean aIsOn, boolean aInOperation, boolean aUpdated, boolean aPluggedIn) {
        super(aIsOn, aInOperation, aUpdated);
        pluggedIn = aPluggedIn;
    }

    public void isMobile() {
        pluggedIn = false;
    }
}
