package code.vanilson.solid.ocr.good;

public class DiscountTypeA implements Discount {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
