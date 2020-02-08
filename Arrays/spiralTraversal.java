import java.util.Scanner;
public class spiralTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int [r][c];
		for(int i = 0 ; i < r ; i++) {
			for(int j = 0 ; j < c; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		printSpiral(arr,r,c);
	}
	
	  static void printSpiral(int a[][], int r, int c)
	  {
		int rmin = 0;
	    int rmax = r-1;
	    int cmin = 0;
	    int cmax = c-1;
	    
	    int count = 0;
	    while(count < r*c){
	      //1ST TRAVERSAL - RIGHT
	        for(int j = cmin; j <= cmax; j++){
	          System.out.println(a[rmin][j]);
	          count++;
	        }
	       
	      
	      rmin++;
	      if(rmin > rmax){
	        break;
	      }
	      //2ND TRAVERSAL -DOWN
	      for(int i = rmin ; i <= rmax; i++){
	        System.out.println(a[i][cmax]);
	        count++;
	      }
	      cmax--;
	      if(cmax < cmin){
	        break;
	      }
	      //3RD TRAVERSAL - LEFT
	      for(int j = cmax ; j>= cmin; j--){
	        System.out.println(a[rmax][j]);
	        count++;
	      }
	      rmax--;
	       if(rmax < rmin){
	        break;
	      }
	      //4TH TRAVERSAL - UP
	      for(int i = rmax ; i >= rmin; i--){
	        System.out.println(a[i][cmin]);
	        count++;
	      }
	      cmin++;
	      if(cmin > cmax){
	        break;
	      }
	    }
	    
	  }
	}