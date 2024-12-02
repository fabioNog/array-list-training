import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("GO");

        for(String elemento : list){
            System.out.println(elemento);
        }
    }
}
