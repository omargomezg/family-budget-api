package com.hardnets.presupuesto.domain.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "operation", schema = "db_owner", catalog = "miPresupuesto")
public class OperationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "date")
    private Date date;
    @Column(name = "amount")
    private BigDecimal amount;
    @JoinColumn(name = "categoryId", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoryEntity category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationEntity that = (OperationEntity) o;
        return getId() == that.getId() &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getDate(), that.getDate()) &&
                Objects.equals(getAmount(), that.getAmount()) &&
                Objects.equals(getCategory(), that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription(), getDate(), getAmount(), getCategory());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}
