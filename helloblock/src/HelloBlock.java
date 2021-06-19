import java.util.ArrayList;

public class HelloBlock {
    /*
    Hash = digital signature
    Each block will have List of transaction, Previous Hash, Hash
    */
    ArrayList<Block> blockChain = new ArrayList<>();
    public static void main(String[] args) {
        String[] genesisTransactions = {"Evn sent Dev 109000 DogeCoin", "Fin sent 10 DogeCoin to Dev"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Dev sent Evn 590000 DogeCoin", "Evn sent 2000 DogeCoin to Meri"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Dev sent Dev 100000 DogeCoin"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of Block1:");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of Block2:");
        System.out.println(block2.getBlockHash());
        System.out.println("Hash of Block3:");
        System.out.println(block3.getBlockHash());
    }
}
