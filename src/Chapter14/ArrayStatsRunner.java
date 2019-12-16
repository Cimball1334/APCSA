//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class ArrayStatsRunner {
    public static void main(String[] args) {
        int[] num = {3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num2 = {1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6};
        ArrayStats tester = new ArrayStats(num);
        System.out.println(tester);
		System.out.println("size 1 count == " + tester.getNumGroupsOfSize(1));
		System.out.println("size 2 count == " + tester.getNumGroupsOfSize(2));
		System.out.println("size 3 count == " + tester.getNumGroupsOfSize(3));
		System.out.println("size 4 count == " + tester.getNumGroupsOfSize(4));
		System.out.println("size 5 count == " + tester.getNumGroupsOfSize(5));
		System.out.println("size 6 count == " + tester.getNumGroupsOfSize(6)  + "\n");
		tester.setVars(num1);
		System.out.println(tester);
		System.out.println("size 1 count == " + tester.getNumGroupsOfSize(1));
		System.out.println("size 2 count == " + tester.getNumGroupsOfSize(2));
		System.out.println("size 3 count == " + tester.getNumGroupsOfSize(3));
		System.out.println("size 4 count == " + tester.getNumGroupsOfSize(4) + "\n");
		tester.setVars(num2);
		System.out.println(tester);
		System.out.println("size 1 count == " + tester.getNumGroupsOfSize(1));
		System.out.println("size 2 count == " + tester.getNumGroupsOfSize(2));
		System.out.println("size 6 count == " + tester.getNumGroupsOfSize(6));
		System.out.println("size 8 count == " + tester.getNumGroupsOfSize(8));
    }
}



