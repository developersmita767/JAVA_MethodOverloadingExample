public class TestMethodOverloading{
    void add(int a,int b){
        int r=a+b;
        System.out.println("Sum of a and b="+r);
    } 
    void add(int a,int b,int c){
        int r=a+b+c;
        System.out.println("Sum of a,b and c="+r);
    } 
    void add(long a,long b){
        long r=a+b;
        System.out.println("Sum of long a and b"+r);
    } 
    public static void main(String[] ar){
        TestMethodOverloading obj=new TestMethodOverloading();
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(100,2000);
    }
}