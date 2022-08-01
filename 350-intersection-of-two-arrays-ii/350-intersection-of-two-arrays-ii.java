class Solution {
public int[] intersect(int[] nums1, int[] nums2) {
int arr1[] = new int[1001];
int arr2[] = new int[1001];
int count= 0;
for (int i = 0; i < nums1.length; i++){
arr1[nums1[i]]++;
}
for (int k = 0; k < nums2.length; k++){
if(arr1[nums2[k]] > 0){
arr2[nums2[k]] ++;
arr1[nums2[k]]--;
count++;
}
}
int []output = new int[count];
int pos = 0 ;
for(int j = 0; j < 1001 ; j++){
while( arr2[j] > 0 ){
output[pos] = j;
arr2[j]--;
pos ++;
}
}
return output;
}

}