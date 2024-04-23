package javaapplication14;
import java.util.Scanner;
public class cart {
    Scanner input=new Scanner(System.in);
    private int customerId;
     private int nproducts;
private product  []products;  
 
 public cart(){}
 public cart(int customerId,int nproducts){
     this.customerId=customerId;
     this.nproducts=nproducts;
 }

    public void setCustomerId(int customerId) {
           if(customerId>0){
        this.customerId = customerId;}
        else
             this.customerId =Math.abs(customerId); 
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {
                        if(nproducts>0){
        this.nproducts = nproducts;}
        else
             this.nproducts =Math.abs(nproducts); 
        products=new product [nproducts];
    }

            public void addProduct( product p){
    for(int i=0;i<nproducts;i++){
    if(products[ i]==null){
        products [i]=p;
        break;
    }
    }
    }
        public void removeProduct( product p){
        for(int i=0;i<nproducts;i++){
    if(products[ i]==p){
products [i]=null;
    }
    
    }
     }
        public product[] GetProducts(){
            return  products;}
        public float calculatePrice(){
   float totalprice=0;
   for(int i=0;i<nproducts;i++){
       if(products[i]!=null){
                    totalprice=totalprice+products[i].getPrice();}
       else
           totalprice=totalprice;
        }
   return totalprice;
        }
    public void placeOrder(){
        System.out.println("Your total order's is"+calculatePrice()+"Would you like to place the order? 1-Yes 2-No");
        int x=input.nextInt();

                                   }
    }     

