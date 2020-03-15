public class ProductsFactory {
    static Products createSell(String name, int id, float price){
        return new Products (name,id, price);
    }
}
