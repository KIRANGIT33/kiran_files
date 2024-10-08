public class App {
    public static void main(final String[] args) {
          // Declear variable
          int number = 0 ;
          // print table headers
          System.out.println("| number | number > 0 | number < 10 | number > 0 && number < 10 | !( number > 0 && number < 10) | number > 0 || number < 10 |");
          // print table rows
          for (int i = -1; i <=10; i ++) { 
            number = i ;
            System.out.println("|" + number + "|" + (number>0) + "|" + (number<10) + "|" + (number>0 && number<10) + "|" + !(number>0 && number<10) +"|" + (number>0 || number<10)+"|");
            

          }








    }
    
}
