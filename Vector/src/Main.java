/**
 * Created by PC on 11.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        Vector vector2 = new Vector(5);
        Vector vector3 = new Vector(vector2);
        Vector vector1 = new Vector(new double[]{1, 3.4, -2.1, 5.7});
        Vector vector4 = new Vector(new double[]{0.3, -6, 14, -9, 5.2, 31});

        System.out.println(vector2.getSize());
        System.out.println(vector1.toString());
        System.out.println(vector2.extendVector(vector1).toString());
        System.out.println(vector1.vectorSum(vector4).toString());



    }
}
