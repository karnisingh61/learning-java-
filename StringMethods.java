public class StringMethods{
    public static void main(String[] args) {

        //intialize string fist
        
        String name = "Karni Singh";
        String name2 = "Shekhawat";

        //lenghth [to find length of string ]
        System.out.println( name.length());

        //concatinate [to add string together]
        System.out.println(name + name2);                          
        System.out.println(name + "  and  " + name2);                         

        //charAt [to find character at specific position]
        System.out.println(name2.charAt(4));

        //replace [to replace characters]
        System.out.println(name2.replace('h','e'));

        //substring [to extract a substring from particular string]
        System.out.println(name.substring(0, 5));
        System.out.println(name2.substring(1, 7));
    }
}

