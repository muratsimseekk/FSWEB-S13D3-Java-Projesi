public class Person {
     String firstName;
     String lastName;
     int age ;

     String country;

     double salary;

     String university;

     public Person() {}

     public Person(String firstName , String lastName , int age){
         this.firstName=firstName;
         this.lastName=lastName;
         this.age=age;
     }

    public Person(String firstName , String lastName , int age, String country , double salary , String university) {
         this(firstName, lastName, age);
         this.country=country;
         this.salary = salary;
         this.university=university;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen () {
         if (this.age>13 && this.age <19){
             return true;
         }
         else {
             return false;
         }
    }
}
