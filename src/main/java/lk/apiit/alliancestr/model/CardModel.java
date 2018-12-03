package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "card", schema = "lk_allaince_db", catalog = "")
public class CardModel {
    private String userId;
    private int cardNumber;
    private int cardCvNumber;
    private Date expirydate;
    private String bankName;
    private int cardTypeId;

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "card_number")
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Basic
    @Column(name = "card_cv_number")
    public int getCardCvNumber() {
        return cardCvNumber;
    }

    public void setCardCvNumber(int cardCvNumber) {
        this.cardCvNumber = cardCvNumber;
    }

    @Basic
    @Column(name = "expirydate")
    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    @Basic
    @Column(name = "bank_name")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "card_type_id")
    public int getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardModel cardModel = (CardModel) o;
        return cardNumber == cardModel.cardNumber &&
                cardCvNumber == cardModel.cardCvNumber &&
                cardTypeId == cardModel.cardTypeId &&
                Objects.equals(userId, cardModel.userId) &&
                Objects.equals(expirydate, cardModel.expirydate) &&
                Objects.equals(bankName, cardModel.bankName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, cardNumber, cardCvNumber, expirydate, bankName, cardTypeId);
    }
}
