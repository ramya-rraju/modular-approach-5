package com.freshworks.modular;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
class TFSController {

    private TFSService tfsService;

    TFSController(TFSService tfsService) {
        this.tfsService = tfsService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/tfs")
    String tfs() {
        return tfsService.getService();
    }

}
