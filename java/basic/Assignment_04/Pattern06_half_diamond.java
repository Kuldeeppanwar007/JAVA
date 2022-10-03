package Assignment_04;

//import java.nio.file.FileSystemAlreadyExistsException;

public class Pattern06_half_diamond {
  public static void main(String[] args) {
    int i, j,x =1;
    for (i = 1; i <= 9; i++) {
      if (i % 2 == 0) x = 0; else x = 1;
      for (j = 1; j <= i; j++) {
          if (j % 2 == x) System.out.print("  *"); else System.out.print("   ");
      }
      System.out.println();
    }
    for (i = 8; i >=1; i--) {
      if (i % 2 == 0) x = 0; else x = 1;
      for (j = 1; j <= i; j++) {
          if (j % 2 == x) System.out.print("  *"); else System.out.print("   ");
      }
      System.out.println();
    }

    
  }
}