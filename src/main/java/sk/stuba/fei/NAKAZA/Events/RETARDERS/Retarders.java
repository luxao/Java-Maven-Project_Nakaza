package sk.stuba.fei.NAKAZA.Events.RETARDERS;

public abstract class Retarders {

    /**
     pre spomalovaie eventy som si implementoval abstraktnu triedu spomalovacov
     */
    private int protectedPeople;
    private double effect;
    private String nameEvent;
    private boolean activation;

    public Retarders(int protectedPeople, double effect, String nameEvent) {
        this.protectedPeople = protectedPeople;
        this.effect = effect;
        this.nameEvent = nameEvent;
        this.activation = false;
    }

    public int getProtectedPeople() {
        return protectedPeople;
    }

    public double getEffect() {
        return effect;
    }


    public String getNameEvent() {
        return nameEvent;
    }

    public boolean isActivation() {
        return activation;
    }

    public void setActivation(boolean activation) {
        this.activation = activation;
    }

    public void setProtectedPeople(int protectedPeople) {
        if (protectedPeople < 0) {
            throw new IllegalArgumentException("Bad Value was set for protectedPeople");
        }
        this.protectedPeople = protectedPeople;
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
