public class EqualityPrinter{
    public static void printEquality(int a, int b){
        String result = a + ", " + b + ": ";
        if(a < 0 || b < 0){
            result = "Invalid value.";
        }else if(a == b){
            result += "Both numbers are equal.";
        }else{
            result += "Both numbers are different.";
        }
        System.out.println(result);
    }
    public static void printEquality(int a, int b, int c){
        String result = a + ", " + b + ", " + c + ": ";
        if(a < 0 || b < 0 || c < 0){
            result = "Invalid value.";
        }else if(a == b && b == c){
            result += "All three numbers are equal.";
        }else if(a != b && a != c && b != c){
            result += "All three numbers are different.";
        }else{
            result += "These three numbers are neither all equal nor all different.";
        }
        System.out.println(result);
    }
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
