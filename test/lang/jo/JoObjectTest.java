package lang.jo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class JoObjectTest {

    @Test
    public void testParentCall(){
        JoString string = new JoString("hoge");
        {
            JoMessage mesg = JoMessage.create("println", null);
            assertNotNull(string.call(JoCall.create(mesg)));
        }
        {
            JoMessage mesg = JoMessage.create("print", null);
            string.call(JoCall.create(mesg));
            string.call(JoCall.create(mesg));
        }
        {
            JoMessage mesg = JoMessage.create("clone", JoArguments.create(string));
            JoObject object = string.call(JoCall.create(mesg));
            
            JoMessage mesg2 = JoMessage.create("println", null);
            object.call(JoCall.create(mesg2));
        }
    }

}
