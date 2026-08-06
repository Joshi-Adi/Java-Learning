class Mobile{
    private String brand,model;
    private int price;
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public int getPrice(){
        return this.price;
    }
    public void setBrand(String brand){
        if(brand!=null && !brand.trim().isEmpty()){
            this.brand=brand;
        }else{
            System.out.println("Error");
        }
    }
    public void setModel(String model){
        if(model!=null && !model.trim().isEmpty()){
            this.model=model;
        }else{
            System.out.println("Error");
        }
    }
    public void setPrice(int price){
        if(price>0) this.price=price;
        else System.out.println("Error");
    }
}
class Main {
    public static void main(String[] args) {
        Mobile s=new Mobile();
        s.setBrand("main");
        s.setModel("me");s.setPrice(23000);
        System.out.println(s.getBrand()+" "+s.getModel()+" "+s.getPrice());
        s.setBrand("");s.setPrice(-22);
    }
}
