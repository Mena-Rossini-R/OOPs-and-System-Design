

public class basics {
    public static void main(String[] args) {
        Anime a = new Anime();
        a.setName("One Piece");
        a.setEpisodes(1129);
        a.print();

        a.setEpisodes(-1);  // Will print a warning, won't change value
    }
}


class Anime {
    private String name;   // private = data hiding
    private int episodes;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if (episodes >= 0) {
            this.episodes = episodes;
        } else {
            System.out.println("Episodes can't be negative.");
        }
    }

    public void print() {
        System.out.println("Anime: " + name + ", Episodes: " + episodes);
    }
}
