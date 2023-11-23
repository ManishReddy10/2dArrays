public class App {
    public static void main(String[] args) throws Exception {
        
        int num[][] = new int[3][];
        
        char[][] alphabet = {
            {'a', 'b', 'c'}, 
            {'d', 'e'},
            {'f'}
        };

        System.out.println(alphabet.length);
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i].length; j++) {
                System.out.println(alphabet[i][j]);
            }
        }
        System.out.println("This is a change");


    }
}
