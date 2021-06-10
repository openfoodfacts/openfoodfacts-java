# Java Wrapper for OpenFoodFacts

##### Java (Maven) wrapper for https://world.openfoodfacts.org

## Current version 0.9.1

## Usage

Add one dependency to your POM file:

```xml
<dependencies>
    <dependency>
        <groupId>pl.coderion.openfoodfacts</groupId>
        <artifactId>openfoodfacts</artifactId>
        <version>0.9.1</version>
        <classifier>java-wrapper</classifier>
    </dependency>
</dependencies>
```

Create product service class and find product by its barcode:

```javascript
OpenFoodFactsWrapper wrapper = new OpenFoodFactsWrapperImpl();
ProductResponse productResponse = wrapper.fetchProductByCode("737628064502");
```

[comment]: <> (## Demo)
[comment]: <> (Check also [Demo application]&#40;https://github.com/coderion/openfoodfacts-java-wrapper-demo&#41; how to do it)