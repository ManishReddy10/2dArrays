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

        boolean boolArray[][] = new boolean[1][];  

        int i = 0;
        int j = 0;
        while (i <10) {
            i++;
            System.out.println(i);
            j++;
            System.out.println(j);
        }
    }
}
