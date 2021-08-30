package com.circlek.hr.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_infor")
public class EmployeeInfor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "infor_id")
    private Long inforID;
    @Column(name = "title")
    private String title;
    @Column(name = "effective_date")
    private Date effDate;
    @Column(name = "not_view_by")
    private String notViewBy;
    @Column(name = "status")
    private int status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approve_lv1", insertable = false, updatable = false)
    private Employee approvelv1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approve_lv2", insertable = false, updatable = false)
    private Employee approvelv2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", insertable = false, updatable = false)
    private Department department;


}
