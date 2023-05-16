public class BinOps {
    public String sum(String a, String b) {
        int result = toInt(a) + toInt(b);
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int result = toInt(a) * toInt(b);
        return Integer.toBinaryString(result);
    }

    private int toInt(String arg) {
        return Integer.parseInt(arg, 2);
    }
}
