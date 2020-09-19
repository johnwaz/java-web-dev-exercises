package exercises.technology.gear;

public class Computer extends AbstractEntity{

    private boolean isOn = true;
    private boolean inOperation = true;
    private boolean updated = true;

    public Computer(boolean aIsOn, boolean aInOperation, boolean aUpdated) {
        isOn = aIsOn;
        inOperation = aInOperation;
        updated = aUpdated;
    }

    /**** Getters and Setters ****/

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean isInOperation() {
        return inOperation;
    }

    public void setInOperation(boolean inOperation) {
        this.inOperation = inOperation;
    }

    public boolean isUpdated() {
        return updated;
    }

    public void setUpdated(boolean updated) {
        this.updated = updated;
    }

    /**** Instance Methods ****/

    public void sleep() {
        isOn = true;
        inOperation = false;
    }

    public void restart() {
        updated = false;
    }

    @Override
    public int assignId(int id) {
        return id;
    }
}
