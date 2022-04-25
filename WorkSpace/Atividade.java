import java.util.regex.*; 

public class Atividade {
    public static void main(String[] args) {
        // Σ = {a, b}
        
        //Começa com aa 
        String a = "[a]{2}[ab]*";
        System.out.println("===========");
        System.out.println("| Letra a |");
        System.out.println("|  " + Pattern.matches(a, "aa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(a, "aaabbb") + "   |");//true 
        System.out.println("|  " + Pattern.matches(a, "bb") + "  |");//false
        System.out.println("|  " + Pattern.matches(a, "abaa") + "  |");//false
        
        //Não Começa com aa
        String b = "[ab]?[b]*|b[a]*";
        System.out.println("===========");
        System.out.println("| Letra b |");
        System.out.println("|  " + Pattern.matches(b , "ba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(b, "abbbb") + "   |");//true 
        System.out.println("|  " + Pattern.matches(b, "aabb") + "  |");//false
        System.out.println("|  " + Pattern.matches(b, "aab") + "  |");//false

        //Terminam com bbb
        String c = "[ab]*[b]{3}";
        System.out.println("===========");
        System.out.println("| Letra c |");
        System.out.println("|  " + Pattern.matches(c, "aabbb") + "   |");//true 
        System.out.println("|  " + Pattern.matches(c, "bbbbb") + "   |");//true 
        System.out.println("|  " + Pattern.matches(c, "abb") + "  |");//false
        System.out.println("|  " + Pattern.matches(c, "aabb") + "  |");//false

        //Não terminam com bbb
        String d = "[ab]*a";
        System.out.println("===========");
        System.out.println("| Letra d |");
        System.out.println("|  " + Pattern.matches(d, "baaa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(d, "bbbbaaa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(d, "babbb") + "  |");//false
        System.out.println("|  " + Pattern.matches(d, "baaabbb") + "  |");//false

        //Contém a subcadeia aabbb  
        String e = "[ab]*[a]{2}[b]{3}[ab]*";
        System.out.println("===========");
        System.out.println("| Letra e |");
        System.out.println("|  " + Pattern.matches(e, "aabbb") + "   |"); //true 
        System.out.println("|  " + Pattern.matches(e, "aaabbbaaa") + "   |"); //true 
        System.out.println("|  " + Pattern.matches(e, "aaaba") + "  |"); //false
        System.out.println("|  " + Pattern.matches(e, "abba") + "  |"); //false

        //Possui comprimento maior ou igual a 3
        String f = "[ab]{3,}";
        System.out.println("===========");
        System.out.println("| Letra f |");
        System.out.println("|  " + Pattern.matches(f, "bba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(f, "baba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(f, "b") + "  |");//false
        System.out.println("|  " + Pattern.matches(f, "") + "  |");//false

        //Possui comprimento menor ou igual que 3
        String g = "[ab]{0,3}";
        System.out.println("===========");
        System.out.println("| Letra g |");
        System.out.println("|  " + Pattern.matches(g, "") + "   |");//true 
        System.out.println("|  " + Pattern.matches(g, "aba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(g, "abbab") + "  |");//false
        System.out.println("|  " + Pattern.matches(g, "aabaab") + "  |");//false

        //Possui comprimento diferente de 3
        String h = "[ab]{0,2}|[ab]{4,}";
        System.out.println("===========");
        System.out.println("| Letra h |");
        System.out.println("|  " + Pattern.matches(h, "aa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(h, "aabba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(h, "aab") + "  |");//false
        System.out.println("|  " + Pattern.matches(h, "baa") + "  |");//false

        //Possuem comprimento par
        String i = "([ab][ab])*";
        System.out.println("===========");
        System.out.println("| Letra i |");
        System.out.println("|  " + Pattern.matches(i, "aa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(i, "aaaa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(i, "a") + "  |");//false
        System.out.println("|  " + Pattern.matches(i, "aaa") + "  |");//false

        //Possuem comprimento impar
        String j = "[ab]([ab][ab])*";
        System.out.println("===========");
        System.out.println("| Letra j |");
        System.out.println("|  " + Pattern.matches(j, "b") + "   |");//true 
        System.out.println("|  " + Pattern.matches(j, "aba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(j, "baba") + "  |");//false
        System.out.println("|  " + Pattern.matches(j, "abbaab") + "  |");//false

        //Possuem comprimento múltiplo de 4
        String k = "([ab][ab][ab][ab])*";
        System.out.println("===========");
        System.out.println("| Letra k |");
        System.out.println("|  " + Pattern.matches(k, "") + "   |");//true 
        System.out.println("|  " + Pattern.matches(k, "baba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(k, "ba") + "  |");//false
        System.out.println("|  " + Pattern.matches(k, "baa") + "  |");//false

        //Possuem quantidade par de símbolos a
        String l = "(b*ab*ab*)*";
        System.out.println("===========");
        System.out.println("| Letra l |");
        System.out.println("|  " + Pattern.matches(l, "baa") + "   |");//true 
        System.out.println("|  " + Pattern.matches(l, "baaaba") + "   |");//true 
        System.out.println("|  " + Pattern.matches(l, "aaba") + "  |");//true 
        System.out.println("|  " + Pattern.matches(l, "abbbbbb") + "  |");//true 

        //Possuem quantidade impar de símbolos b
        String m = "[b](a*ba*ba*)*|(a*ba*ba*)*[b]";
        System.out.println("===========");
        System.out.println("| Letra m |");
        System.out.println("|  " + Pattern.matches(m, "abbb") + "   |");//true 
        System.out.println("|  " + Pattern.matches(m, "ababbabab") + "   |");//true 
        System.out.println("|  " + Pattern.matches(m, "bbababbb") + "  |");//false 
        System.out.println("|  " + Pattern.matches(m, "bbabb") + "  |");//false
        
    }    
}
