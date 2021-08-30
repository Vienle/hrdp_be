package com.circlek.hr.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "exp_pick")
public class ExpPiCK extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", insertable = false, updatable = false)
    private Employee employee;

    @Column(name = "details")
    private String details;

    @Column(name = "status")
    private int status;
}
