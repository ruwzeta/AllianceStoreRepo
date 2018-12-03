package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_type", schema = "lk_allaince_db", catalog = "")
public class UserTypeModel {
    private int userTypeId;
    private String userType;

    @Id
    @Column(name = "user_type_id")
    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Basic
    @Column(name = "user_type_")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTypeModel that = (UserTypeModel) o;
        return userTypeId == that.userTypeId &&
                Objects.equals(userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTypeId, userType);
    }
}
