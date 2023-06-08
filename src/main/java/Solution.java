public class Solution {
    private Solution() {

    }

    public static int run(int index1, int index2) {
        int rootIndex = 1;
        return calcCommonAncestor(rootIndex, index1, index2);
    }

    private static int calcCommonAncestor(int rootIndex, int index1, int index2) {
        if (rootIndex == index1 || rootIndex == index2) {
            return rootIndex;
        }

        int leftChildIndex = rootIndex * 2;
        int rightChildIndex = rootIndex * 2 + 1;

        boolean leftChildExists = leftChildIndex <= Math.max(index1, index2);
        boolean rightChildExists = rightChildIndex <= Math.max(index1, index2);

        if (leftChildExists && rightChildExists) {
            int leftCommonAncestor = calcCommonAncestor(leftChildIndex, index1, index2);
            int rightCommonAncestor = calcCommonAncestor(rightChildIndex, index1, index2);

            if (leftCommonAncestor != -1 && rightCommonAncestor != -1) {
                return rootIndex;
            } else if (leftCommonAncestor != -1) {
                return leftCommonAncestor;
            } else return rightCommonAncestor;
        } else if (leftChildExists) {
            return calcCommonAncestor(leftChildIndex, index1, index2);
        } else if (rightChildExists) {
            return calcCommonAncestor(rightChildIndex, index1, index2);
        }
        return -1;
    }
}
