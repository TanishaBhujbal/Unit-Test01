// Class with different access modifiers
class AccessModifiersExample {

    // Public field: Can be accessed from any class
    public String publicField = "This is a public field.";

    // Private field: Can only be accessed within this class
    private String privateField = "This is a private field.";

    // Protected field: Can be accessed within the same package or subclasses
    protected String protectedField = "This is a protected field.";

    // Default (package-private) field: Can be accessed only within the same package
    String defaultField = "This is a default (package-private) field.";

    // Public method: Can be accessed from any class
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method: Can only be accessed within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method: Can be accessed within the same package or by subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (package-private) method: Can be accessed only within the same package
    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }
}

public class AccessModifiersTest {

    public static void main(String[] args) {
        // Creating an object of AccessModifiersExample class
        AccessModifiersExample obj = new AccessModifiersExample();

        // Accessing public field and method
        System.out.println(obj.publicField); // Accessible from anywhere
        obj.publicMethod(); // Accessible from anywhere

        // Trying to access private field and method (will cause an error)
        // System.out.println(obj.privateField); // Not accessible: private
        // obj.privateMethod(); // Not accessible: private

        // Accessing protected field and method
        System.out.println(obj.protectedField); // Accessible within the same package
        obj.protectedMethod(); // Accessible within the same package

        // Accessing default field and method
        System.out.println(obj.defaultField); // Accessible within the same package
        obj.defaultMethod(); // Accessible within the same package
    }
}
