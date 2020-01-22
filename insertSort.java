public static void insertSort(int[] array) {
if (array.length <= 1) {
return;
 }else {
int n = array.length;
for (int i = 1;i < n;i++) {
int value = array[i];
int j = i - 1;
// 从后向前找该元素的插⼊位置
for (;j >= 0;j--) {
if (array[j] > value) {
array[j+1] = array[j];
 }else {
break;
 }
 }
array[j+1] = value;
 }
 }
}
