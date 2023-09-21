

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;
        import java.lang.reflect.Array;
        import java.util.*;
        import  java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisaisse le text");
        String textUtilisateur = scanner.nextLine();
        String nomFichier = ("C:\\Users\\e2304901\\IdeaProjects\\wassim\\src\\wassim.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            StringBuilder txtFichier = new StringBuilder();
            while ((ligne = br.readLine()) != null) {
                txtFichier.append(ligne);
                String txtFichierstr = txtFichier.toString();
                int differences = 0;
                Set<Character> lettresDif = new HashSet<>();
                Map <Character, Integer> erreurParLettre = new HashMap<>();
                for (int i = 0; i < textUtilisateur.length() && i < txtFichierstr.length(); i++) {
                    if (textUtilisateur.charAt(i) != txtFichierstr.charAt(i)) {

                        differences++;
                        lettresDif.add(textUtilisateur.charAt(i));

                        char lettreErreur = textUtilisateur.charAt(i);
                        erreurParLettre.put(lettreErreur, erreurParLettre.getOrDefault(lettreErreur,0)+1);
                    }
                }
               
                

                System.out.println("nbr des lettre dif est " + differences);
                System.out.println("les lettre dif sont  " + lettresDif);

                for (Map.Entry<Character,Integer> entry: erreurParLettre.entrySet()) {
                    System.out.println(" letrtre "+ entry.getKey()+" nombre erreur "+ entry.getValue());

                }
                scanner.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        import java.io.BufferedReader;
                import java.io.FileReader;
                import java.io.IOException;
                import java.util.*;

public class Main {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        String nomFichier = ("C:\\Users\\e2304901\\IdeaProjects\\wassim\\src\\wassim.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            StringBuilder txtFichier = new StringBuilder();

            while ((ligne = br.readLine()) != null) {
                txtFichier.append(ligne);
                String txtFichierstr = txtFichier.toString();
                System.out.println("Le texte a ecrit est  : "+ligne);
                System.out.println("Saisaisse le texte");
                String textUtilisateur = scanner.nextLine();
                int differences = 0;
                Set<Character> lettresDif = new HashSet<>();
                Map <Character, Integer> erreurParLettre = new HashMap<>();
                for (int i = 0; i < textUtilisateur.length() && i < txtFichierstr.length(); i++) {
                    if (textUtilisateur.charAt(i) != txtFichierstr.charAt(i)) {

                        differences++;
                        lettresDif.add(textUtilisateur.charAt(i));

                        char lettreErreur = textUtilisateur.charAt(i);
                        erreurParLettre.put(lettreErreur, erreurParLettre.getOrDefault(lettreErreur,0)+1);
                    }
                }
                System.out.println("nbr des lettre dif est " + differences);
                System.out.println("les lettre dif sont  " + lettresDif);

                for (Map.Entry<Character,Integer> entry: erreurParLettre.entrySet()) {
                    System.out.println(" la lettre "+ entry.getKey()+" nombre erreur :"+ entry.getValue());
                }
                scanner.close();
                long fin = System.currentTimeMillis();
                long duree =fin-debut;
                System.out.println("le code mis "+ duree/1000+"second");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}