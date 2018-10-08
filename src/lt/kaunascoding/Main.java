package lt.kaunascoding;

        import java.util.Scanner;

public class Main {
    // sukurti nauja branch kuriame butu igyvendinamas metodas ivesto skaiciaus kelimui kvadratu
    // panauditi feature branch sukurti pull request, ir atlikti merge
    public static void main(String[] args) {
        // write your code here
        System.out.println("labas iveskite skaiciu");
        Scanner sc= new Scanner(System.in);
        double ivestasSkaicius = sc.nextInt();
        System.out.println("Ivestas skaicius : " + ivestasSkaicius);
        kvardratokelimas (ivestasSkaicius);
    }
    public static void kvardratokelimas (double ivestasSkaicius){
        System.out.println("Skaiciaus kvadratas:" + (ivestasSkaicius*ivestasSkaicius));
    }
}
