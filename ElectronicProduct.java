package javaapplication14;
public class ElectronicProduct extends product {
    private String brand;
    private int warrantyPeriod;

    public String getBrand() {
        return brand
;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
                if(warrantyPeriod>0){
        this.warrantyPeriod = warrantyPeriod;}
        else
             this.warrantyPeriod =Math.abs(warrantyPeriod); 
    }
    public void SetBrand(String brand ){
        this.brand=brand;
    }
    public String GetBrand(){
        return brand ;
    }
    public int GetWarrantyPeriod(){
        return warrantyPeriod;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
