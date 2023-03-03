public class Application{
    public static void main(String[] args) {
        CastingPrimitive number = new CastingPrimitive();
        int castnumber = number.castToInt(13.6);

        System.out.println("typecasted number:" + castnumber);
        
    }
}