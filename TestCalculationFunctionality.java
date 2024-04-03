public class TestCalculationFunctionality {

    // Метод для тестування обчислень та виведення результатів
    public static void testCalculationAndDisplay() {
        // Створюємо об'єкт CalculationData через фабрику
        CalculationDataFactory factory = new CalculationDataFactoryImpl();
        CalculationData data = factory.createCalculationData(10.0, 5.0, 3.0);

        // Виконуємо обчислення та виводимо результати
        CalculationResultDisplay display = new TextTableCalculationResultDisplay("%-15s%-10.2f");
        System.out.println(data.displayResults(display));
    }

    // Додайте інші методи для тестування різних аспектів функціональності

    public static void main(String[] args) {
        // Викликаємо методи для тестування різних аспектів програми
        testCalculationAndDisplay();
    }
}
