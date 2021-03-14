package sk.stuba.fei.NAKAZA.Events.ACCELERATORS;

public abstract class Accelerators {
    /**
     Pre urýchlovače choroby som si spravil abstraktnu classu pre eventy ktore budu od nej dedit
     */
    private int death;
    private double effect;
    private String nameEvent;
    private boolean activation;

    public Accelerators(int death, double effect, String nameEvent) {
        this.death = death;
        this.effect = effect;
        this.nameEvent = nameEvent;
        this.activation = false;
    }

    public int getDeath() {
        return death;
    }

    public double getEffect() {
        return effect;
    }

    public String getTypeEvent() {
        return nameEvent;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setDeath(int death) {
        if (death < 0) {
            throw new IllegalArgumentException("Bad Value was set for death");
        }
        this.death = death;
    }

    public void setEffect(double effect) {
        if (effect <= 0) {
            throw new IllegalArgumentException("Bad Value was set for effect");
        }
        this.effect = effect;
    }

    public void setNameEvent(String nameEvent) {
        if (nameEvent == null || nameEvent.isEmpty()) {
            throw new IllegalArgumentException("Bad Value was set for nameEvent");
        }
        this.nameEvent = nameEvent;
    }
}
