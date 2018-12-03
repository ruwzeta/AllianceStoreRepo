package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sales_item", schema = "lk_allaince_db", catalog = "")
public class SalesItemModel {
    private String saleId;
    private String productVariationId;
    private String salesItemId;
    private int qty;
    private double salesItemsPrice;
    private double netValue;

    @Basic
    @Column(name = "sale_id")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "product_variation_id")
    public String getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(String productVariationId) {
        this.productVariationId = productVariationId;
    }

    @Id
    @Column(name = "sales_item_id")
    public String getSalesItemId() {
        return salesItemId;
    }

    public void setSalesItemId(String salesItemId) {
        this.salesItemId = salesItemId;
    }

    @Basic
    @Column(name = "qty")
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Basic
    @Column(name = "sales_items_price")
    public double getSalesItemsPrice() {
        return salesItemsPrice;
    }

    public void setSalesItemsPrice(double salesItemsPrice) {
        this.salesItemsPrice = salesItemsPrice;
    }

    @Basic
    @Column(name = "net_value")
    public double getNetValue() {
        return netValue;
    }

    public void setNetValue(double netValue) {
        this.netValue = netValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesItemModel that = (SalesItemModel) o;
        return qty == that.qty &&
                Double.compare(that.salesItemsPrice, salesItemsPrice) == 0 &&
                Double.compare(that.netValue, netValue) == 0 &&
                Objects.equals(saleId, that.saleId) &&
                Objects.equals(productVariationId, that.productVariationId) &&
                Objects.equals(salesItemId, that.salesItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, productVariationId, salesItemId, qty, salesItemsPrice, netValue);
    }
}
