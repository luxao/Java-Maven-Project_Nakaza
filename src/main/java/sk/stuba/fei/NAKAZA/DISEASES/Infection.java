package sk.stuba.fei.NAKAZA.DISEASES;

public abstract class Infection {

    /**Model choroby mi predstavuje trieda infection*/

    private String typeInfection;
    private double gama;
    private double beta;

    public Infection(String typeInfection, double gama, double beta) {
        this.typeInfection = typeInfection;
        this.gama = gama;
        this.beta = beta;
    }

    public double getGama() {
        return gama;
    }

    public void setGama(double gama) {
        if (gama <= 0) {
            throw new IllegalArgumentException("Bad Value was set for gama");
        }
        this.gama = gama;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        if (beta <= 0) {
            throw new IllegalArgumentException("Bad Value was set for beta");
        }
        this.beta = beta;
    }

    public double getR0(double gama,double beta) {
        return  beta/gama;
    }

    public String getTypeInfection() {
        return typeInfection;
    }

    public void setTypeInfection(String typeInfection) {
        if (typeInfection == null || typeInfection.isEmpty()) {
            throw new IllegalArgumentException("Bad Value was set for typeInfection");
        }

        this.typeInfection = typeInfection;
    }
}
