import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Massivin element sayini daxil edin, sonra hemin sayda elementlerin qiymetlerini daxil edin.
        Alternativ olaraq random ile generasiya etmek olar.
        Istifadeciden x ededi sorusun, sonra ise massivde hemin x ededini axtarin,
        eger varsa, tapdiginiz ilk x ededini massivden silin.
        Silinme o demekdir ki, sagdaki butun elementler 1 defe sola surusmelidir.
         */
        System.out.println("Zehmet olmasa array-in uzunlugunu  daxil edin...");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Zehmet olmasa ededleri daxil edin...");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//        System.out.println("Zehmet olmazsa silmek istediyiniz ededi daxil edin...");

        System.out.println("Ilkin versiya array: " + Arrays.toString(array));
//        int axtarilan = sc.nextInt();
//        System.out.println("Eded silinir....");
//        for (int i = 0; i < array.length; i++) { [2,5,4,7,8,42]
//            if (array[i] == axtarilan) {
//                if (i != (array.length - 1)) {
//                    for (int j = i; j < array.length; j++) {
//                        if (j != (array.length - 1)) {
//                            array[j] = array[j + 1];
//                        }
//                    }
//                    array[array.length - 1] = 0;
//                } else {
//                    array[i] = 0;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            int min=array[i];
//            if (i == array.length -1 ){
//                break;
//            }
//        for (int j = i+1; j < array.length; j++) {
//
//                if (array[i]>array[j]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//
//
//        }

        Arrays.sort(array);

                System.out.println("Siral sonra array: " + Arrays.toString(array));
    }
}