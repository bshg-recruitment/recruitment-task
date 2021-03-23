package de.bshg.hc.bc.RecruitmentTask;

import java.util.*;

public class DataSource {

    private Map<String, List<String>> currencyMap = new HashMap<>();

    DataSource(){
        currencyMap.put("Europe", Arrays.asList("EUR", "HUF", "GBP", "CHF"));
        currencyMap.put("America", Arrays.asList("USD", "CAD"));
        currencyMap.put("Asia", Arrays.asList("THB", "HKD", "SGD", "JPY"));
        currencyMap.put("Africa", Collections.singletonList("ZAR"));
    }

    public List<String> getCurrencyCodes(String continent) {
        return currencyMap.get(continent);
    }

}
