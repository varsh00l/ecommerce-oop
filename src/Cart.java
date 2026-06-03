import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;
    private Discount discount;


    public void setDiscount(Discount discount){
        this.discount=discount;
    }
    public Cart(){
        this.items=new ArrayList<>();

    }

    public List<Product> addItem(Product product){
        items.add(product);
        return items;
    }
    public List<Product> removeItem(Product product){
        if(items.contains(product)) {
            items.remove(product);
        }
        return items;
    }
    public void displayCart(){
        if(items.isEmpty()){
            System.out.println("Add The Products Here");
            return;
        }
        for(Product p:items){
            System.out.println(p);
        }
    }
    public double calculatePrice(){
        double Price=0;
        for(Product p:items){
            Price+=p.getPrice();
        }
        return Price;
    }

    public double calculateFinalPrice(){
        double finalPrice=calculatePrice();
       if(discount!=null){
           finalPrice= discount.apply(finalPrice);
       }
       return finalPrice;
    }

}
