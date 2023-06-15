package dev.udd.himalay.ccmsbackend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

    @Id
    private int userId;

    private String userName;
}
