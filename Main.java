// Generic class representing a financial transaction
class Transaction<T extends Number> {

    //Data members
    private String transactionType;
    private T amount;

    //Constructor
    public Transaction(String transactionType, T amount) {

        this.transactionType = transactionType;
        this.amount = amount;
    }

    //Getter methods
    public String getTransactionType() {

        return transactionType;
    }

    public T getAmount() {

        return amount;
    }

    //Method to display transaction details
    public void displayTransactionDetails() {

        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Amount: " + amount);
    }
}

// Interface for different types of financial instruments
interface FinancialInstrument {

    void displayInstrumentDetails();
}

// Concrete implementation of FinancialInstrument interface for stocks
class Stock implements FinancialInstrument {

    private String symbol;
    private int quantity;

    public Stock(String symbol, int quantity) {

        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void displayInstrumentDetails() {

        System.out.println("Stock Symbol: " + symbol);
        System.out.println("Quantity: " + quantity);
    }
}

// Concrete implementation of FinancialInstrument interface for bonds
class Bond implements FinancialInstrument {

    private String bondName;
    private double faceValue;

    public Bond(String bondName, double faceValue) {

        this.bondName = bondName;
        this.faceValue = faceValue;
    }

    public void displayInstrumentDetails() {

        System.out.println("Bond Name: " + bondName);
        System.out.println("Face Value: " + faceValue);
    }
}

public class Main {

    public static void main(String[] args) {
        
        Transaction<Double> deposit = new Transaction<>("Deposit", 1000.0);
        Transaction<Integer> withdrawal = new Transaction<>("Withdrawal", 500);

        // Display transaction details
        deposit.displayTransactionDetails();
        withdrawal.displayTransactionDetails();

        // Create financial instruments
        FinancialInstrument stock = new Stock("AAPL", 50);
        FinancialInstrument bond = new Bond("Corporate Bond A", 10000.0);

        // Display financial instrument details
        ((Stock) stock).displayInstrumentDetails();
        ((Bond) bond).displayInstrumentDetails();
    }
}
