package javaapplication14;
public class Order {
    private int customerId;
     private int orderId;
     private product  []products;
     private float totalPrice;
    private int nProducts;
     public Order() {}
    public Order(int customerId,int orderId, float totalPrice,product  []products, int nProducts) {
    this.customerId=Math.abs(customerId);
    this. orderId= Math.abs(orderId);
    this.totalPrice=totalPrice;
    this.products=products;
    this.nProducts=nProducts;
    }
    
 public void printOrderInfo() {
       System.out.println("Here's your order's summary:");  
     System.out.println("order ID:"+" "+orderId);
     System.out.println("customer ID:"+" "+customerId);
     System.out.println("products:");
     for (int i=0;i<nProducts;i++){
            System.out.println(products[i].getName() + "-" + products[i].getPrice());
           
        }
        
     System.out.println("Total price:"+" "+totalPrice);
    
     }  
 }