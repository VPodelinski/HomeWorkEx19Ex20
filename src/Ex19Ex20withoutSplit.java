import java.util.ArrayList;

/**
 * Created by viivpo2010 on 21.6.17.
 */
public class Ex19Ex20withoutSplit {
/*
Упражнение 19 Вывод количества слов, с любым количеством пробелов между ними.
 */
        public static void main(String[] args) {
            final String str = "Предметом  нашего исследования являются проблемы разработки промышленного программного обеспечения. В этой области можно " +
                    "найти программы," +
                    " демонстрирующие самые разные виды   поведения.";
            final ArrayList<String> list = new ArrayList<String>();
            String str2 = str.trim();
            char[] ch = str2.toCharArray();
            int count = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == ' ') {
                    if (i > count) {
                        list.add(str2.substring(count, i));
                    }
                    count = i + 1;
                }
            }
            if (count < str2.length()) {
                list.add(str2.substring(count));
            }
/*
Вывод слов из текста и их количества.
 */
            for(String s : list){
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println("Количество слов " + list.size());
/*
Упражнение 20. Вывод последних букв всех слов в тексте.
 */
            for(String s : list){
                s = s.replaceAll("[?!.,:;-]", "");
                System.out.print("Вывод последних букв слов " + s.charAt(s.length()-1));
            }
        }
}


