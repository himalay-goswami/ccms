package dev.udd.himalay.ccmsbackend.repository;

import dev.udd.himalay.ccmsbackend.entity.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CcmsRepository extends JpaRepository<CaseEntity, Integer> {

}
