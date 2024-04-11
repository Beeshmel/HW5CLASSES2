package converter_valutes;


public class Converter {
    public final static double DR = 69;//курс доллара к рублю
    public final static double DE = 1.1;
    public final static double ER = 75;

    Client client;

    public Converter(Client client) {
        this.client = client;
    }

    double convert(){
        double result = 0;
        switch (client.getValInput()){
            case "rub":
                if(client.getValOutput().equalsIgnoreCase("baks")){
                    result = client.getMoney() / DR;
                }else{
                    result = client.getMoney() / ER;
                }
                break;

            case "baks":
                if(client.getValOutput().equalsIgnoreCase("rub")){
                    result = client.getMoney() * DR;
                }else{
                    result = client.getMoney() / ER;
                }
                break;

            case "euro":
                if(client.getValOutput().equalsIgnoreCase("rub")){
                    result = client.getMoney() * DR;
                }else{
                    result = client.getMoney() * ER;
                }
                break;
        }
        return result;
    }
}
