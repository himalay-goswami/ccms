package dev.udd.himalay.ccmsbackend.ui.controller;

import dev.udd.himalay.ccmsbackend.entity.CaseEntity;
import dev.udd.himalay.ccmsbackend.repository.CcmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class CCMSController {

    @Autowired
    private CcmsRepository ccmsRepository;

    @GetMapping("/allCases")
    public List<CaseEntity> getAllCases(){
        return ccmsRepository.findAll();
    }

    @GetMapping("/findCase/{id}")
    public Optional<CaseEntity> findCaseById(@PathVariable int id){
        try{
            return ccmsRepository.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @PostMapping("/add")
    public boolean addCase(@RequestBody CaseEntity caseEntityDto){
        ccmsRepository.save(caseEntityDto);
        return true;  
    }

}
