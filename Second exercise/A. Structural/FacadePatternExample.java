// Subsystems
class Amplifier {
    void on() { System.out.println("Amplifier on"); }
    void off() { System.out.println("Amplifier off"); }
}

class DVDPlayer {
    void on() { System.out.println("DVD Player on"); }
    void off() { System.out.println("DVD Player off"); }
}

class Projector {
    void on() { System.out.println("Projector on"); }
    void off() { System.out.println("Projector off"); }
}

// Facade
class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie() {
        projector.on();
        amplifier.on();
        dvdPlayer.on();
        System.out.println("Movie is ready to watch");
    }

    public void endMovie() {
        projector.off();
        amplifier.off();
        dvdPlayer.off();
        System.out.println("Movie ended");
    }
}

// Client code
public class FacadePatternExample {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
