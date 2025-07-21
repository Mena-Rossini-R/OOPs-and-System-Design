/*   CONSTRUCTORS - special method to initialize things when the obj is created

RULES : constructor name = class name
        no return type allowed (not even void)
        called automatically when obj is created
        can be default, parameterized or overloaded 

------------------------------------------------------------------------------------------------------------------

            CONSTRUCTOR OVERLOADING  - same with DIFFERENT PARAMETER
 
 */

public class constructors {
    public static void main(String[] args){
        Anime obj1 = new Anime();
        obj1.print();
        Anime obj2 =  new Anime("One piece" , 1022);
        obj2.print();

    }
}


class Anime{ 
    String name;  
    int epi; 

    Anime() //default constructor
    {
        name = "Anime";
        epi = 0;
    }

    Anime(String name, int epi) //parametrized constructor
    {
        this.name = name;
        this.epi = epi;
    }

    public void print() // is an INSTANCE METHOD
    {
        System.out.println(name + " " + epi);
    }

}

/*
 
IF i make the print() method as static...then we have to pass the obj to the print()methd otherwise compile time error


public class Constructors {
    public static void main(String[] args) {
        Anime obj1 = new Anime(); // using default constructor
        Anime.print(obj1);        // call static print method with object

        Anime obj2 = new Anime("One Piece", 1022); // using parameterized constructor
        Anime.print(obj2);        // call static print method with object
    }
}

class Anime {
    String name;
    int epi;

    // Default constructor
    Anime() {
        name = "Anime";
        epi = 0;
    }

    // Parameterized constructor
    Anime(String name, int epi) {
        this.name = name;
        this.epi = epi;
    }

    // STATIC METHOD that takes an object
    public static void print(Anime obj) 
    {
        System.out.println("Name: " + obj.name + ", Episode count: " + obj.epi);
    }
}


 */

