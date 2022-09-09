public class EqualityPrinter{
    public static void printEquality(int a, int b, int c, int d){
        String result = a + ", " + b + ", " + c + ", " + d + ": ";
        if(a < 0 || b < 0 || c < 0){
            result = "Invalid value.";
        }else if(a == b && b == c && c == d){
            result += "All four numbers are equal.";
        }else if(a != b && a != c && a != d && b != c && b != d && c != d){
            result += "All four numbers are different.";
        }else{
            result += "These four numbers are neither all equal nor all different.";
        }
        System.out.println(result);
    }
}
