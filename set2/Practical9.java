public class Practical9 {
            public static void main(String[] args) {
            System.out.println(doubleChar("The"));        
            System.out.println(doubleChar("AAbb"));       
            System.out.println(doubleChar("Hi-There"));   
        }
    
        public static String doubleChar(String str) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                result.append(c).append(c);
            }
            return result.toString();
        }
        
}
