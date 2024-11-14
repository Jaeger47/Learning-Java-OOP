class TestAccess {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void showAccess() {
        System.out.println("Public Var: " + publicVar);
        System.out.println("Private Var: " + privateVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);
    }
}

public class TestAccessModifiers {
    public static void main(String[] args) {
        TestAccess access = new TestAccess();
        access.showAccess();
    }
}
