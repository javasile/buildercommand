import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String color;
    private float weight;
    private String descreiption;
    private LocalDate date;

    private Product(ProductBuilder productBuilder){
        this.name = productBuilder.name;
        this.price = productBuilder.price;
        this.quantity = productBuilder.quantity;
        this.color = productBuilder.color;
        this.weight = productBuilder.weight;
        this.descreiption = productBuilder.descreiption;
        this.date = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public String getDescreiption() {
        return descreiption;
    }

    public LocalDate getDate() {
        return date;
    }
    public class ProductBuilder {
        private String name;
        private double price;
        private int quantity;
        private String color;
        private float weight;
        private String descreiption;

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public ProductBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ProductBuilder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public ProductBuilder setDescreiption(String descreiption) {
            this.descreiption = descreiption;
            return this;
        }

        public void build(){
            if (quantity == 0 ){
                quantity = 1;
            }
            Product product = new Product(this);
        }
    }

}
