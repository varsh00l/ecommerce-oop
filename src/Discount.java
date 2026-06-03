public abstract class Discount {
    private String discountName;

    public Discount(String discountName) {
        this.discountName=discountName;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }
    public abstract double  apply(double originalPrice);
}
