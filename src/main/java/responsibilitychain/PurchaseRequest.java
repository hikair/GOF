package responsibilitychain;

public class PurchaseRequest {

    private Integer type;

    private Float price;

    private Integer id;

    public PurchaseRequest(Integer type, Float price, Integer id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
