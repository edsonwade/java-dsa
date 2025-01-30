package code.vanilson.algorithms.quick.find;

/**
 * QuickFindUF
 *
 * @author vamuhong
 * @version 1.0
 * @since 2025-01-30
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        // set id of each object to itself (N array accesses)
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // check whether p and q are in the same component (2 array accesses)
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        // change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

}