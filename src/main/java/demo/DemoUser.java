package demo;

import com.google.common.base.Charsets;
import org.cafejojo.schaapi.test.library.LibraryClass;

import java.nio.charset.Charset;

public class UserClass {
    public double userFoo() {
    	LibraryClass l = new LibraryClass();
        int x = l.foo();
        return l.bar(x);
    }
}
