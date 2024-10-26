public class ShoppingCart {
    Product[] list;

    public ShoppingCart(Product[] list) {
        this.list = new Product[10];

    }

    public Product[] getList() {
        return list;
    }

    public void setList(Product[] list) {
        this.list = list;
    }

    public int calculateTotal()
    {
        int total = 0;
        for (Product product : list) {
            total += product.getPrice();
        }
        return total;
    }
}
