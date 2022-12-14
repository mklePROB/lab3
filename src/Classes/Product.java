package Classes;

public class Product {
    private String name;
    private Category category;
    private float price;

    public Product() {
        this.name = "DefaultProduct";
        this.category = new Category();
        this.price = 1.0f;
    }

    public Product(String name, Category category, float price) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }

        this.category = category;

        if(price > 0.0f) {
            this.price = Math.round(price * 100) / 100;
        } else {
            throw new IllegalArgumentException("Price must be a positive value");
        }
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        if(price > 0.0f) {
            this.price = Math.round(price * 100) / 100;
        } else {
            throw new IllegalArgumentException("Price must be a positive value");
        }
    }

    public String toString() {
        return name + " " + category + " " + price;
    }
}
