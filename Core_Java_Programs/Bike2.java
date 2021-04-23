/*final parameter?

If you declare any parameter as final, you cannot change the value of it.

 */

package com.mkpits.java.finalkeyword;
class Bike2 {
    int cube(final int n)
    {
        //n = n + 2; //can't be changed as n is final
        return n*n*n;
    }


    public static void main(String[] args) {
        Bike2 b = new Bike2();
        System.out.println(b.cube(5));

    }
}


