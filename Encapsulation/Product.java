package ecapsulation;

public class Product {

    private int productId;
    private String productName;
    private long price;
    private int quantity;

    public void setProductId(int productId) {
        if(productId > 0) {
            this.productId = productId;
        }
        else {
            System.out.println("Invalid Entry");
        }
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Invalid Amount");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            this.quantity = quantity;
        }
        else {
            System.out.println("Invalid Entry");
        }
    }
}