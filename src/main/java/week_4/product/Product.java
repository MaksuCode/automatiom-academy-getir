package week_4.product;

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

}


