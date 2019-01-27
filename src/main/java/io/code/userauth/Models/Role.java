package io.code.userauth.Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Role {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "role")
    private String role;
}
