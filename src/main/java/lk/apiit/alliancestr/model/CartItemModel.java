package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cart_item", schema = "lk_allaince_db", catalog = "")
public class CartItemModel {
    private String shoppingCartId;
    private String cartItemId;
    private String productVariationId;
    private int qty;

    @Basic
    @Column(name = "shopping_cart_id")
    public String getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(String shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    @Id
    @Column(name = "cart_item_id")
    public String getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    @Basic
    @Column(name = "product_variation_id")
    public String getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(String productVariationId) {
        this.productVariationId = productVariationId;
    }

    @Basic
    @Column(name = "qty")
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItemModel that = (CartItemModel) o;
        return qty == that.qty &&
                Objects.equals(shoppingCartId, that.shoppingCartId) &&
                Objects.equals(cartItemId, that.cartItemId) &&
                Objects.equals(productVariationId, that.productVariationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingCartId, cartItemId, productVariationId, qty);
    }
}
