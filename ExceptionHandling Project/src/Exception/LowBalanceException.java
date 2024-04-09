package Exception;

//public class LowBalanceException extends Exception {
//
//    LowBalanceException(String message) {
//        super(message);
//    }
//
//    public static void main(String[] args) {
//        try {
//            throw new LowBalanceException("Low balance detected!");
//        } catch (LowBalanceException e) {
//            System.err.println("Caught exception: " + e.getMessage());
//        }
//    }
//}
public class LowBalanceException extends Exception{
	LowBalanceException(String Message){
		super(Message);
	}
public static void main(String[] args) {
	try {
		throw new LowBalanceException("detailMessage");
	}
	catch(LowBalanceException e) {
		System.err.println("xghgj");
	}
}
}
