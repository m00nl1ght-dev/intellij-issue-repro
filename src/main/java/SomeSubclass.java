import java.util.List;

public class SomeSubclass<T extends TheWeirdClass<? super T>> extends TestClass<T> {

    TestClass<? super T> parent;

    void someMethod() {
        List<T> theWeirdListFromSelf = this.theWeirdList; // so this is fine
        List<? super T> theWeirdListFromParent = parent.theWeirdList; // but this breaks it
        // ^^ changing the type here from explicit to "var" can also more reliably cause the issue
        // sometimes closing and re-opening the file also helps

        // some code here (does not affect the problem)
        System.out.println(theWeirdListFromSelf.toString());
        System.out.println(theWeirdListFromParent.toString());
    }

}
