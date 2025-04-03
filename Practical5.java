public class practical5{
        public static void main(String[] args) {
          int m = 30;
         int x;
         int y;
         for( x=1;x<=m; x++){
             for( y= 2 ; y<= x ; y++){
                 if(x%y ==0){
                     break;
                     }
             }if(x ==y){
                 System.out.println(y);  
             }
         }
         }
     }
    
