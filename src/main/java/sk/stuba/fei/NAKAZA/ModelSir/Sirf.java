package sk.stuba.fei.NAKAZA.ModelSir;

public class Sirf extends ModelSir {


    private double f;

    public Sirf(int susceptible, int infectious, int recovered,double f) {
        super((int)(susceptible * (1 - f)), infectious, (int)(recovered * (1 + f)));
    }

    public double getF() {
        return f;
    }
    public void setF(double f) {
        this.f = f;
    }

}
