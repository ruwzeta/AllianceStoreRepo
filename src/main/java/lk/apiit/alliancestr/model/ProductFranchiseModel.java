package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_franchise", schema = "lk_allaince_db", catalog = "")
public class ProductFranchiseModel {
    private String productFranchiseId;
    private String franchiseName;
    private String franchiseCountry;
    private String franchiseWebsite;

    @Id
    @Column(name = "product_franchise_id")
    public String getProductFranchiseId() {
        return productFranchiseId;
    }

    public void setProductFranchiseId(String productFranchiseId) {
        this.productFranchiseId = productFranchiseId;
    }

    @Basic
    @Column(name = "franchise_name")
    public String getFranchiseName() {
        return franchiseName;
    }

    public void setFranchiseName(String franchiseName) {
        this.franchiseName = franchiseName;
    }

    @Basic
    @Column(name = "franchise_country")
    public String getFranchiseCountry() {
        return franchiseCountry;
    }

    public void setFranchiseCountry(String franchiseCountry) {
        this.franchiseCountry = franchiseCountry;
    }

    @Basic
    @Column(name = "franchise_website")
    public String getFranchiseWebsite() {
        return franchiseWebsite;
    }

    public void setFranchiseWebsite(String franchiseWebsite) {
        this.franchiseWebsite = franchiseWebsite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductFranchiseModel that = (ProductFranchiseModel) o;
        return Objects.equals(productFranchiseId, that.productFranchiseId) &&
                Objects.equals(franchiseName, that.franchiseName) &&
                Objects.equals(franchiseCountry, that.franchiseCountry) &&
                Objects.equals(franchiseWebsite, that.franchiseWebsite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productFranchiseId, franchiseName, franchiseCountry, franchiseWebsite);
    }
}
