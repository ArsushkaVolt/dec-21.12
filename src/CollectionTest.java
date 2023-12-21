import java.util.ArrayList;
import java.util.Objects;

public class CollectionTest extends TestTool{
    public void testAddElement(){
        ArrayList<Object> list = new ArrayList<>();
        Integer first = 11;
        Integer second = 22;
        list.add(first);
        list.add(second);

        list.add(1,67);

        this.printResult(isEquals(first, list.get(0)));
        this.printResult(isEquals(second, list.get(2)));
        this.printResult(isEquals(second, list.get(1)));
    }
}
