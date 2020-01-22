public static void shellSort(int[] arr){
int len = arr.length;
if (len == 1) return;
int step = len / 2;
while (step >= 1) {
for (int i = step; i < len; i++) {
int value = arr[i];
int j = i - step;
for (; j >= 0; j -= step) {
if (value < arr[j]) {
arr[j+step] = arr[j];
 } else {
break;
 }
 }
arr[j+step] = value;
 }
step = step / 2;
 }
 }
