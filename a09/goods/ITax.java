/*
Create an interface ITax in package Goods , consists of:
- Field VAT_TAX_PERCENT = 0.1 f
- Method:
public float getCost(): returns the cost of a product after TAX.
 */
package goods;

public interface ITax {
    public float VAT_TAX_PERCENT = 0.1f;
    public float getCost();
}
