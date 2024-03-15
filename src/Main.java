import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String words = scan.nextLine();
        String[] word = words.split("\\s+"); // Metni kelimelere böler

        // Kelimelerin sayısını saklamak için bir HashMap oluşturuluyor
        Map<String, Integer> wordCounts = new HashMap<>();


        for (String count : word) {
            if (wordCounts.containsKey(count)) {
                wordCounts.put(count, wordCounts.get(count) + 1);
            } else {
                wordCounts.put(count, 1);
            }
        }

        int maxCount = 0;
        String mostFrequentWord = "";

        // En sık geçen kelimeyi bulmak için HashMap içinde dolaşma
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() >= maxCount) {
                // Eğer bu kelimenin sayısı, şu ana kadar en yüksek sayıdan fazlaysa, bu kelimeyi en sık geçen kelime olarak belirle
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        System.out.println("En sık geçen kelime: " + mostFrequentWord + " (" + maxCount + " kez)");
    }
}
