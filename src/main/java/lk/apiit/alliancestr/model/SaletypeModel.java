package lk.apiit.alliancestr.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saletype", schema = "lk_allaince_db", catalog = "")
public class SaletypeModel {
    private String saleTypeId;
    private int saleType;

    @Id
    @Column(name = "sale_type_id")
    public String getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(String saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    @Basic
    @Column(name = "sale_type")
    public int getSaleType() {
        return saleType;
    }

    public void setSaleType(int saleType) {
        this.saleType = saleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaletypeModel that = (SaletypeModel) o;
        return saleType == that.saleType &&
                Objects.equals(saleTypeId, that.saleTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleTypeId, saleType);
    }
}
