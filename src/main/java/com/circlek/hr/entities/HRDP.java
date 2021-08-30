package com.circlek.hr.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "hrdp")
public class HRDP extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hrdp_year")
    private String year;

    @Column(name = "period")
    private String period;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private int status;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<SuccessionPlanning> successionPlannings = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<Common> commons = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<DevelopmentPlan> developmentPlans = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<Note> notes = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<Criteria> criterias = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "hrdp")
    private Set<BlockLV> blockLVS = new HashSet<>();

}
