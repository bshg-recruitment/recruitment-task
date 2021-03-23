package de.bshg.hc.bc.RecruitmentTask.nbp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static de.bshg.hc.bc.RecruitmentTask.nbp.NbpConstants.*;

@FeignClient(name = "NBP", url = NBP_URL)
public interface NbpRestClient {

    @GetMapping(CURRENCY_TABLES + "/{tableType}")
    ResponseEntity<String> getCurrencyTable(
            @PathVariable String tableType
    );

    @GetMapping(RATES + "/{tableType}/{currencyCode}")
    ResponseEntity<String> getCurrencyRate(
            @PathVariable String tableType,
            @PathVariable String currencyCode
    );

    @GetMapping(RATES + "/{tableType}/{currencyCode}/last/{count}")
    ResponseEntity<String> getLastTopCountExchangeRatesFromTable(
            @PathVariable String tableType,
            @PathVariable String currencyCode,
            @PathVariable Integer count
    );

    @GetMapping(RATES + "/{tableType}/{currencyCode}/today")
    ResponseEntity<String> getTodayExchangeRatesFromTable(
            @PathVariable String tableType,
            @PathVariable String currencyCode
    );

    @GetMapping(RATES + "/{tableType}/{currencyCode}/{date}")
    ResponseEntity<String> getExchangeRatesFromTableForGivenDate(
            @PathVariable String tableType,
            @PathVariable String currencyCode,
            @PathVariable String date
    );

    @GetMapping(RATES + "/{tableType}/{currencyCode}/{startDate}/{endDate}")
    ResponseEntity<String> getExchangeRatesFromTableFromStartDateToEndDate(
            @PathVariable String tableType,
            @PathVariable String currencyCode,
            @PathVariable String startDate,
            @PathVariable String endDate
    );

}
