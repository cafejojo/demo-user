package demo;

import com.google.common.base.Charsets;
import org.cafejojo.schaapi.test.library.LibraryClass;

import java.nio.charset.Charset;

public class UserClass {
    public int userFoo() {
    	LibraryClass l = new LibraryClass();
        int x = l.foo();
        double y = l.bar(x);

        if (y > 5) {
        	return 1;
        } else {
        	return 0;
        }
    }
}
