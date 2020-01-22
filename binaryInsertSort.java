public static void binaryInsertSort(int[] array) {
long start = System.currentTimeMillis();
if (array.length <= 1) {
return;
 }
else {
int n = array.length;
int low,mid,high,j= 0;
for (int i = 1;i < n;i++) {
// 未排序集合的第⼀个元素
int temp = array[i];
// 已排序集合第⼀个元素
low = 0;
// 已排序集合最后⼀个元素
high = i - 1;
while (low <= high) {
mid = (low + high) / 2;
if (array[mid] < temp) {
low = mid + 1;
 }else {
high = mid - 1;
 }
 }
// 要插⼊的位置在high+1处，搬移元素
for (j = i - 1;j > high;j--) {
array[j+1] = array[j];
 }
array[j+1] = temp;
 }
 }
long end = System.currentTimeMillis();
System.out.println("折半插⼊排序共耗时:"+(end - start)+"毫秒");
}
