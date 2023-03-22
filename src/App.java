public class App {
    public static void main(String[] args) throws Exception {
        String[] array1 = new String[]{"morango", "uva", "acerola"};
        String[] array2 = new String[]{"morango", "laranja", "acerola"};
        String[] array3 = new String[]{"cozinheiro", "jogador", "laranja"};

        System.out.println("comparar array1 com array2");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }

        System.out.println("comparar array1 com array3");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (array1[i] == array3[j]) {
                    System.out.println(array1[i]);
                }
            }
        }

        System.out.println("comparar array2 com array3");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (array2[i] == array3[j]) {
                    System.out.println(array2[i]);
                }
            }
        }
    }
}
