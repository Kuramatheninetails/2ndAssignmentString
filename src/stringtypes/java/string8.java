package stringtypes.java;

public class string8 {
    //G.Ashokkumar
//210303126116
//19 division
        // FormatExample
        public static void main(String args[]){
            String name="Ashok";
            String sf1=String.format("name is %s",name);
            String sf2=String.format("value is %f",32.33490);
            String sf3=String.format("value is %32.12f",32.33490);//returns 12 char fractional part filling with 0

            System.out.println(sf1);
            System.out.println(sf2);
            System.out.println(sf3);
        }

}
