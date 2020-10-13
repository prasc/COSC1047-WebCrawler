import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String URLString = "http://liveexample.pearsonmg.com/data/Scores.txt";
        int count = 0;
        ArrayList<Integer> arrayListOfValues = new ArrayList<Integer>();

        try {
            java.net.URL url = new java.net.URL(URLString);
            Scanner input = new Scanner(url.openStream());

            while(input.hasNext()) {
                arrayListOfValues.add(input.nextInt());
            }
        }
        catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        }

        catch (java.io.IOException ex) {
            System.out.println("ID Errors: no such file");
        }

        int sum = 0;
        for (Integer num : arrayListOfValues) {
            sum += num;
        }

        System.out.println("The total value was: " + sum);
        System.out.println("The average was: " + sum/arrayListOfValues.size());
    }


}
