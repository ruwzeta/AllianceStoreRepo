package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "review_response", schema = "lk_allaince_db", catalog = "")
public class ReviewResponseModel {
    private String reponseId;
    private String responseDesc;
    private Timestamp responseDate;
    private String reviewId;
    private String discountdiscountId;
    private String userId;

    @Id
    @Column(name = "reponse_id")
    public String getReponseId() {
        return reponseId;
    }

    public void setReponseId(String reponseId) {
        this.reponseId = reponseId;
    }

    @Basic
    @Column(name = "response_desc")
    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    @Basic
    @Column(name = "response_date")
    public Timestamp getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Timestamp responseDate) {
        this.responseDate = responseDate;
    }

    @Basic
    @Column(name = "review_id")
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "Discountdiscount_id")
    public String getDiscountdiscountId() {
        return discountdiscountId;
    }

    public void setDiscountdiscountId(String discountdiscountId) {
        this.discountdiscountId = discountdiscountId;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewResponseModel that = (ReviewResponseModel) o;
        return Objects.equals(reponseId, that.reponseId) &&
                Objects.equals(responseDesc, that.responseDesc) &&
                Objects.equals(responseDate, that.responseDate) &&
                Objects.equals(reviewId, that.reviewId) &&
                Objects.equals(discountdiscountId, that.discountdiscountId) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reponseId, responseDesc, responseDate, reviewId, discountdiscountId, userId);
    }
}
