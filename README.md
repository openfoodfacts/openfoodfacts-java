# Java Wrapper for OpenFoodFacts

##### Java (Maven) wrapper for https://world.openfoodfacts.org

## Current version 0.9.3

## Usage

Add one dependency to your POM file:

```xml
<dependencies>
    <dependency>
        <groupId>pl.coderion</groupId>
        <artifactId>openfoodfacts-java-wrapper</artifactId>
        <version>0.9.3</version>
    </dependency>
</dependencies>
```

Create wrapper object and find product by its barcode:

```javascript
OpenFoodFactsWrapper wrapper = new OpenFoodFactsWrapperImpl();
ProductResponse productResponse = wrapper.fetchProductByCode("737628064502");
```

## Demo
Check also [Demo application](https://github.com/openfoodfacts/openfoodfacts-java-demo) how to do it.


## Third party applications
Feel free to open a PR to add your application in this list.

## Authors
