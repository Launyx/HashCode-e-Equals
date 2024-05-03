public class App {
    public static void main(String[] args) throws Exception {

        String a = "Maria";
        String b = "Alex";

        //System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        // Pelo fato do hashcode gerar um número inteiro, que por sua vez tem um limite de 32 bits, pode haver colisões em que
        // Dois objetos diferentes geram o mesmo hashcode
        // Esse acontecimento é muito raro, mas pode acontecer
    }
}
