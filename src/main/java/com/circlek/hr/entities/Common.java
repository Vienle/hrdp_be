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
@Table(name = "common")
public class Common extends  BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hrdp_id", insertable = false, updatable = false)
    private HRDP hrdp;

    @Column(name = "strengths")
    private String strengths;

    @Column(name = "accomplishments")
    private String accomplishments;

    @Column(name = "career_aspirations")
    private String careerAspirations;

    @Column(name = "relocation")
    private String reLocation;

    @Column(name = "how_long")
    private String howLong;
}
