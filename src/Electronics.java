public class Electronics extends Product{
    private int warrantyMonths;
    private String brand;

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if(warrantyMonths<=0){
            throw new IllegalArgumentException("Warranty cannot be Zero");
        }
        this.warrantyMonths = warrantyMonths;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand cannot be empty");
        }
        this.brand=brand;
    }

    public Electronics(String productName, Long productId, double price, int stockQuantity, int warrantyMonths, String brand) {

        super(productName, productId, price, stockQuantity);
        setWarrantyMonths(warrantyMonths);
        setBrand(brand);
    }

    @Override
    public String toString() {
        return super.toString()+",Warranty:"+warrantyMonths+",Brand:"+brand+"]";
    }
}
