package week_4.products;

public class Product {

    protected String name ;
    protected String description ;
    protected double price ;
    protected double reducedPrice  ;

    public Product(String name, String description, double price, double reducedPrice) {
        this(name , description , price );
        this.reducedPrice = reducedPrice ;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getReducedPrice() {
        if (reducedPrice == 0){
            return this.price ;
        }
        return reducedPrice;
    }

//    public void displayInfo(){
//        System.out.println(this.getName());
//        System.out.println(this.getDescription());
//        System.out.println(this.getPrice());
//        if (this.reducedPrice != 0){
//            System.out.println(this.getReducedPrice());
//        }
//    }

}


