package javaapplication14;
public class product {
    protected int productId;
    protected String name;
    protected float price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if(productId>0){
        this.productId = productId;}
        else
             this.productId =Math.abs(productId); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public void setPrice(float price) {
                if(price>0){
        this.price = price;}
        else
             this.price =Math.abs(price); 
    }
    public float getPrice() {
        return price;
    }

    }
