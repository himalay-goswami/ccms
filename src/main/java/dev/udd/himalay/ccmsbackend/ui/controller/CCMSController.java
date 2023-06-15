package dev.udd.himalay.ccmsbackend.ui.controller;

import dev.udd.himalay.ccmsbackend.entity.CaseEntity;
import dev.udd.himalay.ccmsbackend.repository.CcmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CCMSController {

    @Autowired
    private CcmsRepository ccmsRepository;

    @GetMapping("/allCases")
    public List<CaseEntity> getAllCases(){
        return ccmsRepository.findAll();
    }

}
