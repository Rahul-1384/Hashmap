public class GenericsClient {
    public static void main(String[] args) {
        GenericsDemo<String> gd = new GenericsDemo<>();
        gd.a = "abc";
        System.out.println(gd.a);


        Integer[] arr1 = {1,2,3,4};
        String[] arr2 = {"abcd","efgh"};
        
        gd.display(arr1);
        gd.display(arr2);
    }
}
