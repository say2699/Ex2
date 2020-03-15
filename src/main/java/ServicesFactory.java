public class ServicesFactory {
    static Services createSell(String name, int id, float price){
        return new Services (name,id, price);
    }
}
