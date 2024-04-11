package converter_valutes;

public class Client {
    private double money;//сумма клиента
    private String valInput;//исходная валюта
    private String valOutput;//в какую валюту конвертируем

    public Client(double money, String valInput, String valOutput) {
        this.money = money;
        this.valInput = valInput;
        this.valOutput = valOutput;
    }

    public double getMoney() {
        return money;
    }

    public String getValInput() {
        return valInput;
    }

    public String getValOutput() {
        return valOutput;
    }

    @Override
    public String toString() {
        return "Client{" +
                "money=" + money +
                ", valInput='" + valInput + '\'' +
                ", valOutput='" + valOutput + '\'' +
                '}';
    }
}
