import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Practice01Test {

    public static Practice01 object;

//    @BeforeEach
//    public void beforeEach(){
//        object=new Practice01();
//        System.out.println("beforeEach calisti");
//    }
//
//    @AfterEach
//    public void afterEach(){
//        object=null;
//        System.out.println("afterEach calisti");
//    }

    // task: Practice01 classinin hypotenuse methodunu pozitif senaryo ile test ediniz. 5, 12 -> 13
    @Test
    public void testHypotenuse(){
        double act= object.hypotenuse(5,12);
        double exp=13;
        assertEquals(exp,act);
    }

    // task: Practice01 classinin hypotenuse methodunu pozitif senaryo ile test ediniz.
    @Test
    public void testHypotenuse2(){
        double act=object.hypotenuse(5,12);
        double notExp=17;
        assertNotEquals(notExp,act);
    }

    // task: Testin ismini degistiriniz.
    @Test
    @DisplayName("hypotenuse methodunun testi")
    public void testHypotenuse3(){
        double act= object.hypotenuse(5,12);
        double exp=13;
        assertEquals(exp,act);
    }

    // task: Tum testlerde kullanmak uzere Practice01 classindan obje olusturup, kullanimi bitince null a set ediniz.
    @BeforeAll
    public static void beforeAll(){
        object=new Practice01();
        System.out.println("beforeAll calisti.");
    }

    @AfterAll
    public static void afterAll(){
        object=null;
        System.out.println("afterAll calisti.");
    }

    // Practice01 classinin isPalindrom methodunu pozitif senaryo ile test ediniz.
    @Test
    public void testIsPalindrom(TestInfo info){
        assertTrue(object.isPalindrom("ana"));
        System.out.println(info.getDisplayName()+" calisti");
    }

    // Practice01 classinin isPalindrom methodunu negatif senaryo ile test ediniz.
    @Test
    public void testisPalindrom2(TestInfo info){
        assertFalse(object.isPalindrom("palindrom"));
        System.out.println(info.getDisplayName()+" calisti");
    }

    // task: Practice01 classinin factorial methodunu 0,1,3 parametereli icin test ediniz.
    @Test
    public void testFactorial(TestInfo info){
        assertEquals(1,object.factorial(0));
        assertEquals(1,object.factorial(1));
        assertEquals(6,object.factorial(3));
        System.out.println(info.getDisplayName()+" calisti");
    }

    @ParameterizedTest
    @CsvSource(value = {"1,0","1,1","6,3"})
    public void testFactorial2(int sayi1,int sayi2){
        assertEquals(sayi1,object.factorial(sayi2));
    }



}
