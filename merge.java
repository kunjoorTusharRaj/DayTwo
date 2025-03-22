public class merge{
    public static void main (String args[]){
        try{
            if(10/0==0){
                System.out.println("number is div by 0");
            }
        }
        catch(Exception e ){
            // adding the new catch block 
            System.out.println("error "+e);
        }
    }
}

