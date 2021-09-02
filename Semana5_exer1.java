public class Semana5_exer1{
    public static void main(String args []){
        //fazer fatorial, testar 20; 30; 40; ...
        long fatorial=1;
        for(long fat=30; fat>=1; fat--){
            fatorial= fat * fatorial;
        }
        System.out.println(fatorial);
    }
}