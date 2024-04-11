public class Main {
    public static void main(String[] args) {
        int base = 30000;
        Prog programmer =new Prog(base);
        programmer.showSalary();
        Account account = new Account(base);
        account.showSalary();
        Dir dir = new Dir(base);
        dir.showSalary();

    }
}
