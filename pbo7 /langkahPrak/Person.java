/* Nama File    : Person.java
 * Deskripsi    : berisi method dalam class Person
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package latihan;

public class Person {
    private String name;

    public Person(String name){
        this.name = name; 
    }
    public boolean isAsleep(int hr){
        return 22 < hr || 7 > hr; 
    }
    public String toString(){
        return name; 
    }

    public void status(int hr){
        if(this.isAsleep(hr)){
            System.out.println("Now offline : " + this);
        }
        else{
            System.out.println("Now online : " + this);
        }
    }
}
