package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "card_payments", schema = "lk_allaince_db", catalog = "")
public class CardPaymentsModel {
    private int cardNumber;
    private String saleId;
    private int cardPaymentId;

    @Basic
    @Column(name = "card_number")
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "sale_id")
    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    @Id
    @Column(name = "card_payment_id")
    public int getCardPaymentId() {
        return cardPaymentId;
    }

    public void setCardPaymentId(int cardPaymentId) {
        this.cardPaymentId = cardPaymentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardPaymentsModel that = (CardPaymentsModel) o;
        return cardNumber == that.cardNumber &&
                cardPaymentId == that.cardPaymentId &&
                Objects.equals(saleId, that.saleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, saleId, cardPaymentId);
    }
}
