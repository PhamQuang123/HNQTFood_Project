package cg.hntqfood_project.model.entity;

public class Product {
    private int id;
    private String productName;
    private double price;
    private int productStatus = 0;
    private String descriptions;
    private String image;

    public Product(String productName, double price, int productStatus, String descriptions, String image, Category category) {
        this.productName = productName;
        this.price = price;
        this.productStatus = productStatus;
        this.descriptions = descriptions;
        this.image = image;
        this.category = category;
    }

    private Category category;

    public Product() {
    }

    public Product(int id, String productName, double price, int productStatus, String descriptions,String image,Category category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.productStatus = productStatus;
        this.descriptions = descriptions;
        this.image = image;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
