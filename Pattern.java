
class Pattern
{

	
		  static void p(int n){
			int col=1;
		    for (int row=1;row<=n ;row++ ) {
		          while(col<=row){ 
					for (int c=1;c<=row;c++){
							/*if(col>row){
								break;
							}*/
		                   System.out.print(c);
						   col++;
		         }

		          //System.out.print(" " );
		          }
		     System.out.println( );
		        
		    }
		}
		public static void main(String[] args) {
		    p(4);
	}
}
