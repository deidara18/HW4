import java.util.LinkedList;

public class Task1 {
    //    Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
    public static void main(String[] args) {
        LinkedList<Integer> number_list = new LinkedList<>(); // Создал пустой список
            for (int i = 0; i <= 10; i++){
            number_list.add(i);// заполнил список элементами
            }
            System.out.println(number_list);
            System.out.println(methodReverse(number_list));
            }

    public static LinkedList<Integer> methodReverse(LinkedList<Integer> reveres){
            LinkedList<Integer> reverseList = new LinkedList<>(); // Ещё один пустой список в который будет записывать перевернутый список

        for (int i = 0; i < reveres.size(); i++){
            reverseList.add(i, reveres.get(reveres.size() - i - 1));
            }
            return reverseList;
    }
}



