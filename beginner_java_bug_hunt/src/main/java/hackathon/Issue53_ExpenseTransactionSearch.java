public class Issue53_ExpenseTransactionSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {3, 8, 3, 125};
        int target = 125;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
