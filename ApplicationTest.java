class ApplicationTest {
    public static void main(String[] args) {
        // Test with Integer
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(25);
        intStorage.addElement(7);

        System.out.println("Integer storage size: " + intStorage.getSize());
        System.out.println("Element at index 1: " + intStorage.getElement(1));

        intStorage.removeElement(0);
        System.out.println("After remove - size: " + intStorage.getSize());

        // Test with String
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Java");
        stringStorage.addElement("Generics");
        stringStorage.addElement("Are");
        stringStorage.addElement("Powerful");

        System.out.println("\nString storage size: " + stringStorage.getSize());
        System.out.println("Element at index 2: " + stringStorage.getElement(2));

        // Test with Double
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(3.14);
        doubleStorage.addElement(2.718);
        System.out.println("\nDouble storage size: " + doubleStorage.getSize());
    }
}
