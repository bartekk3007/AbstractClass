public class Main
{
    public static void main(String[] args)
    {
        Shape[] shapeArray = new Shape[2];
        shapeArray[0] = new Disk(31.415);
        shapeArray[1] = new Square(49);
        for (Shape s : shapeArray)
        {
            System.out.println(s.getDescription());
        }
    }
}