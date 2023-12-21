/* article from https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/*/ 
class Main{
    public static void main(String[] args)
    {

    }
}
//SOLID acronym
/*
 The Single Responsibility Principle
The Open-Closed Principle
The Liskov Substitution Principle
The Interface Segregation Principle
The Dependency Inversion Principle
 */
/*The Single Responsibility Principle
 The Single Responsibility Principle states that a class should do one thing and therefore it should have only a single reason to change.

To state this principle more technically: Only one potential change (database logic, logging logic, and so on.) in the software’s specification should be able to affect the specification of the class.

This means that if a class is a data container, like a Book class or a Student class, and it has some fields regarding that entity, it should change only when we change the data model.
Following the Single Responsibility Principle is important. First of all, because many different teams can work on the same project and edit the same class for different reasons, this could lead to incompatible modules.
 */
class Student{
   private String name=null;
   private int age=0;
    public Student(String name,int age)
    {
this.name=name;
this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
class PrintStudentAgeAndName{
    Student student=null;
    public PrintStudentAgeAndName(Student student)
    {
this.student=student; 
}
public void print()
{
    System.out.println(this.student.getName() + " " + this.student.getAge());
}
}
/*each class has a specific purpose whether making a database connection or fetching data form an api*/

//Open-Closed Principle
/*
 The Open-Closed Principle requires that classes should be open for extension and closed to modification.
 Modification means changing the code of an existing class, and extension means adding new functionality.

So what this principle wants to say is: We should be able to add new functionality without touching the existing code for the class. This is because whenever we modify the existing code, we are taking the risk of creating potential bugs. So we should avoid touching the tested and reliable (mostly) production code if possible
 */
interface saveStudent{
    public boolean save();
}
class SaveToDatabase implements saveStudent{
    Student student=null;
    public SaveToDatabase(Student student){

    }
    public boolean save()
    {
        try{
//saveToDb
        }
        catch(Exception e){
return false;
        }
        return true;
    }
}
class SaveToFile implements saveStudent{
    Student student=null;
    public SaveToFile(Student student){

    }
    public boolean save()
    {
        try{
//saveToFile
        }
        catch(Exception e){
return false;
        }
        return true;
    }
}
/*Liskov Substitution Principle */
/*
The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.

This means that, given that class B is a subclass of class A, we should be able to pass an object of class B to any method that expects an object of class A and the method should not give any weird output in that case.

This is the expected behavior, because when we use inheritance we assume that the child class inherits everything that the superclass has. The child class extends the behavior but never narrows it down.

Therefore, when a class does not obey this principle, it leads to some nasty bugs that are hard to detect.

 */
/*
 Interface Segregation Principle
Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.

The principle states that many client-specific interfaces are better than one general-purpose interface. Clients should not be forced to implement a function they do no need.
 */
/*
 Dependency Inversion Principle
The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.
 */