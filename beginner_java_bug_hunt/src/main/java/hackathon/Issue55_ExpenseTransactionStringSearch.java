public class Issue55_ExpenseTransactionStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A25", "B25", "C25"};
        String target = new String("B25");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
