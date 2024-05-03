package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {
        
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));  // 'equals' é preferência quando se quer comparar dois objetos pelo conteúdo deles
        System.out.println(c1 == c2);   // '==' compara as referências de memória, como c1 e c2 são objetos distintos, eles tem locais diferentes na memória, 
                                        //portanto são considerados diferentes neste caso
        
        System.out.println(s1 == s2);   // Neste caso o valor retornado é true, porque o compilador faz um tratamento especial para literais(não objetos instanciados)

    }
}
