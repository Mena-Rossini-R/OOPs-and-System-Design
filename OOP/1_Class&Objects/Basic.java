/*   Class - group of methods and variables which act as the blueprint of obj 
     Objects - instance of a class




-------------------------------------------------------------------------------
 
                            Instance variable             Class variable

Declared with static               no                           yes

Belongs to                   Each obj (instance)               Class

Memory                       New mem for each obj     one copy shared across all

Accessed via                objectName.variableName      ClassName.VariableName
                                                                  or 
                                                             using obj too


 */

public class Basic{
    public static void main(String[] args){

        Anime.name = "One piece"; //using class to assign the class variable's value;


        Anime a1 = new Anime(); //object creation 
        a1.epi = 1129; //using obj to assign instance variable's value


        a1.print();
    }
}

class Anime{      // uses default access specifier which is package specific - can be used among same package
    static String name;  // class variable
    int epi;      // instance variable - if they have static keyword they will become class variable

    void print(){ //print is a INSTANCE METHOD
        System.out.println("name of anime is " + name + " total epi count : " + epi);
    }

}

/*
 
Static method or functions can be called without an obj creation.

 */


