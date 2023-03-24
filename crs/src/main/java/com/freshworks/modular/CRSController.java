package com.freshworks.modular;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
class CRSController {

    private CRSService crsService;

    CRSController(CRSService crsService) {
        this.crsService = crsService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/crs")
    String crs() {
        return crsService.getService();
    }

}
