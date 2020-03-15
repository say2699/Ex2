import java.util.ArrayList;
import java.util.List;




public class Basket implements Composite {
    List<Composite> product = new ArrayList<>();
    protected ArrayList<Sells> yourList = new ArrayList<>();
    private static Basket instance;
    private int id;
    private String name;
    private float price;



    public static Basket getInstance(){
        if(instance == null){
            instance = new Basket();
        }
        return instance;
    }



    public ArrayList<Sells> getYourList(){
        return this.yourList;
    }

    public void giveSell(int id, Clients clients){
        for(Sells children: yourList) {
            if(children.getID() == id) {
                    clients.addInBasket(children);
                    break;
                }
            }
        }


    public void add(Sells sell) {
        yourList.add(sell);
    }


    public void remove(Sells  sell) {
        yourList.remove(sell);
    }

    public boolean isComposite() {
        return true;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }




}