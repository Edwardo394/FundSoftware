public class App {
    public static void main(String[] args) {
        Temperaturas temperaturas = new Temperaturas("poa_temps.txt");
        Consultas consultas = new Consultas(temperaturas);
        System.out.println(consultas.diaQueMaisChoveuNoAno(1980));
    }
}
