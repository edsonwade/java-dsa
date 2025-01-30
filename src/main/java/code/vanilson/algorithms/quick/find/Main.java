package code.vanilson.algorithms.quick.find;

/**
 * Main
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-01-30
 */
public class Main {

    public static void main(String[] args) {
        QuickFindUF quickFindUF = new QuickFindUF(1000_000_000);
        long start = System.currentTimeMillis();
        System.out.println(" 1 and 5 are not connected it should be false : " + quickFindUF.isConnected(1, 5));
        long end = System.currentTimeMillis();
        System.out.println("The time taken is : " + (end - start));

        quickFindUF.union(1, 1000_000); // connect 1 and 2 (1 array access) => 1, 2, 2, 3, 4, 5, 6, 7, 8, 9
        System.out.println(" 1 and 2 are connected ,it should be : " + quickFindUF.isConnected(1, 1000_000)); // 1 and 2 are
        // connected
        long start1 = System.currentTimeMillis();
        quickFindUF.union(1000_000, 2);
        long end2 = System.currentTimeMillis();
        System.out.println(" 1000_000 and 2 are connected ,it should be : " + quickFindUF.isConnected(1000_000, 2));
        System.out.println("The time taken is second time  : " + (end2 - start1));

//        // connect 2 and 5 (2 array accesses) => 1, 5, 5, 3, 4, 5, 6, 7, 8, 9
//        System.out.println(" 2 and 5 are connected ,it should be : " + quickFindUF.isConnected(2, 5)); // 2 and 5 are connected
//        quickFindUF.union(5, 6); // connect 5 and 6 (3 array accesses) => 1, 6, 6, 3, 4, 6, 6, 7, 8, 9
//        System.out.println(" 5 and 6 are connected ,it should be : " + quickFindUF.isConnected(5, 6)); // 5 and 6 are connected
//        quickFindUF.union(6, 7); // connect 6 and 7 (4 array accesses) => 1, 7, 7, 3, 4, 7, 7, 7, 8, 9
//        System.out.println(" 6 and 7 are connected ,it should be : " + quickFindUF.isConnected(6, 7)); // 6 and 7 are connected
//        quickFindUF.union(7, 8); // connect 7 and 8 (5 array accesses) => 1, 8, 8, 3, 4, 8, 8, 8, 8, 9
//        System.out.println(" 7 and 8 are connected ,it should be : " + quickFindUF.isConnected(7, 8)); // 7 and 8 are connected
//        quickFindUF.union(8, 9); // connect 8 and 9 (6 array accesses) => 1, 9, 9, 3, 4, 9, 9, 9, 9, 9
//        System.out.println(" 8 and 9 are connected ,it should be : " + quickFindUF.isConnected(8, 9)); // 8 and 9 are connected
//        System.out.println(" 1 and 5 are connected ,it should be : " + quickFindUF.isConnected(1, 5)); // 1 and 5 are connected

    }
}