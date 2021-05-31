package com.hcl.onlinefood.OnlineFoodHibernate.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "owner2")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "oid")
    private int oid;
    @Column(name = "ownerName", nullable = false)
    private String ownerName;

}

