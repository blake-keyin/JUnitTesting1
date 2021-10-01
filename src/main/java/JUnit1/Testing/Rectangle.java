package JUnit1.Testing;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }


    public float getLength()
    {
        return this.length;
    }

    public void setLength(float new_length)
    {
        this.length = new_length;
    }

    public float getWidth()
    {
        return this.width;
    }

    public void setWidth(float new_width)
    {
        this.width = new_width;
    }

    public double getArea()
    {
        return (this.length * this.width);
    }

    public double getPerimeter()
    {
        return (this.length * 2) + (this.width * 2);
    }

    public String toString()
    {
        return ("Rectangle Length = " + getLength() + "\nRectangle Width = " + getWidth());
    }
}
