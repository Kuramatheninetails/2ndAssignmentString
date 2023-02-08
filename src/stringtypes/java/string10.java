package stringtypes.java;

public class string10 {
    //G.Ashokkumar
//210303126116
//19 division
        //StringGetCharsExample
        public static void main(String args[]){
            String str = new String("Hey Ashokkumar how are your?");
            char[] ch = new char[10];
            try{
                str.getChars(4, 14, ch, 0);
                System.out.println(ch);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
    }

