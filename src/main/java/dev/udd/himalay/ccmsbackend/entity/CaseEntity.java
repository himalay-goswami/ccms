package dev.udd.himalay.ccmsbackend.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cases")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int caseId;

    @Column(nullable = false)
    private Integer caseNumber;

    @Column(nullable = false)
    private String yearOfCase;


    @Column(nullable = false)
    private String applicants;

    @Column(nullable = false)
    private String defendants;

    @Column(nullable = false)
    private boolean isClosed;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private boolean isCAFiled;

    @Column(nullable = false)
    private String finalDecisionDate;

    @Column(nullable = false)
    private String nextHearingDate;

    @Column(nullable = false)
    private String resolution;
}
