# Introduction
* API documentation in PL/ENG [available here](http://api.nbp.pl/en.html)
## What we want you to do
* Take a look at the code and try to refactor it as good as you can. Point out everything that seem odd to you : names, empty lines literally whatever.
* You're provided with simple DataSource class which will give you the list of currency codes for given part of the globe in which exchange rates we are interested in. The data will looks as follows:
```
{ continent:"Europe" , currencies : ["EUR", "HUF", "GBP"]}
```
What you need to do in this task is to create an endpoint that returns the price of currencies of given continent with help of DataSource, with respect to Polish zloty (f.e 1zl = 0.2223 euro) . The answers should follow this pattern 
```
{
rates : 
    [
        {
            "currency" : "Euro",
            "code" : "eur"
            "price" : "0.2223"
        }
        ....
        ....
        ....
    ]
}
```
