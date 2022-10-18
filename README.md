# Java Wrapper for OpenFoodFacts

![Github Repo Size](https://img.shields.io/github/repo-size/openfoodfacts/openfoodfacts-java?style=for-the-badge&color=aqua)

|||
|--|--|
|Java (Maven) wrapper for [Open Food Facts](https://world.openfoodfacts.org)|Current version 0.9.3 |

<details><summary><h2>Usage</h2></summary>

- Add one dependency to your POM file:

```xml
<dependencies>
    <dependency>
        <groupId>pl.coderion</groupId>
        <artifactId>openfoodfacts-java-wrapper</artifactId>
        <version>0.9.3</version>
    </dependency>
</dependencies>
```

- Create wrapper object and find product by its barcode:

```javascript
OpenFoodFactsWrapper wrapper = new OpenFoodFactsWrapperImpl();
ProductResponse productResponse = wrapper.fetchProductByCode("737628064502");
```
</details>

<br>

## Demo
Check also [Demo application](https://github.com/openfoodfacts/openfoodfacts-java-demo) about how to do it.


## Third party applications
Feel free to open a PR to add your application in this list.

## Contributors

<a href="https://github.com/openfoodfacts/openfoodfacts-java/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=openfoodfacts/openfoodfacts-java" />
</a>
