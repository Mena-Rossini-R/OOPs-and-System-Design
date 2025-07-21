

public class simple {
    public static void main(String[] args){
        Tiger t = new Tiger();
        t.print();
    }
}

class Animal{
    Animal(){
        System.out.println("Animal parent class");
    }

    public void print(){
        System.out.println("print in parent");
    }
}

class Tiger extends Animal{
    Tiger(){
        super(); // only should be in first line inside a constructor
        System.out.println("Tiger parent class");
    }

    @Override
    public void print(){
        System.out.println("print in child");
        super.print();//super.methodName() -> can be in any line and anywhere
    }
}
//even use super.variable_name -> to access varibles