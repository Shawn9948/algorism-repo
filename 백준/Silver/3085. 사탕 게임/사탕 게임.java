import java.io.*;


public class Main {
    static String[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().split("");
        }
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                exchangeRow(j, arr[i]);
                answer = scanRow(n, arr, answer);
                answer = scanColumn(n, arr, answer);
                exchangeRow(j, arr[i]);
            }
        }

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-1; j++) {
                exchangeColumn(i, j);
                answer = scanRow(n, arr, answer);
                answer = scanColumn(n, arr, answer);
                exchangeColumn(i, j);
            }
        }

        System.out.println(answer);
    }

    private static void exchangeColumn(int i, int j) {
        String tmp = arr[j][i];
        arr[j][i] = arr[j + 1][i];
        arr[j + 1][i] = tmp;
    }

    private static int scanColumn(int n, String[][] arr, int answer) {
        for (int k = 0; k < n; k++) {

            int max = 1;
            for (int l = 0; l < n-1; l++) {
                if (arr[l+1][k].equals(arr[l][k])) {
                    max++;
                } else {
                    max = 1;
                }
                answer = Math.max(answer, max);
            }
        }
        return answer;
    }

    private static int scanRow(int n, String[][] arr, int answer) {
        for (int k = 0; k < n; k++) {

            int max = 1;
            for (int l = 0; l < n-1; l++) {
                if (arr[k][l+1].equals(arr[k][l])) {
                    max++;
                } else {
                    max = 1;
                }
                answer = Math.max(answer, max);
            }
        }
        return answer;
    }

    private static void exchangeRow(int j, String[] arr) {
        String tmp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = tmp;
    }
}


