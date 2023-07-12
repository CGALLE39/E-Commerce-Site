package springbootecommerce.entity;


import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@Table(name="product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private Long id;

//    private ProductCategory category;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @Column(name = "sku")
    private String sku;

    @Column(name = "description")

    private String description;

    @Column(name = "unit_price")

    private BigDecimal unitPrice;

    @Column(name = "image_url")

    private String imageUrl;

    @Column(name = "active")

    private boolean active;

    @Column(name = "units_in_stock")

    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;


    @Entity
    @Table(name = "product", schema = "full-stack-ecommerce")
    public static class ProductEntity {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(name = "id")
        private long id;
        @Basic
        @Column(name = "sku")
        private String sku;
        @Basic
        @Column(name = "name")
        private String name;
        @Basic
        @Column(name = "description")
        private String description;
        @Basic
        @Column(name = "unit_price")
        private BigDecimal unitPrice;
        @Basic
        @Column(name = "image_url")
        private String imageUrl;
        @Basic
        @Column(name = "active")
        private Boolean active;
        @Basic
        @Column(name = "units_in_stock")
        private Integer unitsInStock;
        @Basic
        @Column(name = "date_created")
        private Timestamp dateCreated;
        @Basic
        @Column(name = "last_updated")
        private Timestamp lastUpdated;
        @Basic
        @Column(name = "category_id")
        private long categoryId;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public BigDecimal getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public Integer getUnitsInStock() {
            return unitsInStock;
        }

        public void setUnitsInStock(Integer unitsInStock) {
            this.unitsInStock = unitsInStock;
        }

        public Timestamp getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(Timestamp dateCreated) {
            this.dateCreated = dateCreated;
        }

        public Timestamp getLastUpdated() {
            return lastUpdated;
        }

        public void setLastUpdated(Timestamp lastUpdated) {
            this.lastUpdated = lastUpdated;
        }

        public long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(long categoryId) {
            this.categoryId = categoryId;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            ProductEntity that = (ProductEntity) o;
//
//            if (id != that.id) return false;
//            if (categoryId != that.categoryId) return false;
//            if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;
//            if (name != null ? !name.equals(that.name) : that.name != null) return false;
//            if (description != null ? !description.equals(that.description) : that.description != null) return false;
//            if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
//            if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) return false;
//            if (active != null ? !active.equals(that.active) : that.active != null) return false;
//            if (unitsInStock != null ? !unitsInStock.equals(that.unitsInStock) : that.unitsInStock != null) return false;
//            if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
//            if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
//
//            return true;
//        }

//        @Override
//        public int hashCode() {
//            int result = (int) (id ^ (id >>> 32));
//            result = 31 * result + (sku != null ? sku.hashCode() : 0);
//            result = 31 * result + (name != null ? name.hashCode() : 0);
//            result = 31 * result + (description != null ? description.hashCode() : 0);
//            result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
//            result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
//            result = 31 * result + (active != null ? active.hashCode() : 0);
//            result = 31 * result + (unitsInStock != null ? unitsInStock.hashCode() : 0);
//            result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
//            result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
//            result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
//            return result;
//        }
    }
}
