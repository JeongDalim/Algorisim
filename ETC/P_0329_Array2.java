package PRACTICE;
public class P_0329_Array2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		// 2���� �迭�� ������ ���
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				cnt++;
				arr[i][j] = cnt;

				// arr[i][4] += cnt; //4��° �ڸ��� �հ踦 �� ���ϴ� ��
				// arr[4][i] += cnt; // 4��° �ڸ��� �հ踦 �� ���ϴ� ��
				// arr[j][4] += cnt;
				// arr[4][j] += cnt; ������ �̰� �����Ҷ� �ٹٲ������ 

				
				
				arr[i][arr[i].length - 1] += cnt;
				arr[arr.length - 1][j] += cnt;
				arr[arr.length - 1][arr[i].length - 1] += cnt;

			}

		}
		// 2���� �迭 ���
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}