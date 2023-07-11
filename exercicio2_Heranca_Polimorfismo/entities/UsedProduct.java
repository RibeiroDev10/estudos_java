package entities;

import java.util.Date;

public class UsedProduct {
    private Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
