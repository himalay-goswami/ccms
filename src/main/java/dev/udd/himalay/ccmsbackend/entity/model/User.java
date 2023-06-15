package dev.udd.himalay.ccmsbackend.entity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int userId;

    private String userName;
}
