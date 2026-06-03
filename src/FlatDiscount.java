public class FlatDiscount extends Discount {
    private double discount;

    public FlatDiscount(String discountName,double discount) {
        super(discountName);
        setDiscount(discount);
    }
    @Override
    public double apply(double originalPrice) {
        return originalPrice-discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if(discount<=0){
            throw new IllegalArgumentException("Discount is Invalid");
        }
        this.discount = discount;
    }
}
