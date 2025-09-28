public class Main {
    public static boolean verificarBalanceo(String expresion) {
        Pila<Character> pila = new Pila<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) return false;
                char tope = pila.pop();

                if ((c == ')' && tope != '(') ||
                    (c == ']' && tope != '[') ||
                    (c == '}' && tope != '{')) {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    public static void main(String[] args) {
        String expresion1 = "((2+3)*[5-1])";
        String expresion2 = "((2+3]*5)";

        System.out.println(expresion1 + " -> " + verificarBalanceo(expresion1));
        System.out.println(expresion2 + " -> " + verificarBalanceo(expresion2));
    }
}
