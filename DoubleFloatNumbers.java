
package floatNumbers;


import java.util.Scanner;

/**
 * @author valit
 * date     12.04.2022
 * @project Poligon
 */

public class DoubleFloatNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        double[] firstVector =  {Double.parseDouble(first.split(" ")[0]), Double.parseDouble(first.split(" ")[1])};
        String second = scanner.nextLine();
        double[] secondVector = {Double.parseDouble(second.split(" ")[0]), Double.parseDouble(second.split(" ")[1])};

        double v1 = Math.sqrt(Math.pow(firstVector[0], 2) + Math.pow(firstVector[1], 2));
        double v2 = Math.sqrt(Math.pow(secondVector[0], 2) + Math.pow(secondVector[1], 2));

        double multiplyVectors = firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1];

        double result = multiplyVectors / (v1 * v2);
        System.out.println(Math.floor(Math.toDegrees(Math.acos(result))));



    }
}
