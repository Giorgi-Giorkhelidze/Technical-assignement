import java.util.HashMap;
import java.util.Map;

public class Main {
    // პირველი დავალება
    static boolean isPalindrome(String text) {
        boolean answer = false;
        char[] Text = text.toCharArray();

        int quantity = text.length();

        for (int i = 0; i < quantity; i++) {
            if (Text[i] == Text[quantity - (i + 1)])
                answer = true;
            else {
                answer = false;
                break;
            }
        }
        return answer;
    }

    //მეორე დავალება
    static int minSplit(int amount) {
        int c50 = amount / 50;
        int c20 = (amount % 50) / 20;
        int c10 = ((amount % 50) % 20) / 10;
        int c5 = (((amount % 50) % 20) % 10) / 5;
        int c1 = ((((amount % 50) % 20) % 10) % 5);


        return c50 + c20 + c10 + c5 + c1;
    }

    //მესამე დავალება
    static int notContains(int[] array) {
        int num = 1;


        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                map.put(array[i], "");
        }
        while (map.containsKey(num)) {
            num++;
        }


        return num;
    }

    //მეოთხე დავალება
    static boolean isProperly(String sequence) {
        char[] Sequence = sequence.toCharArray();
        int brackets = 0;


        for (char c : Sequence) {
            if (c == '(')
                brackets += 1;
            if (c == ')')
                brackets -= 1;
            if (brackets < 0) {
                return false;
            }
        }


        return brackets == 0;
    }

    //მეხუთე დავალება
    static int countVariants(int stairsCount){
        if (stairsCount<=0)
            return 0;
        if(stairsCount==1)
            return 1;
        if(stairsCount==2)
            return 2;
        return countVariants(stairsCount-1)+countVariants(stairsCount-2);
    }

    static int countVariants2(int stairsCount2){
        if (stairsCount2<=0)
            return 0;
        if(stairsCount2==1)
            return 1;
        if(stairsCount2==2)
            return 2;

        int first = 1;
        int second = 2;
        int variant = 0;
        for (int i = 3; i <= stairsCount2; i++) {
            variant = first + second;
            first = second;
            second = variant;
        }

        return variant;
    }

    static int countVariants3(int stairCount) {
        if (stairCount<=0)
            return 0;
        return (int) ((Math.pow(1 + Math.sqrt(5), stairCount+1) - Math.pow(1 - Math.sqrt(5), stairCount+1))
                / (Math.pow(2, stairCount+1) * Math.sqrt(5)));
    }




    public static void main(String[] args) {

//        String x="rogor";
//        boolean b= isPalindrome(x);
//        System.out.println(b);

//        int a=124;
//        int c=minSplit(a);
//        System.out.println(c);
//
//        int[] arr={   9, 24, -4,-1, 2, 5, 1, 1, 7, 2, 2,4, 3, 3, 6, 5, 4, 78, 4};
//        int min=notContains(arr);
//        System.out.println(min);
//
//        String sequence="())()())()";
//        boolean isGood=isProperly(sequence);
//        System.out.println(isGood);

//        int stairsCount=countVariants(7);
//        System.out.println(stairsCount);
//        int stairsCount2=countVariants2(7);
//        System.out.println(stairsCount2);
//        int stairsCount3=countVariants3(7);
//        System.out.println(stairsCount3);

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }
}
