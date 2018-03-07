package application.controller;

import application.entity.Args;
import application.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/doSearch", method = RequestMethod.POST)
    public ResponseEntity getHttpResponse(@RequestBody Args arguments) {

        return new ResponseEntity(mainService.getProductList(arguments), HttpStatus.OK);
    }


}
