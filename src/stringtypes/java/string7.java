package stringtypes.java;

public class string7 {
    //G.Ashokkumar
//210303126116
//19 division
        //EqualsIgnoreCaseExample{

        public static void main(String args[]){
            String s1="ashok";
            String s2="ashok";
            String s3="ASHOK";
            String s4="Ashok";
            System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
            System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
            System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
        }
    }

