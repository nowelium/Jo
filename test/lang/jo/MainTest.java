package lang.jo;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    
    private static final String PATH_1 = "resource/StringTest1";
    
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testMain() {
        try {
            Main.main(PATH_1);
        } catch(Exception e){
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testMainSyntaxError(){
        try {
            Main.runMain("(");
            fail("ここに到達してはいけない");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
