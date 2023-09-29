public class recurion7 {
    public static void towerOfHanoi( int n , String src , String helper, String dest){
        if( n == 1){
             System.out.println("Transfer disk" + n + "from" + src + " to "+ dest);
        }
        
        towerOfHanoi( n-1 , src, dest, helper);//n-1 disk fron src to helper
        System.out.println("Transfer disk" + n + "from" + src + " to "+ dest);//transfer first disks from source to destination
        towerOfHanoi( n-1 , helper , src , dest);//again transfer n-1 disks tfrom helper to destination
    }

    public static void main(String args[]){
        int n = 3;
        towerOfHanoi(n , "S" , "H", "D");
    }

    }

