import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("aaa", "Gerente "));
        lista.add(new Funcionario("bbb", "Caixa   "));
        lista.add(new Funcionario("ccc", "Caixa   "));
        lista.add(new Funcionario("ddd", "Caixa   "));
        lista.add(new Funcionario("eee", "Vendedor"));
        lista.add(new Funcionario("fff", "Vendedor"));
        lista.add(new Funcionario("ggg", "Vendedor"));
        lista.add(new Funcionario("hhh", "Vendedor"));
        lista.add(new Funcionario("iii", "Vendedor"));
        lista.add(new Funcionario("jjj", "Vendedor"));
        lista.add(new Funcionario("kkk", "Vendedor"));

        Map<String, Integer> result = new HashMap<>(); //pode usar TreeMap aqui, ou HashMap, pois Map é uma interface

        Map<String, ArrayList<String> > result2 = new HashMap<>();

        for (Funcionario f: lista){
            String cargo = f.getCargo();
            if (!result.containsKey(cargo)){
                result.put(f.getCargo(), 1);
            } else {
                int ateAgora = result.get(cargo);
                result.put(cargo, ateAgora+1);
            }
        }


        for (Funcionario f: lista) {
            String cargo = f.getCargo();

            if (!result2.containsKey(cargo)) {
                result2.put(cargo, new ArrayList<String>());
            }

            List<String> aux = result2.get(cargo);
            aux.add(f.getNome());

        }




        for (String key : result2.keySet()){
            System.out.printf(" Cargo: %s, Número de funcionários: %s\n", key, result2.get(key));
        }

    }

}
