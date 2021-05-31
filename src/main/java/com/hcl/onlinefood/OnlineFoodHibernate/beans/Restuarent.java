package com.hcl.onlinefood.OnlineFoodHibernate.beans;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "resturant2")
public class Restuarent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "res_id")
    private int resId;
    @Column(name = "res_name")
    private String resName;
    @Column(name = "res_loc")
    private String resLoc;
    @Column(name = "res_rating")
    private double resRating;

    @OneToMany
    private List<Owner> owner2;

}

