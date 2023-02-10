public class App {
    public static void main(String[] args) throws Exception {
        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Kenji");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

        Me.setCCNumber = Me.getCCNumber();

        int myCCNumber = Me.getCCNumber();

        System.out.println("My CC Number is " + myCCNumber);

        //==========================================================

        Son me = new Son();
        System.out.println("My family name is: " + me.surname);

        me.showLove();

    }
}
