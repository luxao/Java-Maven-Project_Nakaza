package sk.stuba.fei.NAKAZA.ModelSir;

public abstract class ModelSir {
    /**
     * Pre modely SIR A SIRF som sa rozhodol spravit univerzalnu abstraktnu triedu
     */
    private int susceptible;
    private int infectious;
    private int recovered;
    private int population;


    public ModelSir(int susceptible, int infectious, int recovered) {
        this.susceptible = susceptible;
        this.infectious = infectious;
        this.recovered = recovered;
        this.population = getPopulation();
    }


    public int getPopulation() {
        return  susceptible + infectious + recovered;
    }


    public int getSusceptible() {
        return susceptible;
    }

    public void setSusceptible(int susceptible) {
        if (susceptible <= 0) {
            throw new IllegalArgumentException("Bad Value was set for susceptible");
        }
        this.susceptible = susceptible;
    }

    public int getInfectious() {
        return infectious;
    }

    public void setInfectious(int infectious) {
        if (infectious <= 0) {
            throw new IllegalArgumentException("Bad Value was set for infectious");
        }
        this.infectious = infectious;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        if (recovered < 0) {
            throw new IllegalArgumentException("Bad Value was set for recovered");
        }
        this.recovered = recovered;
    }


}
