//example of abstract class that have method body
abstract class Bike{
    Bike(){System.out.println("bike luotu");}
    abstract void run();
    void changeGear(){System.out.println("vaihteisto vaihdettu");}
  }
 
  class Honda extends Bike{
  void run(){System.out.println("hyvin menee..");}
  }
  class TestAbstraction2{
  public static void main(String args[]){
   Bike obj = new Honda(); obj.run(); obj.changeGear();
  }
 }
 