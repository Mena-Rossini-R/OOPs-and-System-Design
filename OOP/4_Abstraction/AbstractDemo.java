

public class AbstractDemo {
    public static void main(String[] args) {
        Anime a1 = new ActionAnime("Naruto", 500);
        a1.printDetails();
        a1.showGenre();

        System.out.println();

        Anime a2 = new RomanceAnime("Your Lie in April", 22);
        a2.printDetails();
        a2.showGenre();
    }
}

abstract class Anime {
    String name;
    int episodes;

    // Constructor
    Anime(String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    // Abstract method – must be implemented by subclasses
    abstract void showGenre();

    // Concrete method – can be used as-is
    void printDetails() {
        System.out.println("Anime: " + name + ", Episodes: " + episodes);
    }
}

// Subclass 1
class ActionAnime extends Anime {
    ActionAnime(String name, int episodes) {
        super(name, episodes);
    }

    @Override
    void showGenre() {
        System.out.println("Genre: Action");
    }
}

// Subclass 2
class RomanceAnime extends Anime {
    RomanceAnime(String name, int episodes) {
        super(name, episodes);
    }

    @Override
    void showGenre() {
        System.out.println("Genre: Romance");
    }
}
