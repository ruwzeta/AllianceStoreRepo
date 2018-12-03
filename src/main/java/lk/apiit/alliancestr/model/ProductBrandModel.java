package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_brand", schema = "lk_allaince_db", catalog = "")
public class ProductBrandModel {
    private String brandId;
    private String brandName;
    private String count;

    @Id
    @Column(name = "brand_id")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "brand_name")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "Count")
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBrandModel that = (ProductBrandModel) o;
        return Objects.equals(brandId, that.brandId) &&
                Objects.equals(brandName, that.brandName) &&
                Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandName, count);
    }
}
