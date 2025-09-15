//Hung Anh Ho
//11-20-2022
//PreferredCustomer class

public class PreferredCustomer extends Customer 
{
    private double purchasesMade;
    private int discountLevel;
    
    /**
     *No argument constructor
     */
    public PreferredCustomer()
    {
        super();
        purchasesMade = 0.0;
        discountLevel = 0;
    }

    /**
     * Copy Constructor
     * @param object2 The object to be copied
     */
    public PreferredCustomer(PreferredCustomer object2)
    {
    	this.setName(object2.getName());
        this.setAddress(object2.getAddress());
        this.setTelephoneNumber(object2.getTelephoneNumber());
        this.setCustomerNumber(object2.getCustomerNumber());
        this.getOnMailingList();
        this.purchasesMade = object2.getPurchasesMade();
        this.discountLevel = object2.getDiscountLevel();
    }

    /**
     * Copy Constructor
     * @param object2 The object to be copied
     */
    public PreferredCustomer(Customer object2, double purchasesMade)
    {
        this.setName(object2.getName());
        this.setAddress(object2.getAddress());
        this.setTelephoneNumber(object2.getTelephoneNumber());
        this.setCustomerNumber(object2.getCustomerNumber());
        this.getOnMailingList();
        this.purchasesMade = purchasesMade;
        this.discountLevel = calculateDiscountLevel();
    }

    
    /**
     * setPurchasesMade mutator
     * @param purchasesMade-double type
     */
    public void setPurchasesMade(double purchasesMade) 
    {
        this.purchasesMade = purchasesMade;
        this.discountLevel = calculateDiscountLevel();
    }
    
    /**
     * getPurchasesMade getter
     * @return purchasesMade-double type
     */
    public double getPurchasesMade() 
    {
        return purchasesMade;
    }
    
    /**
     * setDiscountLevel mutator
     * @param discountLevel-integer type
     */
    public void setDiscountLevel(int discountLevel) 
    {
        this.discountLevel = discountLevel;
    }
    
    /**
     * getDiscountLevel return discount
     * @return discountLevel
     */
    public int getDiscountLevel() 
    {
        return discountLevel;
    }
    
    /**
     * calculateDiscountLevel calculate the discount level
     * @return discount-integer type
     */
    public int calculateDiscountLevel()
    {
        int discount = 0;
        if(purchasesMade >= 2000.0)
            discount = 10;
        else if(purchasesMade >= 1500.0)
            discount = 7;
        else if(purchasesMade >= 1000.0)
            discount = 6;
        else if(purchasesMade >= 500.0)
            discount = 5;

        return discount;
    }

    /**
     * Return String format
     */
    public String toString() 
    {
        return super.toString() +
                String.format("\n\nPurchases Made: %.2f", getPurchasesMade()) +
                String.format("\nDiscount on future purchase: " + getDiscountLevel() + " %");
    }
}
