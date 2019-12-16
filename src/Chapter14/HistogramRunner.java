//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class HistogramRunner {
    public static void main(String[] args) {
        int[] nums1 = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
        int[] nums2 = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        int[] nums3 = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
        Histogram bob = new Histogram(nums1);
        System.out.println(bob);
        bob.setVars(nums2);
        System.out.println(bob);
		bob.setVars(nums3);
		System.out.println(bob);
}
}