public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Murat", "Simsek", 14);
        Person person2 = new Person("John", "Doe", 20, "New Zealand", 34000, "Monash University");

        System.out.println("Person: " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is teen?: " + person1.isTeen());

        System.out.println("Person 2: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is teen?: " + person2.isTeen());





        Wall wall = new Wall(5,4);
        System.out.println("area=  :" +wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }
}
