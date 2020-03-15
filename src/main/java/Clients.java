import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Clients implements  IClient{
    private ArrayList<Sells> sell = new ArrayList<>();
    private String name;
    private int id;
    private ClientType mtype;
    private double value=0;
    private double total=0;

    @Autowired
    public Clients(String name, int id, ClientType mtype) {
        this.name = name;
        this.id = id;
        this.mtype = mtype;
    }


    public String getName(){
        return this.name;
    }


    public int getID() {
        return this.id;
    }

    public ClientType getMType() {
        return this.mtype;
    }

    public void addInBasket(Sells sell) {
        if (mtype != ClientType.Regular && sell.getType() == SellType.PRODUCT){
            value = sell.getPrice() - (sell.getPrice() * 10/100);
            total += value;
            this.sell.add(sell);
        } else if (mtype == ClientType.Premium && sell.getType() == SellType.SERVICE){
            value = sell.getPrice() - (sell.getPrice() * 20/100);
            total += value;
            this.sell.add(sell);
        } else if (mtype == ClientType.Gold && sell.getType() == SellType.SERVICE){
            value = sell.getPrice() - (sell.getPrice() * 15/100);
            total += value;
            this.sell.add(sell);
        } else if (mtype == ClientType.Silver && sell.getType() == SellType.SERVICE){
            value = sell.getPrice() - (sell.getPrice() * 10/100);
            total += value;
            this.sell.add(sell);
    }

        }




    public void printSells(){
        if(this.sell.size()==0) {
            System.out.println("You have no products in basket\n");
        }else {
            for(Sells sell: this.sell) {
                System.out.println("-" + sell.getName() + " " + sell.getPrice());
            }
            System.out.println("Total is:" + total + "\n");
        }
    }
}


