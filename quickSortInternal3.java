private static void quickSortInternal3(int[] arr,int l,int r) {
if (l >= r) {
return;
 }
// 随机选取待排序数组中的任意⼀个元素
int randomIndex = (int) (Math.random()*(r-l+1) + l);
swap(arr,l,randomIndex);
int v = arr[l];
// arr[l+1...lt] < v
int lt = l;
// arr[lt+1...i-1] == v
int i = l + 1;
// arr[gt...r] > v
int gt = r + 1;
while (i < gt) {
if (arr[i] < v) {
swap(arr,i,lt+1);
lt++; i++;
 }else if (arr[i] > v) {
swap(arr,i,gt-1);
gt--;
 }else {
i++;
 }
 }
// 循环⾛完只需要将l位置的元素与lt交换即为分区点
swap(arr,l,lt);
quickSortInternal3(arr,l,lt-1);
quickSortInternal3(arr,gt,r);
}
