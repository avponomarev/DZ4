import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(reader.readLine());
        double y = Double.parseDouble(reader.readLine());
        double z = Double.parseDouble(reader.readLine());

        double average = (x + y + z) / 3;

        System.out.println(average);

        if ((int)average/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }

        reader.close();
    }
}