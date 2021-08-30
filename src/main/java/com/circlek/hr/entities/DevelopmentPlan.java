package com.circlek.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "development_plan")
public class DevelopmentPlan extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hrdp_id", insertable = false, updatable = false)
    private HRDP hrdp;

    @Column(name = "need")
    private int need;

    @Column(name = "plans")
    private String plans;

    @Column(name = "responsibility")
    private String Responsibility;

    @Column(name = "timming")
    private String timming;

}
