import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Principal programa = new Principal();
        programa.inici();

    }
    /* TDA llista*/
    final int CAPACITAT = 3;
    String[] cognoms = new String[CAPACITAT];
    int quantitat;
    String cognom;
    int pos = 0;
    Scanner sc = new Scanner(System.in);

    public void inici() {
    	/* Declaracio de variables */
        int opcio;
        boolean fi = false;
    	/*inici programa*/
        while (!fi) {

            System.out.println("Introdueix una opcio: ");
            opcio = sc.nextInt();

            switch (opcio) {

                case 1:
//                    Exercici 8 el primer
                    double km;
                    double ms;
                    System.out.println("Introdueix els km per a pasar a ms:");
                    km = sc.nextDouble();

                    ms = (km*1000)/3600;

                    System.out.println("El resultat en ms es :" + ms);

                    break;
//sds
                case 2:
//                    Exercici 9 el primer
                    System.out.println("Calculadora, selecciona l'operacio desitjada (+, -, *, /)");
                    char variable;
//                    variable = sc.nextChar();

//                    if(variable == '+'){
//
//                     }
//                    if (variable == '-') {
//
//
//                    }
//                    if (variable == '*'){
//
//                    }
//                    if (variable == '/'){
//
//                    }
//                    else{
//                        System.out.println("Ha introduit una operacio erronea");
//                    }


                    break;

                case 3:
//                    Exercici 8 el tercer
                    System.out.println("Introdueix el radi de la circumferencia:");
                    double radi;
                    double longitud;
                    double area;
                    radi =  sc.nextDouble();

                    longitud = 2 * Math.PI * radi;
                    area = Math.PI * (radi*radi);
                    System.out.println("La longitud es " + longitud + "i el area es " + area);


                    break;

                case 4:
//              Exercici 9 el tercer
                    System.out.println("Introdueix el teu pes");
                    double pes;
                    double altura;
                    double resultat;
                    pes = sc.nextDouble();
                    System.out.println("Introdueix la teva altura en (m)");
                    altura = sc.nextDouble();
                    resultat = pes / (altura*altura);

                    System.out.println("El IMS es " + resultat);
                    break;

                case 5:
//                Exercici 10 el primer
                    int x = 1;
                    int producte = 1;
                    for (int i = 0; i < 10 ; i++) {
                        producte =  producte * (x+2);
                    }
                    System.out.println(producte);
                    break;

                case 6:
//                Exercici 10 el tercer


                    break;

                case 7:

                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 10:

                    break;

                case 11:

                    break;
            }
        }
    }
}