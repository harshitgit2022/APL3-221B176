class Decorator extends Offerings {
    Offerings offering;
    
    Decorator(Offerings offering) {
        this.offering = offering;
    }
    
    public String getName() {
        return this.offering.getName();
    }
    
    public int getPrice() {
        return this.offering.getPrice();
    }
}