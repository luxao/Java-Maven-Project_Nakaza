package sk.stuba.fei.NAKAZA.Interaction;

import java.util.Scanner;

public class Interaction {
    /** interakciu mam len v zakladoch */
    private String country;
    private String nick;

    Scanner scanner = new Scanner(System.in);

    public void Printable(){
        System.out.println("hello my friend this is plaque involve \n Please Choose your Nickname : ");
        nick = scanner.nextLine();
        System.out.println("Nick " + nick + " was set like your Name");
        System.out.println("Choose country where infection start spreading :");
        country = scanner.nextLine();
        System.out.println("Infection start in " + country);
        System.out.println("--------------------------------");

    }

    public String getCountry() {
        return country;
    }

    public String getNick() {
        return nick;
    }
}
