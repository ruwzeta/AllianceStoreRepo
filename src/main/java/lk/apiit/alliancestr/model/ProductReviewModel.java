package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_review", schema = "lk_allaince_db", catalog = "")
public class ProductReviewModel {
    private String productId;
    private String reviewId;
    private String reviewDesc;
    private Integer rating;
    private Timestamp reviewDate;
    private String userId;

    @Basic
    @Column(name = "product_id")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "review_id")
    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    @Basic
    @Column(name = "review_desc")
    public String getReviewDesc() {
        return reviewDesc;
    }

    public void setReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
    }

    @Basic
    @Column(name = "rating")
    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "review_date")
    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
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
        ProductReviewModel that = (ProductReviewModel) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(reviewId, that.reviewId) &&
                Objects.equals(reviewDesc, that.reviewDesc) &&
                Objects.equals(rating, that.rating) &&
                Objects.equals(reviewDate, that.reviewDate) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, reviewId, reviewDesc, rating, reviewDate, userId);
    }
}
