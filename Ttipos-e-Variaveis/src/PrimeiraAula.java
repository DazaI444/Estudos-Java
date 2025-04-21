public class PrimeiraAula {

 public static void main(String[] args){

 String primeironome = "Victor" ;
 String segundonome = "Gabriel" ;

 String nomecompleto= nomecompleto(primeironome, segundonome);
 
 System.out.println(nomecompleto);
}
public static String nomecompleto (String primeironome, String segundonome){
return primeironome.concat(" ").concat(segundonome);
}

}