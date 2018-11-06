package com.hardnets.presupuesto.domain.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "classification", schema = "db_owner", catalog = "miPresupuesto")
public class ClassificationEntity {
    private int id;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassificationEntity tipo = (ClassificationEntity) o;
        return getId() == tipo.getId() &&
                Objects.equals(getDescription(), tipo.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescription());
    }

}
