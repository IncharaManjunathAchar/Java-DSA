public class typecasting {
    public static void main(String[] args) {
        byte a= 10;
        byte b= 30;
        // byte c= a*b; //error: incompatible types: possible lossy conversion from int to byte, byte c= a*b;
        int c=a*b;
        System.out.println(c); 
    }
}
