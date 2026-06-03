public class Binary_Number_Triangle_Pattern {
    public static void main(String[] args) {
        int n =5;
        int s;
        for(int i =0; i<n;i++){
           if (i % 2 == 0) s = 1;
            else s= 0;
            for (int j=0;j<=i;j++ ){
                System.out.print(s);
                s=1-s;
            }
            System.out.println(" ");

        }
    }
    
}
