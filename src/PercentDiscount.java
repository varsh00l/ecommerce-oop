public class PercentDiscount extends Discount{
    private double percentage;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if(percentage<=0||percentage>150){
            throw new IllegalArgumentException("That percentage is Invalid");
        }
        this.percentage=percentage;
    }
    @Override
    public double apply(double originalPrice) {
        return originalPrice-(originalPrice*percentage)/100;
    }

    public PercentDiscount(String DiscountName,double percentage) {
        super(DiscountName);
        this.percentage = percentage;
    }
}
