import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(reader.readLine());

            int count = 0;
            while (input >= 5) {
                if (input % 5 == 0) {
                    count += input/5;
                    input /= 5;
                } else {
                    input--;
                }
            }

            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
