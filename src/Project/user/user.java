package Project.user;

public class user {

    private String name;
    private String lastName;
   private String shoppingCart;
   private address address;

    public Project.user.address getAddress() {
        return address;
    }

    public void setAddress(Project.user.address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(String shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}

