package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "shopping_cart", schema = "lk_allaince_db", catalog = "")
public class ShoppingCartModel {
    private String userId;
    private String shoppingCartId;
    private double cartTotal;
    private Date cartDate;

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "shopping_cart_id")
    public String getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(String shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    @Basic
    @Column(name = "cart_total")
    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    @Basic
    @Column(name = "cart_date")
    public Date getCartDate() {
        return cartDate;
    }

    public void setCartDate(Date cartDate) {
        this.cartDate = cartDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartModel that = (ShoppingCartModel) o;
        return Double.compare(that.cartTotal, cartTotal) == 0 &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(shoppingCartId, that.shoppingCartId) &&
                Objects.equals(cartDate, that.cartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, shoppingCartId, cartTotal, cartDate);
    }
}
