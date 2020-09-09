package exercises.technology.gear;

public class SmartPhone extends Computer{

    private boolean lowBattery = false;

    public SmartPhone(boolean aIsOn, boolean aInOperation, boolean aUpdated, boolean aLowBattery) {
        super(aIsOn, aInOperation, aUpdated);
        lowBattery = aLowBattery;
    }

    public void chargePhone() {
        lowBattery = true;
    }
}
