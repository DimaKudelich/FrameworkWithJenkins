package service;

public class ProductPageDataReader {
    public static final String TESTDATA_PRODUCT_PAGE_URL = "testData.addToBasket.page.url";

    public static String getProductPageUrl(){
        return TestDataReader.getTestData(TESTDATA_PRODUCT_PAGE_URL);
    }
}
