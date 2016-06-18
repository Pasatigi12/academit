/**
 * Created by PC on 11.06.2016.
 */
public class Vector {
    private double[] coordinates;

    public Vector(double[] coordinates) {
        this.coordinates = new double[coordinates.length];
        System.arraycopy(coordinates, 0, this.coordinates, 0, coordinates.length);
    }


    public Vector(int n) {
        if (n > 0) {
            coordinates = new double[n];
        } else throw new IllegalArgumentException("неверная размерность вектора");
    }

    public Vector(Vector other) {
        this.coordinates = new double[other.coordinates.length];
        System.arraycopy(other.coordinates, 0, coordinates, 0, coordinates.length);

    }

    public int getSize() {
        return coordinates.length;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (double coordinate : coordinates) {
            builder.append(coordinate).append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        builder.append("}");
        return builder.toString();
    }

    public Vector extendVector(Vector vector){
        if (coordinates.length > vector.coordinates.length){
            double[] extendedVector = new double[coordinates.length];
            System.arraycopy(vector.coordinates, 0, extendedVector, 0, vector.coordinates.length);
            return new Vector(extendedVector);
        } else {
            double[] extendedVector = new double[vector.coordinates.length];
            System.arraycopy(coordinates, 0, extendedVector, 0, coordinates.length);
            return new Vector(extendedVector);
        }
    }

    public Vector vectorSum(Vector vector){
        if (coordinates.length != vector.coordinates.length){
            if(coordinates.length > vector.coordinates.length){
                double[] a = new double[coordinates.length];
                for (int i = 0; i < coordinates.length; ++i){
                    a[i] = coordinates[i] + vector.extendVector(this).coordinates[i];
                }
                return new Vector(a);
            } else {
                double[] a = new double[vector.coordinates.length];
                for (int i =0; i < vector.coordinates.length; ++i){
                    a[i] = vector.coordinates[i] + this.extendVector(vector).coordinates[i];
                }
                return new Vector(a);
            }
        } else {
            double[] a = new double[coordinates.length];
            for (int i = 0; i < coordinates.length; ++i){
                a[i] = coordinates[i] + vector.coordinates[i];
            }
            return new Vector(a);
        }
    }




}







