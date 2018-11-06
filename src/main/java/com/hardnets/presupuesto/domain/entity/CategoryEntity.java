package com.hardnets.presupuesto.domain.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "db_owner", catalog = "miPresupuesto")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "comment")
    private String comment;
    @JoinColumn(name = "fatherId", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity father;
    @JoinColumn(name = "classificationId", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ClassificationEntity type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getComment(), that.getComment()) &&
                Objects.equals(getFather(), that.getFather()) &&
                Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getComment(), getFather(), getType());
    }

    public CategoryEntity getFather() {
        return father;
    }

    public void setFather(CategoryEntity father) {
        this.father = father;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ClassificationEntity getType() {
        return type;
    }

    public void setType(ClassificationEntity type) {
        this.type = type;
    }
}
