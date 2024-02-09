package dev.himalay.ccms.data;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.Set;

@Entity
public class CaseEntity extends AbstractEntity{

    //case details
    private String caseNumber;

    @Enumerated(EnumType.STRING)
    private Set<CaseType> caseType;
}
