package com.demo.customer.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Entity
@Table(name = "account")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountEntity extends AuditingEntity {
    @Column
    String username;
    @Column
    String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
