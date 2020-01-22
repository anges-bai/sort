public static void selectionSort(int[] arr, int n) {
if (n <= 1) return;
for (int i = 0; i < n - 1; ++i) {
// 查找最⼩值
int minIndex = i;
for (int j = i + 1; j < n; ++j) {
if (arr[j] < arr[minIndex]) {
minIndex = j;
 }
 }
// 交换
int tmp = arr[i];
arr[i] = arr[minIndex];
arr[minIndex] = tmp;
 }
}
