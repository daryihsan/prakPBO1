/* Nama File    : Student.java
 * Deskripsi    : berisi method dalam class Student
 * Pembuat      : Dary Ihsan Amanullah
 * NIM          : 24060123130073
 * Tanggal      : 22 April 2025
 */

package latihan;

public class Student extends Person{
    public Student(String name){
        super(name);
    }

    @Override
    public boolean isAsleep(int hr){ /*override*/
        return 2 < hr && 8 > hr;
    }
}
