import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(i);
        }
        arr.add(2);

//        System.out.println(arr);



        List<String> letters = new ArrayList<>();

        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("e");
        letters.add("f");
        letters.add("b");

//        System.out.println(letters);


//        System.out.println(unique(arr));
//        System.out.println(unique(letters));





        List<Integer> multipleTest = new ArrayList<>();

        multipleTest.add(15);
        multipleTest.add(25);
        multipleTest.add(2);
        multipleTest.add(5);
        multipleTest.add(30);
        multipleTest.add(19);
        multipleTest.add(57);
        multipleTest.add(2);
        multipleTest.add(25);

//        System.out.println(multipleTest);

//        System.out.println(allMultiples(multipleTest,5));



        List<String> testString = new ArrayList<>();
        testString.add("I");
        testString.add("like");
        testString.add("to");
        testString.add("eat");
        testString.add("eat");
        testString.add("eat");
        testString.add("apples");
        testString.add("and");
        testString.add("bananas");

//        System.out.println(allStringsOfSize(testString, 3));
//
//        allStringsOfSize(testString, 3);

        List<Integer> permOne = new ArrayList<>();

        permOne.add(1);
        permOne.add(2);
        permOne.add(4);


        List<Integer> permTwo = new ArrayList<>();

        permTwo.add(1);
//        permTwo.add(5);
        permTwo.add(4);
//        permTwo.add(5);

//        isPermutation(permOne, permTwo);
        ArrayList<String> toWords = new ArrayList<>();
        toWords.add("The quick brown fox");
        String testData = "The quick brown fox";

//        stringToListOfWords(testData);


        ArrayList<String> test = new ArrayList<>();
        test.add("the.");
        test.add("quick,");
        test.add("fox.");
        test.add("went.,.,");
//        sanitizeString(test, "(\\w+)");


        ArrayList<Integer> testRemove = new ArrayList<>();

        testRemove.add(1);
        testRemove.add(4);
        testRemove.add(5);
        testRemove.add(6);
        testRemove.add(5);
        testRemove.add(5);
        testRemove.add(2);

        removeAllInstances(testRemove, 5);






    }//end main










    public static <E> boolean unique(List<E> list){

        boolean foundUnique = true;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1 ; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){

                    return false;
                }
            }
        }

        return true;
    }


    public static ArrayList<Integer> allMultiples(List<Integer> list, int checkMul){

//        List<Integer> newArray = new ArrayList<>(list.size());
        ArrayList<Integer> newArray = new ArrayList<>();


        for (int i = 0; i < list.size(); i++)
            if (list.get(i) % checkMul == 0) {
//                System.out.println(list.get(i));
                newArray.add(list.get(i));

            }

        return newArray;

    }


    public static ArrayList<String> allStringsOfSize(List<String> list, int length){

        ArrayList<String> newString = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
//            word = list.get(i);
            if (list.get(i).length() == length){

                newString.add(list.get(i));

            }


        }

        return newString;
    }


    public static <Integer>boolean isPermutation(List<Integer> firstList, List<Integer> secondList){

        boolean isPermutation = false;

        if(firstList.size() != secondList.size()) {
            System.out.println("Lists are of different sizes");
            return isPermutation;
        }
//        ArrayList<Integer> sameElement = new ArrayList<>();
        int sameElement = 0;

        for (int i = 0; i < firstList.size(); i++) {

            for (int j = 0; j < secondList.size(); j++) {

                if(firstList.get(i).equals(secondList.get(j))) {
                    sameElement++;
                    System.out.println(firstList.get(i));
                }
            }
        }
        if(sameElement == firstList.size()){
            System.out.println("True");
            return isPermutation;

        }
        System.out.println("False");
        return isPermutation;
    }



    public static ArrayList<String> stringToListOfWords(String inputString){

        String[] test = inputString.split("(\\w+)");

        List<String>  arr;
        arr = Arrays.asList(inputString.split("[, . @]+"));

        ArrayList<String> result = new ArrayList<>();

        for (String item : arr) {
            result.add(item);
            result.add(",");
            System.out.println(item);
        }

        return result;
    }

    public static ArrayList<String> sanitizeString(ArrayList<String> inputString, String regexPattern){


        ArrayList<String> sanitizedString = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String word: inputString){
            sb.append(word);
            sb.append(" ");
        }

        String arrToString = sb.toString();
        System.out.println(arrToString);

        Pattern checkRegex = Pattern.compile(regexPattern);

        Matcher regexMatcher = checkRegex.matcher(arrToString);
        while(regexMatcher.find()){
            sanitizedString.add(regexMatcher.group());
            System.out.println(sanitizedString);
        }

        return sanitizedString;
    }



    public static ArrayList<Integer> removeAllInstances(List<Integer> input, Integer item){

        for (int i = 0; i < input.size() ; i++) {
            if(input.get(i).equals(item)){
//                System.out.println(input.get(i));
                input.remove(i);
                i--;
            }
        }
        return (ArrayList<Integer>) input;
    }


}//end main()
