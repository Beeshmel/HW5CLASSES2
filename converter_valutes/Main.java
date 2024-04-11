package converter_valutes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ваша сумма");
        double money = Double.parseDouble(reader.readLine());

        System.out.println("Выберите Вашу валюту (rub,euro,baks)");
        String startValute = reader.readLine();

        System.out.println("Выберите валюту, которую желаете приобрести (rub,euro,baks)");
        String endValute = reader.readLine();

        Client client = new Client(money,startValute,endValute);

        Converter converter = new Converter(client);


        System.out.println("После преобразования Ваша сумма составит "
                + converter.convert() + " " + client.getValOutput());

    }
}
