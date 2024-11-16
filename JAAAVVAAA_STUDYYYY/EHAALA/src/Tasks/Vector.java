package Tasks;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength(){
        double length = Math.sqrt(x*x + y*y + z*z);

        return length;
    }

    public double ScalarProduct(Vector v){
        double scProd = v.x * x + v.y * y + v.z * z;

        return scProd;
    }

    public Vector CrossProduct(Vector v){
        return new Vector(
                y * v.z - z * v.y,
                z * v.x - x * v.z,
                x * v.y - y * v.x);
    }

    public double CornerVectors(Vector v){
        double corner = ScalarProduct(v) / Math.abs(getLength()) * Math.abs(v.getLength());

        return corner;
    }

    public double[] SumVectors(Vector v){
        double[] arr = new double[3];

        arr[0] = x + v.x;
        arr[1] = y + v.y;
        arr[2] = z - v.z;

        return arr;
    }

    public double[] razVectors(Vector v){
        double[] arr = new double[3];

        arr[0] = x - v.x;
        arr[1] = y - v.y;
        arr[2] = z - v.z;

        return arr;
    }

    public static Vector[] randomVectors(int n){
        Vector[] arr = new Vector[n];

        for(int i = 0; i < n; i++) {
            arr[i] = new Vector(
                    (double) Math.random() * 100 + 1,
                    (double) Math.random() * 100 + 1,
                    (double) Math.random() * 100 + 1);
        };

        return arr;
    }

    public static void main(String[] args){
        Vector v1 = new Vector(1 ,2, 3);
        Vector v2 = new Vector(4, 5, 6);

        double len1 = v1.getLength();
        double len2 = v2.getLength();

        if(len1 > len2){
            System.out.println("Первый вектор больше ,чем второй");
        }else{
            System.out.println("Второй вектор больше, чем первый");
        }
    }
}
