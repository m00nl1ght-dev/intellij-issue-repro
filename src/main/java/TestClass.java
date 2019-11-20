import java.util.List;

public class TestClass<T extends TheWeirdClass<? super T>> {

    List<T> theWeirdList;

}
