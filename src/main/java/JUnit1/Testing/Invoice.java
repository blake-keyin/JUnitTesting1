package JUnit1.Testing;

public class Invoice {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    static int InvoiceCount = 0;

    public Invoice(String id, String desc, int qty, double unitPrice)
    {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
        InvoiceCount++;
    }
    Invoice (Invoice e)
    {
        this.id = e.id;
        this.desc = e.desc;
        this.qty = e.qty;
        this.unitPrice = e.unitPrice;
        InvoiceCount++;
    }
    public String getID()
    {
        return this.id;
    }

    public String getDesc()
    {
        return this.desc;
    }

    public int getQty()
    {
        return this.qty;
    }

    public void setQty(int new_qty)
    {
        this.qty = new_qty;
    }

    public double getUnitPrice()
    {
        return this.unitPrice;
    }

    public void setUnitPrice(double new_unitPrice)
    {
        this.unitPrice = new_unitPrice;
    }

    public double getTotal()
    {
        return (this.unitPrice * this.qty);
    }

    public String toString()
    {
        return ("Invoice Item: id= " + getID() + ", desc= " + getDesc() + ", qty= " + getQty() + ", unitPrice= " + getUnitPrice());
    }
}

