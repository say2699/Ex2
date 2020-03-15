
public class SellBuilder {
    public static Sells getSell(SellType type, String name, int id, float price){

        Sells sell;
        switch(type){
            case SERVICE:
                sell = ServicesFactory.createSell(name, id, price);
                break;
            case PRODUCT:
                sell = ProductsFactory.createSell(name, id, price);
                break;
            default:
                sell = ServicesFactory.createSell(name, id, price);;
        }
        return sell;
    }


}
