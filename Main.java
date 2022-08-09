 class Main
{
	
		  static void p(int n){
		    for (int row=1;row<=n ;row++ ) {
		          for (int col=1;col<=row;col++){ 
                        
						//for (int c=1;c<=row;c++){
		              System.out.print(col);
		          
		          System.out.print(" " );
		          }
		     System.out.println( );
		        
		    }
		}
		public static void main(String[] args) {
		    p(4);
	}
}
