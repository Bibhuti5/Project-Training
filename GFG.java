class Shadowing {

    // Custom instance variable or member variable
    String name = "This is Outer John";

    // Nested inner class
    class innerShadowing {

        // Instance variable or member variable
        String name = "This  is Inner John";

        // Method of this class to
        // print content of instance variable
        public void print() {

            // Print statements
            System.out.println(name);
            System.out.println(Shadowing.this.name);
        }
    }
}

// Class 3
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args) {

        // Accessing an inner class by
        // creating object of outer class inside main()
        Shadowing obj = new Shadowing();

        Shadowing.innerShadowing innerObj = obj.new innerShadowing();

        // Calling method defined inside inner class
        // inside main() method
        innerObj.print();
    }
}