package entities;

public class ImportedProduct {
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

}
