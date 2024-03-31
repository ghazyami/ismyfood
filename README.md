# IS MY FOOD
An engine to process food products data and helps us answer the question  ***Is my food ... ?***

Vegan, allergy safe, nutrition value, religious compliance, etc...
Whatever the criteria is, IS MY FOOD provides an engine to process pluggable rules to evaluate food products.

## How to run
- Start services 
    - Via running the script `./run.sh`
    - Or manually executing  `mvn package` then `docker-compose up -d --build`
- Access the UI
    - via [http://127-0-0-1.ui.sslip.io](http://127-0-0-1.ui.sslip.io)
    - Or [http://localhost:8000](http://localhost:8000)
- Navigate to `Product checker` on the left navigation menu
- Input a product code - examples
    - `3274080005003`
    - `0737628064502`
- Select a rule - example `Peanuts Allergy`
- Click `Check now` button
- See the result!
- Access monitoring dashboards
    - via [http://127-0-0-1.grafana.sslip.io/dashboards](http://127-0-0-1.grafana.sslip.io/dashboards)
    - Or [http://localhost:3000/dashboards](http://localhost:3000/dashboards)

## Overview

### Components
- [Backend service](./server)
    - Exposes and API to get information about an evaluated product
    - Consumes [OpenFoodFacts](https://world.openfoodfacts.org) API to get information about products
    - Process rules (external files that holds the logic to evaluate the product)
- [Frontend](./ui)
    - Webpage that accepts a product's barcode number and a rule to process against
    - Consume `Backend Service` and displays the result
- [Core](./core)
    - Shared code for other modules

### Technologies (Including but not limited to)
- Jakarta EE
    - Jakarta REST - `Backend service API`
    - Jakarta Expression Language - `Rule are EL statments`
- MicroProfile
- Payara
    - Payara Micro `Runtime`
    - Payara Micro auto-clustering
    - JCache `Products data caching`
- Docker

### Rules
Rules are [Jakarta Expressions Languages](https://jakarta.ee/specifications/expression-language/5.0/jakarta-expression-language-spec-5.0.html)
statements that allow us to dynamically evaluate external logic to our products

Each line must contain a complete statement like
```
status = !product.allergensTags.stream().anyMatch(t -> t.contains("peanut"))
```

Temporary variables can be defined and used in later statements
```
x = "Some"
y = " value"
z = x.concat(y)
```

The product information is available in a variable name `product`
check [Product](./core/src/main/java/com/github/ghazyami/ismyfood/off/entity/Product.java) class
to know about internal properties, here for example we are examining the list of allergens if they contain `Peanuts`
```
status = !p.allergensTags.stream().anyMatch(t -> t.contains("peanut"))
```

Every rule must populate two result fields to indicate positive or negative results (i.e. weather the product is safe to consume or not)
```
positiveRuleMatch = true
message = "Product is safe to be consumed"
```