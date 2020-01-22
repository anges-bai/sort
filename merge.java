/**
* 合并函数
* @param array
* @param p 开始位置
* @param mid 中间位置
* @param r 结束位置
*/
private static void merge(int[] array,int p,int mid,int r) {
int i = p;
int j = mid + 1;
int k = 0;
int[] temp = new int[r-p+1];
// 两部分数组都还有数据
while (i <= mid && j <= r) {
// ⼩于等于来保证有序性
if (array[i] <= array[j]) {
temp[k++] = array[i++];
 }else {
temp[k++] = array[j++];
 }
 }
// 判断两个数组中哪个还有元素
int start = i;
int end = mid;
// 剩下第⼆个数组
if (j <= r) {
start = j;
end = r;
 }
// 将剩余数据拷⻉回temp数组
while (start <= end) {
temp[k++] = array[start++];
 }
// 将tmp中的数组拷⻉回a[p...r]
for (i = 0; i<= r-p;i++) {
array[p+i] = temp[i];
 }
 }
