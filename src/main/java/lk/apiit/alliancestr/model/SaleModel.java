package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sale", schema = "lk_allaince_db", catalog = "")
public class SaleModel {
    private String saleId;
    private Timestamp saleDate;
    private double saleTotal;
    private double saleNetValue;
    private String userId;
    private String saleTypeId;

    @Id
    @Column(name = "sale_id")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "sale_date")
    public Timestamp getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
    }

    @Basic
    @Column(name = "sale_total")
    public double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }

    @Basic
    @Column(name = "sale_net_value")
    public double getSaleNetValue() {
        return saleNetValue;
    }

    public void setSaleNetValue(double saleNetValue) {
        this.saleNetValue = saleNetValue;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "sale_type_id")
    public String getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(String saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleModel saleModel = (SaleModel) o;
        return Double.compare(saleModel.saleTotal, saleTotal) == 0 &&
                Double.compare(saleModel.saleNetValue, saleNetValue) == 0 &&
                Objects.equals(saleId, saleModel.saleId) &&
                Objects.equals(saleDate, saleModel.saleDate) &&
                Objects.equals(userId, saleModel.userId) &&
                Objects.equals(saleTypeId, saleModel.saleTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, saleDate, saleTotal, saleNetValue, userId, saleTypeId);
    }
}
