import java.util.Arrays;

public class Block {
    private final int previousHash;
    private final String[] transactions;
    private final int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contends = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contends);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
