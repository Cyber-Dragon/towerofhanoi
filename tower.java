import java.util.Scanner;
/**
 * Write a description of class tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tower {
 

  public static void solveTowers(int topN, char from, char inter, char to) {
    if (topN == 1){
      System.out.println("Disk 1 from " + from + " to " + to);
    }else {
      solveTowers(topN - 1, from, to, inter);
      System.out.println("Disk " + topN + " from " + from + " to " + to);
      solveTowers(topN - 1, inter, from, to);
    }
  }
  
   public static void main(String[] args) {
    tower towers = new tower();
    System.out.print("Enter number of discs: ");
    Scanner scanner = new Scanner(System.in);
    int nDisks = scanner.nextInt();
    solveTowers(nDisks, 'A', 'B', 'C');
  }
}