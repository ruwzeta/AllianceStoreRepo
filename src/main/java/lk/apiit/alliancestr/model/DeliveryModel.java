package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "delivery", schema = "lk_allaince_db", catalog = "")
public class DeliveryModel {
    private String saleId;
    private String deliveryId;
    private Timestamp deliveryDate;
    private int deliveryTypeId;
    private String deliveryAddressId;

    @Basic
    @Column(name = "sale_id")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Id
    @Column(name = "delivery_id")
    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Basic
    @Column(name = "delivery_date")
    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Basic
    @Column(name = "delivery_type_id")
    public int getDeliveryTypeId() {
        return deliveryTypeId;
    }

    public void setDeliveryTypeId(int deliveryTypeId) {
        this.deliveryTypeId = deliveryTypeId;
    }

    @Basic
    @Column(name = "delivery_address_id")
    public String getDeliveryAddressId() {
        return deliveryAddressId;
    }

    public void setDeliveryAddressId(String deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryModel that = (DeliveryModel) o;
        return deliveryTypeId == that.deliveryTypeId &&
                Objects.equals(saleId, that.saleId) &&
                Objects.equals(deliveryId, that.deliveryId) &&
                Objects.equals(deliveryDate, that.deliveryDate) &&
                Objects.equals(deliveryAddressId, that.deliveryAddressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, deliveryId, deliveryDate, deliveryTypeId, deliveryAddressId);
    }
}
