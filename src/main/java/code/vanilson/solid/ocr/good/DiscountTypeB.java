package code.vanilson.solid.ocr.good;

public class DiscountTypeB implements Discount {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
