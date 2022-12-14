package Classes;

public class Category {
    private String name;

    public Category() {
        this.name = "Default";
    }

    public Category(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    public String toString() {
        return "Category - " + this.name;
    }
}
