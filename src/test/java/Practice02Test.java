import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

public class Practice02Test {

    Practice02 object=new Practice02();

    // task: Practice02 classinin add, remove, removeAll methodlarini test ediniz.

    @Test
    public void testAdd(TestInfo info){
        object.add("Ali");
        assertTrue(object.devList.contains("Ali"));
        assertEquals(1,object.devList.size());
        System.out.println(info.getDisplayName()+" calisti");
    }

    @Test
    public void testRemove(TestInfo info){
        object.add("Ali");
        object.remove("Ali");
        assertFalse(object.devList.contains("Ali"));
        System.out.println(info.getDisplayName()+" calisti");
    }

    @Test
    public void testRemoveAll(TestInfo info){
        object.add("Ali");
        object.removeAll();
        assertTrue(object.devList.isEmpty());
        System.out.println(info.getDisplayName()+" calisti");
    }

}
