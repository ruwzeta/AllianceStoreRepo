package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "delivery_type", schema = "lk_allaince_db", catalog = "")
public class DeliveryTypeModel {
    private int deliveryTypeId;
    private int deliveryType;

    @Id
    @Column(name = "delivery_type_id")
    public int getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(int deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    @Basic
    @Column(name = "delivery_type")
    public int getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        this.deliveryType = deliveryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryTypeModel that = (DeliveryTypeModel) o;
        return deliveryTypeId == that.deliveryTypeId &&
                deliveryType == that.deliveryType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryTypeId, deliveryType);
    }
}
