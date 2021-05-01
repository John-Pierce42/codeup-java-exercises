public class Person {

    private String name;

    public String getName() {
        //TODO: return the person's name

        return name;

    }

    public void setName(String name) {
        //TODO: change the name property to the passed value

        name = name;
    }

    public void sayHello() {
        //TODO: print a message to the console using the person's name
       System.out.println("Hello  " + name);
    }

    public static void main(String[] args) {
        Person john = new Person();
        john.name = "Johnny";
//        System.out.println(john.getName());
        john.setName("john");
        john.sayHello();




    }
}
