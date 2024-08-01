public class Practical8sup {

        public static void main(String[] args) {
            String sampleString = "The quick brown fox jumps over the lazy dog.";
            String regex = "fox";
            String replacement = "cat";
    
            String resultString = sampleString.replaceAll(regex, replacement);
    
            System.out.println("Original String: " + sampleString);
            System.out.println("Modified String: " + resultString);
        }
}
    
