package code.vanilson.big_o_notation;

public class Main {

    public static void main(String[] args) {
        printItems(10);
        printItems1(10);
        dropNonDominants(10);
    }

    /**
     * 0(N) complexity time - linea
     *
     * @param n numbers
     */
    public static void printItems(int n) {
        //call this 0(N) complexity time - linear.
        // where n is the number of interactions (n-1).
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // will still have 0(N) complexity time - linear
        // we apply the rule dropping the constant
        // the operation now it would look like this (n(i) + n(j))=2n, that would make think
        // that now the operation is O(2N), but no. we have to drop the constant here. doesn't matter with are the
        // value .drop always the constant.
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    /**
     * 0(N^2) complexity time - Quadratic.
     *
     * @param n number
     */
    public static void printItems1(int n) {
        //call this 0(N^2) complexity time - Quadratic.
        // where n is the number of interactions(n * n)= n^2.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    /**
     * O(N^2) + 0(N) -> we drop the non dominants. In this case, 0(N)
     * final we be O(N^2) - quadratic complexity time
     *
     * @param n numbers
     */
    public static void dropNonDominants(int n) {
        //call this 0(N^2) complexity time - Quadratic.
        // where n is the number of interactions(n * n)= n^2.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);

            }
        }
        // O(N) complexity time -Linear.
        for (int k = 0; k < n; k++) {
            System.out.println(k);

        }

    }

    /**
     * O(1) -> constant complexity time.
     *
     * @param n number 1
     * @param m number
     * @return the final result of the addition n and m.
     */
    public int addTwoNumbers(int n, int m) {
        //O(1) -> Constant complexity . there are no operations even if we add number to the addition
        // the complexity still will be constant
        return Integer.sum(n, m);
    }

}