public class Dir extends Base {
    private final int RATE = 10;
    private final String JOB = "Директор";

    public Dir(int baseSalary) {
        super(baseSalary);
    }
    @Override
    void showSalary() {
        System.out.println( "Зарплата на должности - " + JOB +" составляет " + RATE*baseSalary);
    }
}
