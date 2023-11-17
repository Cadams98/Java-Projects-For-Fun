public class App {
    public static void main(String[] args) throws Exception {
        
        int sum = 0;
        int item = 0;
        do {
            item++;
            if (sum &gt;= 4)
              continue;
            sum += item;
            
        } 
        while (item &lt; 5);   
    }
}
