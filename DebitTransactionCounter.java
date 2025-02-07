public class DebitTransactionCounter {
    public static void main(String[] args) {
        int[] transactions = {900, 1500, 600, 1200, 4000}; 
        int debitCount = countDebits(transactions);
        System.out.println("Number of debit transactions: " + debitCount);
    }
    public static int countDebits(int[] transactions) {
        int count = 0;
        int debitThreshold = 1000;
        for (int transaction : transactions) {
            if (transaction < debitThreshold) {
                count++; 
            }
        }
        return count;
    }
}
