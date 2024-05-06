package Project.store;

public class store {

    private String productName;
    private String serialNumber;
    private float valueOfTheProduct;

    public store(String productName, String serialNumber, float valueOfTheProduct) {
            this.productName = productName;
            this.serialNumber = serialNumber;
            this.valueOfTheProduct = valueOfTheProduct;
    }


    public float getValueOfTheProduct() {
        return valueOfTheProduct;
    }

    public void setValueOfTheProduct(float valueOfTheProduct) {
        this.valueOfTheProduct = valueOfTheProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
