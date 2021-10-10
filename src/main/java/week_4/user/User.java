package week_4.user;

import week_4.product.Product;

public class User {

    private String username ;
    private String password ;
    private String phone ;
    private String address ;
    private boolean isLoggedIn ;
    private final Cart cart = new Cart() ;

    public User(String username, String password, String phone, String address) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public User() {
    }

    public void addProductToCart(Product product){
        cart.addProduct(product);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

}
