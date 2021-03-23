package Lesson3;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneDirectory {

static List<String> arrSurname = new ArrayList<>(Arrays.asList("Петров","Васильев","Иванов","Барыкин","Малыкин"));
static List<String> arrNumber = new ArrayList<>(Arrays.asList("8(954)-344-43-34","8(923)-46-26-46","8(955)-324-53-34","8(643)-431-43-42", "8(953)-642-56-32"));
//,"8(664)-623-62-32","8(964)-543-53-12","8(954)-344-43-34"));

static Map<String,List<String>> arr = new HashMap<>();


PhoneDirectory()
{

    for(int i = 0;i <arrSurname.size();i++)
    {
        arr.put(arrSurname.get(i), new ArrayList<>(Arrays.asList(arrNumber.get(i))));

    }
//    System.out.println(arr);

}

static void add(String surname, String phoneNumber)
{
    List<String> buffer = new ArrayList<>();
    buffer = arr.getOrDefault(surname,buffer);
    buffer.add(phoneNumber);
    arr.put(surname,buffer);
}

public static void get(String surname)
{
    System.out.println(surname + " " + arr.get(surname));
}


}
