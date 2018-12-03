package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "variation_product", schema = "lk_allaince_db", catalog = "")
public class VariationProductModel {
    private String productVariationId;
    private int productQty;
    private double productSize;
    private byte productAvailability;
    private String productColour;
    private String productId;
    private byte[] productImage;
    private int reorderLevel;

    @Id
    @Column(name = "product_variation_id")
    public String getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(String productVariationId) {
        this.productVariationId = productVariationId;
    }

    @Basic
    @Column(name = "product_qty")
    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    @Basic
    @Column(name = "product_size")
    public double getProductSize() {
        return productSize;
    }

    public void setProductSize(double productSize) {
        this.productSize = productSize;
    }

    @Basic
    @Column(name = "product_availability")
    public byte getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(byte productAvailability) {
        this.productAvailability = productAvailability;
    }

    @Basic
    @Column(name = "product_colour")
    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_image")
    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    @Basic
    @Column(name = "reorder_level")
    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariationProductModel that = (VariationProductModel) o;
        return productQty == that.productQty &&
                Double.compare(that.productSize, productSize) == 0 &&
                productAvailability == that.productAvailability &&
                reorderLevel == that.reorderLevel &&
                Objects.equals(productVariationId, that.productVariationId) &&
                Objects.equals(productColour, that.productColour) &&
                Objects.equals(productId, that.productId) &&
                Arrays.equals(productImage, that.productImage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(productVariationId, productQty, productSize, productAvailability, productColour, productId, reorderLevel);
        result = 31 * result + Arrays.hashCode(productImage);
        return result;
    }
}
