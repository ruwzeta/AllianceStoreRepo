package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "discount", schema = "lk_allaince_db", catalog = "")
public class DiscountModel {
    private String discountId;
    private double discountAmont;
    private Date discountStartdate;
    private Date discountEnddate;
    private String discountTerms;
    private String productVariationId;
    private String discountTypeId;

    @Id
    @Column(name = "discount_id")
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    @Basic
    @Column(name = "discount_amont")
    public double getDiscountAmont() {
        return discountAmont;
    }

    public void setDiscountAmont(double discountAmont) {
        this.discountAmont = discountAmont;
    }

    @Basic
    @Column(name = "discount_startdate")
    public Date getDiscountStartdate() {
        return discountStartdate;
    }

    public void setDiscountStartdate(Date discountStartdate) {
        this.discountStartdate = discountStartdate;
    }

    @Basic
    @Column(name = "discount_enddate")
    public Date getDiscountEnddate() {
        return discountEnddate;
    }

    public void setDiscountEnddate(Date discountEnddate) {
        this.discountEnddate = discountEnddate;
    }

    @Basic
    @Column(name = "discount_terms")
    public String getDiscountTerms() {
        return discountTerms;
    }

    public void setDiscountTerms(String discountTerms) {
        this.discountTerms = discountTerms;
    }

    @Basic
    @Column(name = "product_variation_id")
    public String getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(String productVariationId) {
        this.productVariationId = productVariationId;
    }

    @Basic
    @Column(name = "discount_type_id")
    public String getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(String discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountModel that = (DiscountModel) o;
        return Double.compare(that.discountAmont, discountAmont) == 0 &&
                Objects.equals(discountId, that.discountId) &&
                Objects.equals(discountStartdate, that.discountStartdate) &&
                Objects.equals(discountEnddate, that.discountEnddate) &&
                Objects.equals(discountTerms, that.discountTerms) &&
                Objects.equals(productVariationId, that.productVariationId) &&
                Objects.equals(discountTypeId, that.discountTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, discountAmont, discountStartdate, discountEnddate, discountTerms, productVariationId, discountTypeId);
    }
}
