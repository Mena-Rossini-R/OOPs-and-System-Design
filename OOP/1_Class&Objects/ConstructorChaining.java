public class ConstructorChaining{
    public static void main(String[] args) {
        Anime1 a1 = new Anime1();                // calls default constructor
        a1.print(); 
        System.out.println();

        Anime1 a2 = new Anime1("Naruto");        // calls 1-param constructor
        a2.print();
        System.out.println();

        Anime1 a3 = new Anime1("Bleach", 366);   // calls 2-param constructor
        a3.print();
    }
}


class Anime1{
    String name;
    int epi;

    // Default constructor (calls the parameterized one)
    Anime1() {
        this("Default Anime", 0);  // constructor chaining //this shpuld be int the forst line or complie time error
        System.out.println("Default constructor called");
    }

    // Single-parameter constructor (calls the two-parameter one)
    Anime1(String name) {
        this(name, 12);  // constructor chaining
        System.out.println("Single-parameter constructor called");
    }

    // Two-parameter constructor
    Anime1(String name, int epi) {
        this.name = name;
        this.epi = epi;
        System.out.println("Two-parameter constructor called");
    }

    void print() {
        System.out.println("Anime: " + name + ", Episodes: " + epi);
    }
} 

