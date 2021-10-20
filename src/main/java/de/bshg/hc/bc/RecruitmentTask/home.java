package de.bshg.hc.bc.RecruitmentTask;

import de.bshg.hc.bc.RecruitmentTask.nbp.NbpRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @Autowired
    NbpRestClient restClient;

    @GetMapping(value = "/tables", produces = "application/json")
    ResponseEntity<String> getCurrencyTables(){
        return restClient.getCurrencyTable("a");
    }

    @GetMapping(value = "/rate", produces = "application/json")
    ResponseEntity<String> FETCH(
            @RequestParam(name = "CURRENCY", defaultValue = "eur") String CURRENCY
    ){
        return restClient.getCurrencyRate("a", CURRENCY);
    }

}
