package application.entity;

public class Product {

    private String idProduct;
    private String titleProduct;
    private String quickLook;
    private String creationDate;
    private String ingestionDate;

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getTitleProduct() {
        return titleProduct;
    }

    public void setTitleProduct(String titleProduct) {
        this.titleProduct = titleProduct;
    }

    public String getQuickLook() {
        return quickLook;
    }

    public void setQuickLook(String quickLook) {
        this.quickLook = quickLook;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationdate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getIngestionDate() {
        return ingestionDate;
    }

    public void setIngestionDate(String ingestionDate) {
        this.ingestionDate = ingestionDate;
    }
}
