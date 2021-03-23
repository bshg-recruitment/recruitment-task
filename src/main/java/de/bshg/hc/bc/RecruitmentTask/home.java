package de.bshg.hc.bc.RecruitmentTask;

import de.bshg.hc.bc.RecruitmentTask.nbp.NbpRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @Autowired
    NbpRestClient restClient;

    DataSource dataSource = new DataSource();

    @GetMapping(value = "/tables", produces = "application/json")
    ResponseEntity<String> getCurrencyTables(){
        return restClient.getCurrencyTable("a");
    }

    @GetMapping(value = "/rate", produces = "application/json")
    ResponseEntity<String> pobierzWartosciKursuDlaWalut(
            @RequestParam(name = "waluta", defaultValue = "eur") String waluta
    ){
        return restClient.getCurrencyRate("a", waluta);
    }

    @GetMapping(value = "/rate/top", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getLastTopCountCurrencyExchangeRates(
            @RequestParam(name = "currency", defaultValue = "eur") String currency,
            @RequestParam(name = "count", defaultValue = "10") Integer count
    ){
        return restClient.getLastTopCountExchangeRatesFromTable("a", currency, count);
    }
}
