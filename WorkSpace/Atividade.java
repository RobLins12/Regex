import java.util.regex.*; 

public class Atividade {
    public static void main(String[] args) {
        // Σ = {a, b}
        //Começa com aa 
        String a = "[a]{2}[ab]*";
        System.out.println("Letra a");
        System.out.println(Pattern.matches(a, "aa"));
        System.out.println(Pattern.matches(a, "aabb"));
        System.out.println(Pattern.matches(a, "bb"));
        System.out.println(Pattern.matches(a, "aaabbb"));
        System.out.println(Pattern.matches(a, "aaa"));

        //Não Começa com aa
        String b = "[ab]?[b]*";
        System.out.println("Letra b");
        System.out.println(Pattern.matches(b , "ba"));
        System.out.println(Pattern.matches(b, "aabb"));

        //Terminam com bbb
        String c = "[ab]*[b]{3}";
        System.out.println("Letra c");
        System.out.println(Pattern.matches(c, "aabbb"));

        //Não terminam com bbb
        String d = "[ab]*a";
        System.out.println("Letra d");
        System.out.println(Pattern.matches(d, "baaa"));
        System.out.println(Pattern.matches(d, "aabbb"));

        //Contém a subcadeia aabbb  
        String e = "[ab]*[a]{2}[b]{3}[ab]*";
        System.out.println("Letra e");
        System.out.println(Pattern.matches(e, "aaabbba")); 

        //Possui comprimento maior ou igual a 3
        String f = "[ab]{3,}";
        System.out.println("Letra f");
        System.out.println(Pattern.matches(f, "bb"));
        System.out.println(Pattern.matches(f, "aababa"));

        //Possui comprimento menor igual que 3
        String g = "[ab]{0,4}";
        System.out.println("Letra g");
        System.out.println(Pattern.matches(g, ""));

        //Possui comprimento diferente de 3
        String h = "[ab]^{3}";
        System.out.println("Letra h");
        System.out.println(Pattern.matches(h, "aa"));
        System.out.println(Pattern.matches(h, "aaaa"));
        System.out.println(Pattern.matches(h, "aaa"));
    }
}
