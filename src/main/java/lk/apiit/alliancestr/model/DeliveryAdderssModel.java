package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "delivery_adderss", schema = "lk_allaince_db", catalog = "")
public class DeliveryAdderssModel {
    private String userId;
    private String addressId;
    private String houseNo;
    private String city;
    private String country;
    private int postalCode;

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "address_id")
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "House_no")
    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "postal_code")
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryAdderssModel that = (DeliveryAdderssModel) o;
        return postalCode == that.postalCode &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(addressId, that.addressId) &&
                Objects.equals(houseNo, that.houseNo) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, addressId, houseNo, city, country, postalCode);
    }
}
