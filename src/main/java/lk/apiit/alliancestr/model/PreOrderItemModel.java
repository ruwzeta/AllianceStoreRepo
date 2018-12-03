package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pre_order_item", schema = "lk_allaince_db", catalog = "")
public class PreOrderItemModel {
    private String orderItemId;
    private String preOrderId;
    private int preOrderQty;
    private String productVariationId;

    @Id
    @Column(name = "order_item_id")
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @Basic
    @Column(name = "pre_order_id")
    public String getPreOrderId() {
        return preOrderId;
    }

    public void setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
    }

    @Basic
    @Column(name = "pre_order_qty")
    public int getPreOrderQty() {
        return preOrderQty;
    }

    public void setPreOrderQty(int preOrderQty) {
        this.preOrderQty = preOrderQty;
    }

    @Basic
    @Column(name = "product_variation_id")
    public String getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(String productVariationId) {
        this.productVariationId = productVariationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PreOrderItemModel that = (PreOrderItemModel) o;
        return preOrderQty == that.preOrderQty &&
                Objects.equals(orderItemId, that.orderItemId) &&
                Objects.equals(preOrderId, that.preOrderId) &&
                Objects.equals(productVariationId, that.productVariationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderItemId, preOrderId, preOrderQty, productVariationId);
    }
}
