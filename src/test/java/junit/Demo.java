package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {

    @Test
    public void test1(){
        System.out.println("This is test 1 ");
    }

    public boolean catDog(String str) {
//        if (str.contains("cat") && str.contains("dog")){
//            return true;
//        }
//        else{
//            return false;
//        }
        int countCat = 0;
        while (str.contains("cat")){
            str = str.replace("cat","");
            countCat ++;
        }
        int countDog = 0;
        while (str.contains("dog")){
            str = str.replace("dog","");
            countDog ++;
        }
        if (countCat != 0 && countDog != 0) {
            if (countCat == countDog) {
                return true;
            } else {
                return false;
            }

        }
        else{
            return false;
        }
   }

    @Test
    public void test2(){
        String str1 = "catdog";
        boolean expectedvalue1 = true;
        String str2 = "catcat";
        boolean expectedvalue2 = false;
        String str3 = "1cat1catdogdog";
        boolean expectedvalue3 = true;
        Assertions.assertEquals(expectedvalue1,catDog(str1));
        Assertions.assertEquals(expectedvalue2,catDog(str2));
        Assertions.assertEquals(expectedvalue3,catDog(str3));
    }
}
