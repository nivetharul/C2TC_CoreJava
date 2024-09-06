package Com.tns.day3;

public class Person {
    // Private fields
    private String priname = "Nivi";
    private int priage = 20;

    // Protected fields
    protected String proname1 = "Siva";
    protected int proage = 30;
    protected String profname = "Arul";

    // Private method
    private void nameMethod(String priname) {
        System.out.println("Private method called with: " + priname);
    }

    // Getter for priage
    public int getPriage() {
        return priage;
    }

    // Setter for priage
    public void setPriage(int age) {
        this.priage = age;
    }

    public static void main(String[] args) {
        Person p = new Person();

        System.out.println("Access Modifiers Example:");
        System.out.println("Private name: " + p.priname);
        System.out.println("Private age: " + p.priage); // Accessing the private field directly here
        System.out.println("Protected name: " + p.proname1);
        System.out.println("Protected age: " + p.proage);
        System.out.println("Protected family name: " + p.profname);

        // Call private method with a string argument
        p.nameMethod("Anu");

        // Use the setter to set the age
        p.setPriage(25);  // Setting priage to 25 using the setter method

        // Now print the updated age
        System.out.println("Updated Private age: " + p.getPriage());  // Getting priage using the getter method
    }
}

