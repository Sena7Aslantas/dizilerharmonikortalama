import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5};
        double harmonik= 0;

        System.out.println("Harmonik hesaplama yapan program");

        System.out.println(Arrays.toString(numbers));


        double bolum=0;
        for(int i=0;i<numbers.length;i++){

            bolum=bolum+(1/numbers[i]);
            System.out.println("Bolum:"+bolum);


        }
        harmonik=numbers.length/bolum;
        System.out.print("Harmonik hesaplama sonucu:"+harmonik);

    }
}