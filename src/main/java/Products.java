import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Products implements Composite, Sells {
    List<Composite> product = new ArrayList<>();
    private int id;
    private String name;
    private float price;
    private SellType type = SellType.PRODUCT;



    @Autowired
    public Products(String name,  int id, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



    public boolean isComposite() {
        return false;
    }


    public int getID(){
        return this.id;
    }

    public float getPrice(){
        return this.price;
    }

    public SellType getType() {
        return this.type;
    }


    public String getName(){
        return this.name;
    }






}
