/**
* 对array[l...r]部分进⾏partition操作
* 返回p, 使得array[l...p-1] < array[p] ; array[p+1...r] > array[p]
* @param array 待排序数组
* @param l 数组开始点
* @param r 数组结束点
* @return 分区点下标
*/
private static int partition(int[] array,int l,int r) {
// 默认⽐较元素为待排序数组的第⼀个元素
int v = array[l];
int j = l;
for (int i = l + 1;i <= r;i++) {
// 每当碰到⼩于⽐较元素的值与j+1位置交换，⼩于区间⻓度加⼀
if (array[i] < v) {
swap(array,j+1,i);
j++;
 }
 }
// 当for循环⾛完只需要将array[l]位置与array[j]位置交换即可保证索引⼩于j的元素均⼩于
v，
// 索引⼤于j的元素均⼤于j
swap(array,l,j);
return j; }
/**
* 交换数组中两个索引下标的元素
*/
private static void swap(int[] array,int x,int y) {
int temp = array[x];
array[x] = array[y];
array[y] = temp; }
