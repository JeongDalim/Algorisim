package PRACTICE;
public class P_0329_Array2 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		// 2차원 배열에 데이터 기억
		int cnt = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				cnt++;
				arr[i][j] = cnt;

				// arr[i][4] += cnt; //4번째 자리에 합계를 다 더하는 것
				// arr[4][i] += cnt; // 4번째 자리에 합계를 다 더하는 것
				// arr[j][4] += cnt;
				// arr[4][j] += cnt; 하지만 이건 수정할때 다바꿔줘야함 

				
				
				arr[i][arr[i].length - 1] += cnt;
				arr[arr.length - 1][j] += cnt;
				arr[arr.length - 1][arr[i].length - 1] += cnt;

			}

		}
		// 2차원 배열 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}