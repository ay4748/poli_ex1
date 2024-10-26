public class Clothing extends Product{
    String name;
    int price;
    String description;

    public Clothing(String name, int price, String description) {
        super(name, price, description);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return "this is the a clothing descprition:" +  description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }


}
