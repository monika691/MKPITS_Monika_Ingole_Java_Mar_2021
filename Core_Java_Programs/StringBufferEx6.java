/*4) StringBuffer delete() method
The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
 */
package com.mkpits.java.Stringbuffer;

class DeleteMethod {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.delete(1,3);
        System.out.println(sb);
    }
}
