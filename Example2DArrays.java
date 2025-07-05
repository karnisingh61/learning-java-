public class Example2DArrays {
    public static void main(String[] args) {
        //2d with string
        String[][] names = {{ "karni","guddu","alice" }, {"hemant","abhay", "Ram"}, {"ankit","zometo","remo"}};
        System.out.println(names[0][0]);

        //2d array with int
        int[][] marks = {{98,99,97},{99,76,65}};
        System.out.println(marks[0][0]);
        System.err.println(marks[1][1]);
    }    
}
