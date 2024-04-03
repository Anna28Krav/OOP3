// Основний клас програми
public class Main {
    public static void main(String[] args) {
        // Діалоговий інтерфейс з користувачем
        // Приклад створення об'єкта CalculationData через фабрику та відображення результатів у вигляді текстової таблиці
        CalculationDataFactory factory = new CalculationDataFactoryImpl();
        CalculationData data = factory.createCalculationData(10.0, 5.0, 3.0);

        // Відображення результатів у вигляді текстової таблиці з заданими параметрами
        String tableFormat = "%-15s%-10.2f"; // Формат таблиці
        CalculationResultDisplay display = new TextTableCalculationResultDisplay(tableFormat);
        System.out.println(data.displayResults(display));
    }
}
