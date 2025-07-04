package e_commerce.e.commerce.product.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table
public class Product {
    @Id
    @Column(name = "product_id")
    private UUID id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private Integer price;
    @Column(name = "product_rating")
    private Integer rating;

    public Product() {
        this.id = UUID.randomUUID();
    }

    public Product(String name, Integer price, Integer rating) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
