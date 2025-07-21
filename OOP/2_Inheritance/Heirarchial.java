

public class Heirarchial {
    public static void main(String[] args){
        CSE cse = new CSE();
        cse.print();
        
        System.out.println();

        AIML aiml = new AIML();
        aiml.print();

        System.out.println();

        AIDS aids = new AIDS();
        aids.print();
    }
}

class Engineering {
    Engineering() {
        System.out.println("Engineering Department Created");
    }

    void print() {
        System.out.println("Engineering is the foundation of all tech.");
    }
}

class CSE extends Engineering {
    CSE() {
        System.out.println("CSE Department Created");
    }

    void print() {
        System.out.println("CSE: Focuses on programming and systems.");
    }
}

class AIML extends Engineering {
    AIML() {
        System.out.println("AIML Department Created");
    }

    void print() {
        System.out.println("AIML: Focuses on AI and Machine Learning.");
    }
}

class AIDS extends Engineering {
    AIDS() {
        System.out.println("AIDS Department Created");
    }

    void print() {
        System.out.println("AIDS: Focuses on Data Science and Analysis.");
    }
}
