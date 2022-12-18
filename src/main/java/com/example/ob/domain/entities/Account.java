package com.example.ob.domain.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {

    private String accountId;
    private String name;
    private String accountType;
    private String accountSubType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Account account = (Account) o;
        return getId() != null && Objects.equals(getId(), account.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "accountId = " + accountId + ", " +
                "name = " + name + ", " +
                "accountType = " + accountType + ", " +
                "accountSubType = " + accountSubType + ")";
    }
}