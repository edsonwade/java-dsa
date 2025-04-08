package code.vanilson.builder;

/**
 * Test
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-04-02
 */

//private-protected o Acesso é só no mesmo package.
class Test {
    public int count = 0;

    public Test() {
        count++;
    }

    @Override
    public String toString() {
        return "Test{" +
                "count=" + count +
                '}';
    }
}