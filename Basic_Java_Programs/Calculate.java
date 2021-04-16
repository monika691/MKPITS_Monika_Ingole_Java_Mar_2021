/*1 -example of this to call method

 */
public class Calculate {
    void caltotal(int a,int b,int c)
    {
        int tot=a+b+c;
        System.out.println("total =" +tot);
        this.calaverage(tot);
    }
    void calaverage(int t)
    {
        float avg=(float) t/3;
        System.out.println("average = " +avg);
    }
}
class cal1{
    public static void main(String[] arg)
    {
        Calculate c1=new Calculate();
        c1.caltotal(1,2,3);

    }
}
