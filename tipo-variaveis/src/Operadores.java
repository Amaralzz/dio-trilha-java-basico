public class Operadores {
    public static void main(String[] args){
        boolean aceso= true;
        boolean desligado= false;

        if(aceso && desligado){
            System.out.println("Erro, não há essa possibilidade");
        }
        else{
            System.out.println("A luz está acesa!");
        }
    }
}
