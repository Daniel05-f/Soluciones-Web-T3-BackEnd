package com.upn.model;

import jakarta.persistence.*;

@Embeddable
public class MenuRolePK {
    @ManyToOne
    @JoinColumn(name="id_menu", nullable=false,
    foreignKey = @ForeignKey(name="fk_menu_role_menu"))
    private Menu menu;

    @ManyToOne
    @JoinColumn(name="id_role", nullable = false,
    foreignKey = @ForeignKey(name="fk_menu_role_role"))
    private Role role;
}
