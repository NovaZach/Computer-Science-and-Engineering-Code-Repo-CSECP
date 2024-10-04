class Animal
{
  String name;
  int age;
  Animal(String name,int age)
  {
    this.name=name;
    this.age=age;
  }
}
class Herbivore extends Animal
{
  String type_1;
  Herbivore(String name,int age)
  {
    super(name,age);
    this.type_1="Herbivore";
  }
}
class Carnivore extends Animal
{
  String type_2;
  Carnivore(String name,int age)
  {
    super(name,age);
    this.type_2="Carnivore";
  }
}
public class Animal
{
  public static void main(String [] args)
  {
    Herbivore h=new Herbivore("Cow",15);
    Carnivore c=new Carnivore("Tiger",20);
    System.out.println("Animal name:"+h.name);
    System.out.println("Age:"+h.age);
    System.out.println("Type:"+h.type_1);
    System.out.println("\n");
    System.out.println("Animal name:"+c.name);
    System.out.println("Age:"+c.age);
    System.out.println("Type:"+c.type_2);
  }
}
