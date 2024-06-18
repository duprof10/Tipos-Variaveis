public class Usuario {
    
    public static void main(String[] args) throws Exception{
      SmartTv smartTv = new SmartTv();
      System.out.println("TV ligada " + smartTv.ligada); 
      System.out.println("canal atual " + smartTv.canal);
      System.out.println("volume atual " + smartTv.volume); 

      smartTv.ligar ();
      System.out.println("novo status TV ligada = " + smartTv.ligada); 
      smartTv.desligar();
      System.out.println("novo status TV ligada = " + smartTv.ligada);
      smartTv.aumentarVolume();
      System.out.println("o volume aumentou = " + smartTv.volume);
      smartTv.diminuirVolume();
      System.out.println("o volume diminuiu = " + smartTv.volume);
    }
}
