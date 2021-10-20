# Introduction
* API documentation in PL/ENG [available here](http://api.nbp.pl/en.html)

### API Description
The National Polish Bank API provides various of endpoints, but in this task we will focus only on the small part of its functionality.
You can read data from three kind of tables : 
* Table A - mean rates of foreign currencies
* Table B - mean rates of foreign currencies (but different from the one in A)
* Table C - rates of buy/sell operations of foreign currencies (most popular one)

Example answers from this API look as follows :  
For table A
```json
[
    {
        "table": "A",
        "no": "056/A/NBP/2021",
        "effectiveDate": "2021-03-23",
        "rates": [
            {
                "currency": "Thai baht",
                "code": "THB",
                "mid": 0.1251
            },
            {
                "currency": "United State dollar",
                "code": "USD",
                "mid": 3.8746
            },
            .
            .
            .
    }
]
``` 
for table B
```json
[
    {
        "table": "B",
        "no": "011/B/NBP/2021",
        "effectiveDate": "2021-03-17",
        "rates": [
            {
                "currency": "afgani (Afghanistan)",
                "code": "AFN",
                "mid": 0.049458
            },
            {
                "currency": "ariary (Madagascar)",
                "code": "MGA",
                "mid": 0.00102
            },
            {
                "currency": "balboa (Panama)",
                "code": "PAB",
                "mid": 3.8676
            },
            .
            .
      }
]
```
and for table C

```json
[
    {
        "table": "C",
        "no": "057/C/NBP/2021",
        "tradingDate": "2021-03-23",
        "effectiveDate": "2021-03-24",
        "rates": [
            {
                "currency": "United state dollar",
                "code": "USD",
                "bid": 3.8507,
                "ask": 3.9285
            },
            {
                "currency": "Australian dollar",
                "code": "AUD",
                "bid": 2.9574,
                "ask": 3.0172
            },
            {
                "currency": "Canadian dollar",
                "code": "CAD",
                "bid": 3.0657,
                "ask": 3.1277
            },
            .
            .
    }
]
```
## What we want you to do
1. Take a look at the code and try to refactor it as good as you can. Point out everything that seem odd to you : names, empty lines literally whatever.
2. You're provided with the class `CurrencyWallet`. Inside this class you can only find an Integer `budget`. Please implement all the necessary things in the class to be able to perform following task
    * Create endpoint which with given budget tries to buy one currency for each continent. For example : 
        * Europe - Euro[EUR]
        * Asia - Thai baht[TBH]
        * North America - US Dollar [USD]
        * South America - Brazilian Real [BRL]
        * Africa - Republic of South Africa Rand [ZAR]  
        In brackets you can find the currency code 
    * Check if you have enough money in your budget to buy all the currencies. If not, try to show it somehow.  
    * Implement endpoint `/balance` which displays how much money you have left in the budget and what currencies you have bought.
```
