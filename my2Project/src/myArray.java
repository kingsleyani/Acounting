import java.util.Arrays;

public class myArray {
    public static void main(String[]args){
        int [] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        int [][] members = new int[2][3];
        members[0][0] = 1;
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(members));

    }
}
