package hash_table_problem;


/**
 * Two Sum 系列——1:
 *      1、索引从0开始计算还是从1开始计算？
 *      2、没有解怎么办？
 *      3、有多个解怎么办？保证有唯一解。
 *      4、暴力解法 O(n^2)
 *      5、排序后，使用双索引对撞：O(nlogn) + O(n) = O(nlogn)
 *      6、查找表(map)，将所有元素放入查找表，之后对每一个元素 a，查找 target - a 是否存在。O(n)
 */
public class Solution1 {
}
