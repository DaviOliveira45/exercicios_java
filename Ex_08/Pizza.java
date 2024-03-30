package Ex_08;
import java.util.List;

public class Pizza {
    
    String nomeSabor;
    double precoSabor;
    String ingredientes;

    Pizza(String nomeSabor, double precoSabor,  String ingredientes){
        this.nomeSabor = nomeSabor;
        this.precoSabor = precoSabor;
        this.ingredientes = ingredientes;
    }

    String getNomeSabor(){
        return this.nomeSabor;
    }

    double getPrecoSabor(){
        return this.precoSabor;
    }

    String getIngredientes(){
        return this.ingredientes;
    }

    static void menuPizzas(List<Pizza> Pizzas){

        System.out.println("\n|             Sabor              |     Preço       |                        Ingredientes                                                           |");
        System.out.println();
        for (Pizza pizza : Pizzas) {
            String sabor = pizza.getNomeSabor();
            String preco = String.format("%.2f", pizza.getPrecoSabor());
            String descricao = pizza.getIngredientes();

            System.out.printf("| %-30s | %-15s | %-93s |\n", sabor, preco, descricao);
        }
    }
}
