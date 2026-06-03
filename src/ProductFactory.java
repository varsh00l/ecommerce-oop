public class ProductFactory {

    public static Electronics createElectronics(String productName, Long productId, double price, int stockQuantity, int warrantyMonths, String brand){
        return new Electronics(productName,productId,price,stockQuantity,warrantyMonths,brand);
    }

    public static Clothing createClothing(String productName, Long productId, double price, int available, Size size){
        return new Clothing(productName,productId,price,available,size);
    }
}

