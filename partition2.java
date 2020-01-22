private static int partition2(int[] array,int l,int r) {
// 随机选取待排序数组中的任意⼀个元素
int randomIndex = (int) (Math.random()*(r-l+1) + l);
swap(array,l,randomIndex);
int v = array[l];
int i = l+1,j = r;
while (true) {
while (i <= r && array[i] < v) i++;
while (j >= l+1 && array[j] > v) j--;
if (i > j) {
break;
 }
swap(array,i,j);
i++; j--;
 }
// 循环⾛完后，j索引下标为分区点位置
swap(array,l,j);
return j; }
