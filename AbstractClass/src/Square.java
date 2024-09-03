public class Square extends Shape
{
    public Square(double area)
    {
        super(area);
    }
    @Override
    public String getDescription()
    {
        return "I am a square";
    }
}