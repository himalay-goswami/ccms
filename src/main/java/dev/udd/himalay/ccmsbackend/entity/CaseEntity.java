package dev.udd.himalay.ccmsbackend.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cases")
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class CaseEntity {

    @Id
    @Column(name = "case_id")
    private int caseId;

    @Column(name = "case_number")
    private Integer caseNumber;

    @Column(name = "year_of_case")
    private String yearOfCase;

    @Column(name = "applicants")
    private String applicants;

    @Column(name = "defendants")
    private String defendants;

    @Column(name = "is_closed")
    private boolean isClosed;

    @Column(name = "description")
    private String description;

    @Column(name = "iscafiled")
    private boolean isCAFiled;

    @Column(name = "final_decision_date")
    private String finalDecisionDate;

    @Column(name = "next_hearing_date")
    private String nextHearingDate;

    @Column(name = "resolution")
    private String resolution;
}
