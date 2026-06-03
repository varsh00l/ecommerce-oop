public class Product {
    private String productName;
    private Long productId;
    private double price;
    private int stockQuantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("Price Must be Greater than 0");
        }
        this.price = price;
    }


    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Product(String productName, Long productId,double price, int stockQuantity) {
        setProductName(productName);
       this.productId = productId;
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    @Override
    public String toString() {
        return "Product [ID="+productId+",Name :"+productName+", Price=$"+price+", Stock:"+stockQuantity+"";
    }
    }

