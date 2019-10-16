public class Day1 {

        // problem 1
        public static String toAlternativeString(String string) {
            String _newstring=new String();
            int nbr;
            for (char ch: string.toCharArray()) {
                nbr='a'-'A';
                if ( ch>= 'a' && ch<= 'z'){
                    _newstring+=(char)(ch-nbr);
                }
                else if ( ch>= 'A' && ch<= 'Z'){
                    _newstring+=(char)(ch+nbr);
                }
                else {
                    _newstring+=ch;
                }
            }

            return  _newstring;
        }

        public static void main(String[] args) {
            System.out.println(toAlternativeString("AhdjknAdns,RER"));
        }
}
