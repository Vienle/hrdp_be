package com.circlek.hr.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "language_lv")
public class LanguageLV extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", insertable = false, updatable = false)
    private Employee employee;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "spoken")
    private String spoken;

    @Column(name = "written")
    private String written;

    @Column(name = "status")
    private String status;
}
