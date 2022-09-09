public class Main{
    public static void main(String[] args){
        EqualityPrinter equalityPrinter = new EqualityPrinter();
        equalityPrinter.printEquality(4, 4, 4, 4);
        equalityPrinter.printEquality(32, 32, 32, 15);
        equalityPrinter.printEquality(-16, 7, 294, 43);
        equalityPrinter.printEquality(52, 9839, 68, 13);
    }
}
