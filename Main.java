public class Main {
    public static void main(String[] args) {
        Linked<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("hko");
        stringLinked.addFirst("ld");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
    }
}
