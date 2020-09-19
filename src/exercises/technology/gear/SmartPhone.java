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

    public static void main(String[] args) {

        SmartPhone johnsPhone = new SmartPhone(true, true, true, false);

        System.out.println(johnsPhone.lowBattery);
        johnsPhone.chargePhone();
        System.out.println(johnsPhone.lowBattery);

        System.out.println(johnsPhone.assignId(24));
    }
}
