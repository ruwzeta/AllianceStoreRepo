package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "discount_type", schema = "lk_allaince_db", catalog = "")
public class DiscountTypeModel {
    private String discountTypeId;
    private String discountType;

    @Id
    @Column(name = "discount_type_id")
    public String getDiscountTypeId() {
        return discountTypeId;
    }

    public void setDiscountTypeId(String discountTypeId) {
        this.discountTypeId = discountTypeId;
    }

    @Basic
    @Column(name = "discount_type")
    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscountTypeModel that = (DiscountTypeModel) o;
        return Objects.equals(discountTypeId, that.discountTypeId) &&
                Objects.equals(discountType, that.discountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountTypeId, discountType);
    }
}
