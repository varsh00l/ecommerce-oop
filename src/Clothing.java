public class Clothing extends Product{


   private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing(String productName, Long productId, double price, int available, Size size) {
        super(productName, productId, price, available);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+", Size=" + size;
    }
}
