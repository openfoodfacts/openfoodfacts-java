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


## Using this SDK and Third party applications

- If you use this SDK, feel free to open a PR to add your application in the list in [REUSERS.md](https://github.com/openfoodfacts/openfoodfacts-java/blob/develop/REUSERS.md)
- Make sure you comply with the OdBL licence, mentioning the Source of your data, and ensuring to avoid combining non free data you can't release legally as open data. Another requirement is contributing back any product you add using this SDK.
- Please get in touch at reuse@openfoodfacts.org
- We are very interested in learning what the Open Food Facts data is used for. It is not mandatory, but we would very much appreciate it if you tell us about your re-uses (https://forms.gle/hwaeqBfs8ywwhbTg8) so that we can share them with the Open Food Facts community. You can also fill this form to get a chance to get your app featured: https://forms.gle/hwaeqBfs8ywwhbTg8

## Authors
