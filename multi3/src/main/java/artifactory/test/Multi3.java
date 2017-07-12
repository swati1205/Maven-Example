package artifactory.test;

/**
 * Hello world!
 */
public class Multi3 {
    public static void main(String[] args) {
        new Multi1();
        System.out.println("Hello World!");
    }
	
}
package test;

import org.junit.Test;

public class OtherTest extends Base {

    @Test public void mytest() {
        run();
    }

}