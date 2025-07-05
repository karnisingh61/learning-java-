
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[2]);


        // length function in arays .....

        System.out.println(marks.length);

        //sort function in arrays.....
       Arrays.sort(marks);
       System.out.println(marks[0]);
    }
}
