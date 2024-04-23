package javaapplication14;
import java.util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        product p1=new product();
        ElectronicProduct e1=new ElectronicProduct(); 
        clothingProduct l1=new clothingProduct();
        BookProduct b1=new BookProduct();
        customer c1=new customer();
        cart a1=new cart();
        
        e1.setName("smartphone");
        e1.setProductId(1);
        e1.setPrice( 599.99f);
        e1.SetBrand("samsung");
        e1.setWarrantyPeriod(1);
        l1.setName("T-shirt");
        l1.setProductId(2);
        l1.setPrice(19.99f);
        l1.setSize("Medium");
        l1.setFabric("cotton");
        b1.setName("OOP");
        b1.setProductId(3);
        b1.setPrice(39.99f);
        b1.setAuthor("O Reilly");
        b1.setPublisher("X publications");
        c1.setCustomerId(23010132);
        c1.setName("sondos yasser mohammed");
        c1.setAddress("Alex");
        System.out.println("Welcome to the E-commerce system");
        System.out.println("please enter your id " );
        int id=input.nextInt();
        input.nextLine();
        System.out.println("please enter your name ");
        String name=input.nextLine();
        System.out.println("please enter your address ");
        String address=input.nextLine();
        System.out.println("How many products you want to add to your cart? ");
        int nProducts=input.nextInt();
        a1.setNproducts(nProducts);
                for(int i=0;i<nProducts;i++){
        System.out.println("which product you would to add? 1-smartphone 2-Tshirt 3-oop");
        int choise=input.nextInt();
        switch(choise){
            case 1:
                a1.addProduct(e1);
                break;
            case 2:
                a1.addProduct(l1);
                break;
            case 3:
                a1.addProduct(b1);
                break;
        }    
    }
        Order o1=new Order(23010132,1,a1.calculatePrice(),a1.GetProducts(),a1.getNproducts());
     int x=input.nextInt();
     switch(x){
         case 1:
             a1.placeOrder();
             o1.printOrderInfo();
             break; 
         case 2:
             
     }
}
}
    

   
