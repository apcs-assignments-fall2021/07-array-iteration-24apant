public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int count = 0;
        int[]arr1 = new int[arr.length];
        for (int z=arr.length- 1;z>=0;z--){
            arr1[count] = arr[z];
            count += 1;
        }
        return arr1;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int[] arrMax = findLargest(arr);
        int[] arr2 = removeElement(arr, arrMax[1]);
        return findLargest(arr2)[0];
    }
    public static int[] findLargest(int[] arr)
    {
        int i;
        int max_index = 0;
        int max = arr[0];
        for (i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                max_index = i;

            }


        }

        return new int[]{max, max_index};
    }

    public static int[] removeElement(int[] arr, int index){
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i ++){
            if (i != index){
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        for (String x: dictionary){
            if (x.equals(word)){
                return true;
            }
        }
        // REPLACE WITH YOUR CODE HERE
        return false;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
