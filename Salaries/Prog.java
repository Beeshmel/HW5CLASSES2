public class Prog extends Base {
    private final int RATE = 4;
    private final String JOB = "Программист";

    public Prog(int baseSalary) {
        super(baseSalary);
    }
    @Override
    void showSalary() {
        System.out.println( "Зарплата на должности - " + JOB +" составляет " + RATE*baseSalary);

    }
}
