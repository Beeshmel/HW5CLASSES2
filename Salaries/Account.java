public class Account extends Base{
    private final int RATE = 2;
    private final String JOB = "Экономист";

    public Account(int baseSalary) {
        super(baseSalary);
    }
    @Override
    void showSalary() {
        System.out.println( "Зарплата на должности - " + JOB +" составляет " + RATE*baseSalary);
    }
}
