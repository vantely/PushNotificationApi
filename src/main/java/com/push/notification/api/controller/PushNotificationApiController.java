package com.push.notification.api.controller;

import com.push.notification.api.model.Requisitions;
import com.push.notification.api.service.RequisitionsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/data")
public class PushNotificationApiController {

    private RequisitionsService requisitionsService;

    public PushNotificationApiController(RequisitionsService requisitionsService){
        this.requisitionsService = requisitionsService;
    }
    @GetMapping
    public List<Requisitions> getrequisitionsList(){
        //List<Requisitions> requisitionsList = requisitionsService.retrieveListOfRequisitions();
        return requisitionsService.retrieveListOfRequisitions();
    }

    /*
    private List<Requisitions> getRequisitionsList(){
        List<Requisitions> requisitionsList = new ArrayList<>();

        // obj1
        Requisitions obj1 = new
                Requisitions(3, "Requisition 3",
                "Monitor replacement with non-standard model 1",
                "John Doe", "2023-07-17");
        requisitionsList.add(obj1);
        // obj2
        Requisitions obj2 = new
                Requisitions(4, "Requisition 4",
                "Keyboard replacement with non-standard model for ergonomic fix",
                "Jane Smith", "2023-07-16");
        requisitionsList.add(obj2);
        // obj3
        Requisitions obj3 = new
                Requisitions(5, "Requisition 5",
                "Mouse with non-standard model for ergonomic fix",
                "Mike Johnson", "2023-07-15");
        requisitionsList.add(obj3);

        return requisitionsList;
    }
    */

}
