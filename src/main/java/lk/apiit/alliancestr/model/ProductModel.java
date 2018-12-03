package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "lk_allaince_db", catalog = "")
public class ProductModel {
    private String productId;
    private String productName;
    private String productDesc;
    private String productType;
    private String productFranchiseproductFranchiseId;
    private String productBrandbrandId;
    private int productTypeproductTypeId;

    @Id
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_desc")
    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Basic
    @Column(name = "product_type")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "Product Franchiseproduct_franchise_id")
    public String getProductFranchiseproductFranchiseId() {
        return productFranchiseproductFranchiseId;
    }

    public void setProductFranchiseproductFranchiseId(String productFranchiseproductFranchiseId) {
        this.productFranchiseproductFranchiseId = productFranchiseproductFranchiseId;
    }

    @Basic
    @Column(name = "Product Brandbrand_id")
    public String getProductBrandbrandId() {
        return productBrandbrandId;
    }

    public void setProductBrandbrandId(String productBrandbrandId) {
        this.productBrandbrandId = productBrandbrandId;
    }

    @Basic
    @Column(name = "Product Typeproduct_type_id")
    public int getProductTypeproductTypeId() {
        return productTypeproductTypeId;
    }

    public void setProductTypeproductTypeId(int productTypeproductTypeId) {
        this.productTypeproductTypeId = productTypeproductTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductModel that = (ProductModel) o;
        return productTypeproductTypeId == that.productTypeproductTypeId &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productDesc, that.productDesc) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(productFranchiseproductFranchiseId, that.productFranchiseproductFranchiseId) &&
                Objects.equals(productBrandbrandId, that.productBrandbrandId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productDesc, productType, productFranchiseproductFranchiseId, productBrandbrandId, productTypeproductTypeId);
    }
}
