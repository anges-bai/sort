/**
* 归并排序递归函数
* @param array 要排序的集合
* @param p 开始位置
* @param r 结束位置
*/
private static void mergeSortIntern(int[] array,int p,int r) {
// 终⽌条件
if(p >= r) {
return;
 }
int mid = (p + r) / 2;
mergeSortIntern(array,p,mid);
mergeSortIntern(array,mid+1,r);
// 将array[p...mid]与array[mid+1...r]合并为array[p...r]
merge(array,p,mid,r);
}
