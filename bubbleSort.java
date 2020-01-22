public static void bubbleSort(int[] array) {
if (array.length <= 1) {
return;
 }else {
int n = array.length;
for (int i = 0;i < n;i++) {
boolean flag = false;
for (int j = 0;j < n - i - 1;j++) {
if (array[j] > array[j+1]) {
flag = true;
int temp = array[j];
array[j] = array[j+1];
array[j+1] = temp;
 }
 }
// 此时已经没有数据交换，停⽌循环
if (!flag) {
break;
 }
 }
 }
}
