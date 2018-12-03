package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cardtype", schema = "lk_allaince_db", catalog = "")
public class CardtypeModel {
    private int cardTypeId;
    private int cardType;

    @Id
    @Column(name = "card_type_id")
    public int getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(int cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Basic
    @Column(name = "card_type")
    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardtypeModel that = (CardtypeModel) o;
        return cardTypeId == that.cardTypeId &&
                cardType == that.cardType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardTypeId, cardType);
    }
}
