package Test;

interface Constants {
    int VALUE = 45;
}

class GG implements Constants {
    public static void main(String[] args) {
        System.out.println(VALUE);
    }
}
