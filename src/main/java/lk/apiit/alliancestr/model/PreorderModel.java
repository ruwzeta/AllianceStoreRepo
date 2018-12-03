package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "preorder", schema = "lk_allaince_db", catalog = "")
public class PreorderModel {
    private String userId;
    private String preOrderId;
    private Date placeDate;
    private Date expectedDate;
    private String deliveryId;

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "pre_order_id")
    public String getPreOrderId() {
        return preOrderId;
    }

    public void setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
    }

    @Basic
    @Column(name = "place_date")
    public Date getPlaceDate() {
        return placeDate;
    }

    public void setPlaceDate(Date placeDate) {
        this.placeDate = placeDate;
    }

    @Basic
    @Column(name = "expected_date")
    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    @Basic
    @Column(name = "delivery_id")
    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreorderModel that = (PreorderModel) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(preOrderId, that.preOrderId) &&
                Objects.equals(placeDate, that.placeDate) &&
                Objects.equals(expectedDate, that.expectedDate) &&
                Objects.equals(deliveryId, that.deliveryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, preOrderId, placeDate, expectedDate, deliveryId);
    }
}
