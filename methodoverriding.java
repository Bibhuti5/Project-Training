public class methodoverriding {

    public static void main(String args[]) {
        // shows that private method can not be overridden in Java
        Parent parent = new Child();
    }

}

class Parent {

    public Parent() {
        name();
        normal();
    }

    private void name() {
        System.out.printf("private method inside Parent class in Java %n");
    }

    public void normal() {
        System.out.println("non private method from Parent class can be overridden");
    }

}

class Child extends Parent {

    private void name() {
        System.out.printf("private method inside Child class in Java %n");
    }

    @Override
    public void normal() {
        System.out.println("non private overridden method from Child class ");
    }

}