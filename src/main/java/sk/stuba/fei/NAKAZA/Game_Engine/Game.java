package sk.stuba.fei.NAKAZA.Game_Engine;

import sk.stuba.fei.NAKAZA.DISEASES.Covid19;
import sk.stuba.fei.NAKAZA.Events.ACCELERATORS.Earthquake;
import sk.stuba.fei.NAKAZA.Interaction.Interaction;
import sk.stuba.fei.NAKAZA.ModelSir.Sir;


public class Game  {

    /**Logika hry je zatial len v základoch
   testoval som si nejaké veci či fungujú
     metody su spracované jednoducho zatial

     Planujem spravit interakciu ktorá je tiež v zakladoch zatial

    */
    
    Covid19 covid19 = new Covid19("Covid19",0.5,0.9);
    Sir sir = new Sir(200,10,0);
    Earthquake earthquake = new Earthquake(15,0.15,"earthquake");
    Interaction interaction = new Interaction();

    public void Game(){
        interaction.Printable();
        System.out.println("Name of this Infection is " + covid19.getTypeInfection());
        System.out.println("Number of Population is " + sir.getPopulation());
        System.out.println("Number of Illness people is " + sir.getInfectious());
        sir.setInfectious(5);

    }

    public void nextDay(){
        double newInfected =  ( covid19.getBeta() * ( (  (double)sir.getSusceptible() *(double) sir.getInfectious() ) / (double)sir.getPopulation()));
        sir.setSusceptible(sir.getSusceptible() - (int)newInfected);
        double newRecovered = (covid19.getGama() * sir.getInfectious());
        sir.setInfectious( sir.getInfectious() + (int)newInfected - (int)newRecovered );
        sir.setRecovered( sir.getRecovered() + (int)newRecovered );
        System.out.println("New Infected " + newInfected);
        System.out.println("New Recovered " + newRecovered);
        System.out.println("R0 " + covid19.getR0(covid19.getGama(),covid19.getGama()));
    }

    public void afterBadEvent(){
        double newInfected =  ((earthquake.getEffect() * covid19.getBeta()) * ( (  (double)sir.getSusceptible() *(double) sir.getInfectious() ) / (double)sir.getPopulation()));
        sir.setSusceptible(sir.getSusceptible() - (int)newInfected);
        double newRecovered = (covid19.getGama() * sir.getInfectious());
        sir.setInfectious( sir.getInfectious() + (int)newInfected - (int)newRecovered );
        sir.setRecovered( sir.getRecovered() + (int)newRecovered );
        int newPopulation = sir.getPopulation() - earthquake.getDeath();
        System.out.println("New Infected " + newInfected);
        System.out.println("Population after earthquake is " + newPopulation);
    }

    public void afterGoodEvent(){
        // TO DO
    }

    /**
     * Planujem dorobit dalšie metody
     */

}