import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Services implements Sells{

    private String name;
    private int id;
    private float price;
    private ArrayList<Sells> controls;
    private SellType type = SellType.SERVICE;


    @Autowired
    public Services(String name,  int id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
        controls = new ArrayList<Sells>();
    }
    public void Add(Sells e) {
        controls.add(e);
    }

    public void Remove(Sells e) {
        controls.remove(e);
    }


    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public float getPrice() {
        return price;
    }


    public SellType getType() {
        return this.type;
    }


    public ArrayList<Sells> getControls() {
        return controls;
    }


}

