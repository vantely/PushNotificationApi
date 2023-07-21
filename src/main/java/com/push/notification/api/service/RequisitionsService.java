package com.push.notification.api.service;

import com.push.notification.api.model.Requisitions;
import com.push.notification.api.repository.RequisitionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequisitionsService {

    private RequisitionsRepository requisitionsRepository;

    public RequisitionsService(RequisitionsRepository requisitionsRepository){
        this.requisitionsRepository = requisitionsRepository;
    }

    public List<Requisitions> retrieveListOfRequisitions(){
        return requisitionsRepository.findAll();
    }
}
