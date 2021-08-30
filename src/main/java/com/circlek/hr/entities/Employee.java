package com.circlek.hr.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "staff_code",nullable = false,unique = true)
    private String staffCode;
    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Column(name = "password",nullable = false)
    private String password;
    @Column(name = "joining_date")
    private Date joiningDate;
    @Column(name = "lefts_date")
    private Date leftsDate;
    @Column(name = "status")
    private int status;
    @Column(name = "role")
    private int role;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<EmployeeInfor> infors = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "approvelv1")
    private Set<EmployeeInfor> approvelv1 = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "approvelv2")
    private Set<EmployeeInfor> approvelv2 = new HashSet<>();


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Credential> credentials = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Training> trainings = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<LanguageLV> languageLVS = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<ExpAtCK> expAtCKS = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<ExpPiCK> expPiCKS = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Hod> hods = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<SuccessionPlanning> successionPlannings = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<DevelopmentPlan> developmentPlans = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<BlockLV> blockLVS = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Note> notes = new HashSet<>();
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<Common> commons = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
    private Set<CriteriaHRDP> criteriaHRDPS = new HashSet<>();





    private enum EmployeeEnum {
        ACTIVE(1),INACTIVE(0);
        private final int levelCode;

        EmployeeEnum(int levelCode) {
            this.levelCode = levelCode;
        }
    }

    private enum EmployeeRole {
        ADMIN(1),USER(0),HR(2),TRAINING(3);
        private final int levelCode;

        EmployeeRole(int levelCode) {
            this.levelCode = levelCode;
        }
    }
}
