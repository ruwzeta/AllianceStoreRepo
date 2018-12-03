package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_type", schema = "lk_allaince_db", catalog = "")
public class ProductTypeModel {
    private int productTypeId;
    private int productTypeVarchar;

    @Id
    @Column(name = "product_type_id")
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "product_type varchar")
    public int getProductTypeVarchar() {
        return productTypeVarchar;
    }

    public void setProductTypeVarchar(int productTypeVarchar) {
        this.productTypeVarchar = productTypeVarchar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTypeModel that = (ProductTypeModel) o;
        return productTypeId == that.productTypeId &&
                productTypeVarchar == that.productTypeVarchar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypeId, productTypeVarchar);
    }
}
