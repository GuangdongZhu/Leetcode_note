package leetcode_test;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.sun.source.tree.Tree;
import javafx.concurrent.Service;
import jdk.dynalink.beans.StaticClass;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.jdbc.core.metadata.HsqlTableMetaDataProvider;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.transaction.reactive.AbstractReactiveTransactionManager;

import javax.print.DocFlavor;
import javax.swing.*;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.security.UnrecoverableEntryException;
import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


public class testcode {
    public static String getType(Object o)
    {
        return o.getClass().toString();
    }

    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println("result--"+s.rob(new int[]{1,2,3,1,3,4,7,3,6,5,4}));
//        Student s = new Student("jack","china",'男',18,98.0,60.0);
//        System.out.println(s.getInfo());
//        Count c = new Count("want to know one thing");
//        System.out.println(c.getNum('n'));
//        System.out.println(c.getNum('o'));
//
        Solution s = new Solution();
//        boolean result = s.containsNearbyAlmostDuplicate(new int[]{1,2,1,1}, 1,0);
//
//        System.out.println(result);
//        int nums[] = new int[]{0,1,2,2,3,0,4,2};
////        int len = s.removeDuplicates(nums);
//        int len = s.removeElement(nums,2);
//
//        for(int i=0;i<len;i++)
//            System.out.print(nums[i]);


//        String haystack = "mississippi";
//        String needle = "issip";
//        System.out.println(s.strStr(haystack,needle));



//        int[] nums = new int[]{1,9,4,3};
//        s.largestDivisibleSubset(nums);
//        for(int i:nums)
//            System.out.println(i);
//        int [] nums = new int[]{-2, 0, 3, -5, 2, -1};
//        NumArray numArray = new NumArray(nums);
//        System.out.println(numArray.sumRange(0,2));

        //int res = s.minCost(new int[]{0,0,0,0,0},new int[][]{{1,10},{10,1},{10,1},{1,10},{5,1}},5,2,3);
//        int res = s.deleteAndEarn(new int[]{3,4,2});
//        System.out.println(res);
//        int res = s.minDays(new int[]{1,10,3,10,2}, 3,1);
//        System.out.println("res "+res);

//        int[] res = s.decode(new int[]{6,5,4,6});
//        for(int i : res)
//            System.out.println(i);


//        int[] res = s.xorQueries(new int[]{1,3,4,8},new int[][]{{0,1},{1,2},{0,3},{3,3}});
//        for (int i: res)
//            System.out.println(i);
//        int len = 10;
//        int [] arr = new int[]{1,3,4,8};
//        int [] res = new int[10];
//        for (int j=1;j<=4;j++)
//            for (int i=j;i<=4;i+=s.lowbit(i))
//                res[i] ^= arr[j-1];
//    for(int i=1;i<20;i++)
//        System.out.println(i+" "+s.lowbit(i));


//        int res = s.numWay(27,7);
//        System.out.println(res);

//        String res = s.intToRoman(1994);
//        System.out.println(res);
//        int res = s.findMaximumXOR(new int[]{14,70,53,83,49,91,36,80,92,51,66,70});
//        System.out.println(res);

//        int res = s.countTriplets(new int[]{2,3,1,6,7});
//        System.out.println(res);[[10,9,5],[2,0,4],[1,0,9],[3,4,8]]
//10
//        int res = s.kthLargestValue(new int[][]{{10,9,5},{2,0,4},{1,0,9},{3,4,8}}, 10);
//        System.out.println(res);
        //"i", "love", "leetcode", "i", "love", "coding"},2
        //"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},4
//        List<String> res = s.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},4);
//        System.out.println(res);

//        int res = s.maxUncrossedLines(new int[]{2,5,1,2,5}, new int[]{10,5,2,1,5,2});
//        System.out.println(res);
//
//        boolean res = s.xorGame(new int[]{0,0,0,1});
//        System.out.println(res);

//        int [] res = s.maximizeXor(new int[]{0,1,2,3,4}, new int[][]{{3,1},{1,3},{5,6}});
//        int [] res = s.maximizeXor(new int[]{5,2,4,6,6,3}, new int[][]{{12,4},{8,1},{6,3}});
//        int [] res = s.maximizeXor(new int[]{536870912,0,534710168,330218644,142254206},
//                new int[][]{{558240772,1000000000},{307628050,1000000000},{3319300,1000000000}, {2751604,683297522}, {214004,404207941}});
//        int [] res = s.maximizeXor(new int[]{818702963,153655392,4096,917434814,4096},
//        new int[][]{{11886620,881210474},{811373,1000000000},{20352316,1000000000}, {443746890,860009574}, {872954994,1000000000}});
//        for(int i: res)
//            System.out.println(i);


//        int[] r = new int[]{818702963,153655392,4096,917434814,4096};
//        for(int i: r)
//            System.out.println(i^(11886620));
//        int res = s.strangePrinter("cbaniofoibvanoinohfabviubanoijgoihaiubkjvnalknl");
//        System.out.println(res);

//        boolean res = s.isSubsequence("abc","ahbgdc");
//        System.out.println(res);

//        String res = s.reverseParentheses("a(bcdefghijkl(mno)p)q");
//        System.out.println(res);

//        //461汉明距离
//        int res = s.hD(1,4);
//        System.out.println(res);

//        //477.汉明距离总和
//        int res = s.totalHammingDistance(new int[]{4,14,2});
//        System.out.println(res);

//        //插入后的最大值
//        String res = s.maxValue("-132",3);
//        System.out.println(res);

//        //使用服务器处理任务
//        int[] res = s.assignTasks(new int[]{10,63,95,16,85,57,83,95,6,29,71}, new int[] {70,31,83,15,32,67,98,65,56,48,38,90,5});
//        for (int i : res)
//            System.out.print(i + " ");

//        //4的幂
//        boolean res = s.isPowerOfFour(56745868);
//        System.out.println(res);

//        //吃到喜欢吃的糖果
//        boolean[] res = s.canEat(new int[]{5,2,6,4,1}, new int[][]{{3,1,2},{4,10,3},{3,10,100},{4,100,30},{1,3,1}});
//        for(boolean i : res)
//            System.out.print(i+" ");

//        //长度为3且各字符不同的子字符串
//        int res = s.countGoodSubstrings("xyzzaz");
//        System.out.println(res);
//        //数组中最大数对和的最小值
//        int res = s.minPairSum(new int[]{3,5,4,2,4,6});
//        System.out.println(res);
//        //二分查找
//        int res = s.search(new int[]{-1,0,3,5,9,12}, 2);
//        System.out.println(res);
//        //连续的子数组和
//        boolean res = s.checkSubarraySum(new int[]{0,0},1);
//        System.out.println(res);

//        //525连续数组  1e7 线性  数据范围是1e5 所以只能使用线性处理
//        int res = s.findMaxLength(new int[]{0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,1,0,1,0,1,0,0,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,1,0,1});
//        System.out.println(res);

//        //移除链表元素
//        ListNode l = new ListNode(1);
//        ListNode h = l;
//        int[] num = new int[]{1,1,1,1,1,1};
//
//        for (int i: num)
//        {
//            ListNode temp = new ListNode();
//            temp.val = i;
//            l.next = temp;
//            l = l.next;
//        }
//        l=h;
//        ListNode res = s.removeElements(l,6);
//
//        while(res!=null){
//            System.out.println(res.val);
//            res = res.next;
//        }

//        int res = s.reductionOperations(new int[]{1,1,2,2,3});
//        System.out.println(res);

        //使数组元素相等的减少操作次数
//        int res = s.minFlips("111000");
//        System.out.println(res);

        //判断矩阵轮转后是否相同
//        boolean res = s.findRotation(new int[][]{{0,0,0},{0,1,0},{1,1,1}}, new int[][]{{1,1,1},{0,1,0},{0,0,0}});
//        System.out.println(res);

        //使二进制字符串交替的最小反转次数
//        int res = s.minFlips("111000");
//        System.out.println(res);

        //494 目标和
//        int res = s.findTargetSumWays(new int[]{1,1,1,1,1},3);
//        System.out.println(res);
        //139 单词拆分--01背包问题,使用动态规划,判断指定区间是否可以由给定的数组内的元素组成
//        List<String> l = new LinkedList<>();
//        String[] wordDict = new String[]{"cats", "dog", "sand", "and", "cat"};
//        for (String str : wordDict)
//            l.add(str);
//        boolean res = s.wordBreak("catsandog", l);
//        System.out.println(res);
        //322 零钱兑换
//        int res = s.coinChange(new int[]{1,2,5}, 11);
//        System.out.println(res);
//        //1049最后一块石头的重量
//        int res = s.lastStoneWeightII(new int[]{1,1,2,3,5,8,13,21,34,55,89,14,23,37,61,98} );
//        System.out.println(res);
        //879盈利计划
//        int res = s.profitableSchemes(5,3,new int[]{2,2}, new int[] {2,3});
//        System.out.println(res);

        //518 零钱兑换2
//        int res = s.change(5,new int[]{1,2,5});
//        System.out.println(res);
        //完全平方数
//        int res = s.numSquares(12);
//        System.out.println(res);
        //1449数位成本和为目标值的最大数字
        String res = s.largestNumber(new int[]{4,3,2,5,6,7,2,5,5}, 9);
        System.out.println(res);

    }
}
class Count{
    private String word;
    public Count(){}
    public Count(String word){
        this.word = word;
    }

    public int getNum(char ch)
    {
        int n=0;
        for(int i = 0;i<word.length();i++)
        {
            if (word.charAt(i) == ch)
                n++;
        }
        return n;
    }
}

class NumArray {
    int[] numsArray;
    public NumArray(int[] nums) {
        int length = nums.length;
        numsArray = new int[length+1];
        for(int i=1;i<=length;i++)
            numsArray[i] = numsArray[i-1]+nums[i-1];

        for(int j:numsArray)
            System.out.println(j);
    }

    public int sumRange(int left, int right) {
        return numsArray[right+1]-numsArray[left];
    }
}

class Solution {

    public String largestNumber(int[] cost, int target) {
        String ans = "";
        int len = cost.length;
        int[] dp = new int[target+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i=0;i<9;i++)
        {
            for (int j=cost[i];j<=target;j++)
            {
                dp[j] = Math.max(dp[j], dp[j-cost[i]]+1);
            }
        }


        for (int i=0;i<=target;i++){
            System.out.println(i+" \t"+dp[i]);
        }

        //如果不能cost的值无法组成target，返回"0"
        if (dp[target] == 0)
            return "0";

        //在满足条件的组合中找到最大数，优先选择最长的，长度相同选拼接起来的数字更大的，拼接数字时，cost数组从后向前遍历
        int j = target;
        for(int i=len-1;i>=0;i--)
        {
            while ((j>=cost[i]) && (dp[j] == dp[j-cost[i]]+1) )
            {
                ans += String.valueOf(i+1);
                j = j-cost[i];
            }
        }

        return ans;
    }

    public int numSquares(int n) {
        int s = (int)Math.sqrt(n);

        int[] dp = new int[n+1];
        int[] nums = new int[s];
        for(int i=0;i<s;i++)
            nums[i] = (i+1)*(i+1);

        Arrays.fill(dp,n+1);

        dp[0] = 0;

        for (int i=1;i<=n;i++)
        {
            for (int j=0;j<s;j++)
            {
                if (i>=nums[j])
                    dp[i] = Math.min(dp[i], dp[i-nums[j]]+1);
            }
        }

//        for (int i=0;i<=n;i++)
//            System.out.println("i-"+i+" \t"+dp[i]);
        return dp[n];
    }

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for (int c : coins)
        {
            for (int i=c;i<=amount;i++)
                dp[i] += dp[i-c];
        }
        return dp[amount];
    }

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int len = group.length;
        int mod = (int)1e9+7;
        //三维分别表示可供选择的工作数量（可选择，也就是对于某些工作可做可不做）、投入多少人（不一定全部用光）、至少可以实现多少利润（大于等于0）
         int[] [] [] dp = new int[len+1][n+1][minProfit+1];
         //处理边界条件
         dp[0][0][0] = 1;

         for (int i=1;i<=len;i++){
             for (int j = 0;j<=n;j++) {
                 for (int k=0;k<=minProfit;k++) {
                     if (j<group[i-1])//如果当前的人数不能做第i份工作，则方案数等于上一份工作的方案数
                         dp[i][j][k] = dp[i-1][j][k];
                     else//如果可以做第i份工作，则当前工作的方案数等于上一份工作的方案数+上一份工作中满足人数不超过j-group[i-1]（表示多份工作可以一起做）、且利润不少于0的方案数量（利润等于0表示只做了当前工作，大于0表示除了当前工作还做了其他工作）
                        dp[i][j][k] = (dp[i-1][j][k] + dp[i-1][j-group[i-1]][Math.max(0,k-profit[i-1])]) % mod;
//                     System.out.print(k+"---"+dp[i][j][k]+" ");
                 }
//                 System.out.println();
//                 System.out.println("人员"+j);
             }

//             System.out.println("工作");
         }

         int sum = 0;
         //统计满足条件的方案数量即在len份工作中，利润不少于miniProfit的方案数量
         for (int j=0;j<=n;j++){
//             System.out.println(dp[len][j][minProfit]);
             sum = (sum+dp[len][j][minProfit])%mod;
        }
         return sum;
    }


    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i=1;i<=amount;i++){
            for (int j=0;j<coins.length;j++)
            {
                if (coins[j]<=i)
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);

            }
            System.out.println(i+" "+dp[i]);
       }
        return dp[amount] > amount ? -1: dp[amount];
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        //为了方便判断是否可以由数组内元素组成,使用set存储,从而可以直接使用contains函数进行判断,无需手写代码
        Set<String> wordSet = new HashSet<>();
        for (String i : wordDict)
            wordSet.add(i);
        int len = s.length();
        //因为输出结果是布尔值的,所以使用boolean数组
        boolean[] dp = new boolean[len+1];
        //边界处理
        dp[0] = true;
        for(int i=1;i<=len;i++)
        {
            for (int j=0;j<i;j++){
                //因为是使用空格进行划分的,所以首先要判断区间[j,i]的字符串是否包含"空格"--也就是是否已经被划分为另一个单词了
//                System.out.println(s.substring(j,i));
                if (dp[j] == true && wordSet.contains(s.substring(j,i)))
                    dp[i] = true;
            }
//                System.out.println(i+" "+dp[i]);
        }
        return dp[len];
    }

    //因为数组内的每个元素只有两种选择--正或负，所以数据量只有2的20次方，100万多一点，没有超过1e7，所以可以直接暴力求解
    int count;

    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        backward(nums, target, 0,0);
        return count;
    }
    public void backward(int[] nums, int target, int index, int sum)
    {
        if (index == nums.length)
        {
            if (sum == target)
                count++;
            return;
        }
        else
        {
            backward(nums, target, index+1, sum + nums[index]);
            backward(nums, target, index+1, sum - nums[index]);
        }
    }
//    public int findTargetSumWays(int[] nums, int target)
//    {
//        int sum = 0;
//        for (int i: nums)
//            sum += i;
//        if ((sum-target)<0 || (sum-target)%2!=0)
//            return 0;
//        int neg = (sum-target)/2;
//        int[] dp = new int[neg+1];
//        dp[0] = 1;
//        for (int i: nums){
//            for (int j=neg;j>=i;j--){
//                dp[j] += dp[j-i];
//            }
//        }
//        return dp[neg];
//
//
//    }


    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

       int sign = 0;
    //不动
        for (int i=0,c=n-1;i<n;i++,c--){//行
            for (int j=0,r=n-1;j<n;j++,r--)//列
            {
                if (mat[i][j] != target[i][j])
                {
                    sign=1;
                    break;
                }
            }
            if (sign==1)
                break;
        }
        if (sign == 0)
            return true;

    //上
        sign=0;
        for (int i=0,c=n-1;i<n;i++,c--){//行
            for (int j=0,r=n-1;j<n;j++,r--)//列
            {
//                System.out.println(target[r][i]);
                if (mat[i][j] != target[r][i])
                {
                    sign=1;
                    break;
                }
            }
            if (sign==1)
                break;
        }
        if (sign == 0)
            return true;
//下
        sign=0;
        for (int i=0,c=n-1;i<n;i++,c--){//行
            for (int j=0,r=n-1;j<n;j++,r--)//列
            {
//                System.out.println(target[j][c]);
                if (mat[i][j] != target[j][c])
                {
                    sign=1;
                    break;
                }
            }
            if (sign==1)
                break;
        }
        if (sign == 0)
            return true;

        sign=0;
        for (int i=0,c=n-1;i<n;i++,c--){//行
            for (int j=0,r=n-1;j<n;j++,r--)//列
            {
                System.out.println(target[c][r]);
                if (mat[i][j] != target[c][r])
                {
                    sign=1;
                    break;
                }
            }
            if (sign==1)
                break;
        }
        if (sign == 0)
            return true;


        return false;
    }


    public int minFlips(String s) {
        int len = s.length();
        String ss = s+s;
        int[] dp1 = new int[len*2];
        int[] dp2 = new int[len*2];
        //判断1010的情况
        dp1[0] = ss.charAt(0) == '1'?0:1;
        //判断0101的情况
        dp2[0] = ss.charAt(0) == '0'?0:1;

        for (int i=1;i<len*2;i++)
        {
            if (i%2==0){
                dp1[i] = ss.charAt(i) == '1'?dp1[i-1]:dp1[i-1]+1;
                dp2[i] = ss.charAt(i) == '0'?dp2[i-1]:dp2[i-1]+1;
            }
            else
            {
                dp1[i] = ss.charAt(i) == '0'?dp1[i-1]:dp1[i-1]+1;
                dp2[i] = ss.charAt(i) == '1'?dp2[i-1]:dp2[i-1]+1;
            }
        }
        for (int i: dp1)
            System.out.println("dp1 " + i);
        for (int i: dp2)
            System.out.println("dp2 " + i);

        int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
        for (int j=0;j<len;j++){
            a = Math.min(dp1[j+len]-dp1[j], a);
            b = Math.min(dp2[j+len]-dp2[j], b);
        }

        return Math.min(a,b);
    }

    public int reductionOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for (int i: nums){
            int c = map.get(i)==null? 1:map.get(i)+1;
            map.put(i,c);
//            System.out.println("i"+map.get(i));
        }


        int[] key = new int[map.size()];
        int j = 0;
        for (int i : map.keySet()){
            key[j] = i;
//            System.out.println(map.get(key[j]));
            j++;
        }
        Arrays.sort(key);
        for (int i=1;i<map.size();i++)
        {
//            System.out.println(ans);
            ans += map.get(key[i]) * i;
        }



        return ans;
    }




    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode h = ans;

        while(h.next!=null)
        {
            if (h.next.val == val)
            {
                h.next = h.next.next;
            }
            else
                h = h.next;
        }
        return ans.next;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //暴力
//        for (ListNode i = headA;i!=null;i = i.next)
//            for (ListNode j = headB;j!=null;j = j.next)
//                if (i.equals(j))
//                    return i;
        //因为数据保证不会出现环，也就表示只要出现相等的情况，后续的数据都是相等的
        //因此，如果A长度为a,B长度为b，且a>b，那么在A的前a-b个元素中，一定不存在和B相等的情况

        //差值法
//        int lenA = 0;
//        int lenB = 0;
//        ListNode a = headA;
//        ListNode b = headB;
//        while (headA!=null)
//        {
//            lenA++;
//            headA = headA.next;
//        }
//        while (headB!=null)
//        {
//            lenB++;
//            headB = headB.next;
//        }
//
//        int count = Math.abs(lenA-lenB);
//        while (count>0)
//        {
//            if (lenA>lenB)
//                a = a.next;
//            else
//                b = b.next;
//            count--;
//        }
//        while(a!=null && b!=null)
//        {
//            if (a.equals(b))
//                return a;
//            a = a.next;
//            b = b.next;
//        }

        //哈希表法
        Set<ListNode> set = new HashSet<>();
        while (headA!= null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB!=null)
        {
            if (set.contains(headB))
                return headB;
            headB = headB.next;
        }

        return null;
    }

    public int findMaxLength(int[] nums) {
        int ans = 0;
        int len = nums.length;
        int[] s = new int[len+1];
        for (int i=1;i<=len;++i)
        {
            s[i] = s[i-1] + (nums[i-1]==1?1:-1);
        }

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i=2;i<=len;++i)
        {
            if (!map.containsKey(s[i-2]))
                map.put(s[i-2],i-2);
            if (map.containsKey(s[i]))
                ans = Math.max(ans, i-map.get(s[i]));
        }
        return ans;
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        System.out.println(len);
        if (len<2)
            return false;

        //前缀和
        int [] s = new int[len+1];
        for (int i=1;i<=len;++i)
            s[i] = s[i-1]+nums[i-1];
        //因为子数组的长度至少为2，所以边界设置是个问题
        HashSet<Integer> set = new HashSet<>();
        for(int i=2;i<=len;++i)
        {
            set.add(s[i-2]%k);
            if (set.contains(s[i]%k))
                return true;
        }

        return false;
    }

    public int search(int[] nums, int target) {
        int r = nums.length-1;
        int l=0;
        while (l<r)
        {
            int mid = l + (r-l)/2;
//            System.out.println(mid);
            if (target == nums[mid])
                return mid;
            else
            {
                if (target > nums[mid])
                    l = mid+1;
                else
                    r = mid-1;
            }
        }

        return nums[r]==target?r:-1;
    }

    public int minPairSum(int[] nums) {
        int ans = 0;
        int len = nums.length;
        Arrays.sort(nums);
        int l =0,r=len-1;
        while (l<r)
        {
            ans = Math.max(ans,nums[l]+nums[r]);
            l++;
            r--;
        }
        return ans;
    }


    public int countGoodSubstrings(String s) {
        int len = s.length();
        if (len< 3)
            return 0;
        int ans  = 0;
        int l = 0, r = 0;
        //设置一个滑动窗口，每次移位的距离根据窗口内的元素决定，如果前两个相同，则移2位，三个都相同，移3位，否则移1位
        int i = 0;
        while(i< len-2)
        {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if (a == b && b == c){
                i+=2;
            }
            else
            {
                if (a!= b && b!= c && c != a)
                    ans++;
                i++;
            }

        }
        return ans;
    }


    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int len1 = candiesCount.length;
        int h = queries.length;
        int w = queries[0].length;
        boolean[] ans = new boolean[h];


        //对candies的元素和进行预处理，方便计算
        long[] sum = new long[len1+1];
        for (int i=1;i<=len1;++i){
            sum[i] = sum[i-1]+ candiesCount[i-1];
//            System.out.println(sum[i]);
        }


        long earlierDay = 0;
        for (int i=0;i<h;++i)
        {
            int type = queries[i][0];
            int day = queries[i][1] + 1;
            int daily = queries[i][2];
            earlierDay = (long) (Math.floor(sum[type] / daily) + 1);
            ans[i] = (earlierDay <= day && day <= sum[type+1]);
        }
        return ans;
    }

    public boolean isPowerOfFour(int n)
    {
        if(n<1)
            return false;
        int i=0;
        while(i<16)
        {
            int s = (int) Math.pow(4,i);
            if (s > n)
                return false;
            else if (s == n)
                return true;
            else
                i++;
        }
        return false;
    }

    //使用服务器处理任务
    public int[] assignTasks(int[] server, int[] tasks)
    {
        //获取两个数组的长度，并初始化结果数组
        int len1 = server.length;
        int len2 = tasks.length;
        int[] ans = new int[len2];//由题目可知，结果数组的长度和task相同

        //设置两个优先队列分别存储空闲服务器和工作中的服务器，在程序运行过程中，两者的信息根据要求不断进行交换

        //存储空闲服务器，使用小根堆，使用数组存储服务器信息，数组中的前三个元素分别对应服务器的编号、权值、多少时间后空闲
        //根据权值进行排序入堆，使用Comparator实现比较的过程
        PriorityQueue<int[]> free = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                //根据要求，如果权值相等，按照下标从小到大排列，如果权值不等，按照权值从小到大排列
                return (ints[1] == t1[1])? ints[0] - t1[0] :  ints[1] - t1[1];
            }
        });

        //根据要求初始化空闲服务器优先队列
        for (int i=0;i<len1;i++)
            free.offer(new int[]{i,server[i],0});

        //存储工作中的服务器，使用小根堆，数组中的前三个元素分别对应服务器的编号、权值、运行时间
        //根据 多少时间后空闲 进行排序入堆，使用Comparator实现比较的过程
        PriorityQueue<int[]> busy = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                //根据要求，根据 运行时间 从小到大排列，如果运行时间相等，则按照权值排列，权值相等按照下标排列
                return (ints[2] == t1[2])? ( (ints[1] == t1[1])? ints[0] - t1[0] :  ints[1] - t1[1] ) : ints[2] - t1[2];
            }
        });

        //开始进行任务的分配
        for(int i=0;i<len2;i++)
        {

            //如果存在工作中的服务器已经完成任务，则进入空闲状态
            while(!busy.isEmpty() && busy.peek()[2] <= i)
            {
                free.offer(busy.poll());
            }
            //如果当前没有空闲的服务器，则把运行时间最少的服务器————busy堆顶的服务器拿来使用，
            // 并更新运行时间（因为除了第一轮之外，剩下的时候都是把busy的堆顶元素拿来直接用，所以这里的运行时间没有实际意义，只是用来区分先后顺序而已）
            if(free.isEmpty())
            {
                int[] s =  busy.poll();//获取busy堆顶元素
                s[2] += tasks[i]; //更新运行时间
                ans[i] = s[0];//把服务器的下标值存入结果数组
                busy.offer(s);//重新存入工作服务器堆中
            }
            else
            {
                //如果有空闲的服务器，则直接从空闲服务器堆顶出堆，直接使用
                int[] s = free.poll();
                s[2] = i + tasks[i]; // 设置运行时间
                ans[i] = s[0];
                busy.offer(s);
            }

        }



        return ans;
    }




//    public int[] assignTasks(int[] server, int[] tasks)
//    {
//        int len1 = server.length;
//        int len2 = tasks.length;
//
//        int[] ans = new int[len2];
//
//        //存储空闲的服务器
//        PriorityQueue<serverState> idle = new PriorityQueue<>((a,b)->{
//            return (a.weight == b.weight)? a.idx - b.idx : a.weight- b.weight;
//        });
//
//        for (int i=0;i<len1; i++)
//            idle.offer((new serverState(i,server[i], 0)));
//
//        //存储工作的服务器
//        PriorityQueue<serverState> busy = new PriorityQueue<>((a,b)->{
//            return (a.ending == b.ending)? ((a.weight == b.weight)? a.idx - b.idx : a.weight-b.weight ) : a.ending-b.ending ;
//        });
//
//        for (int j=0; j< len2; ++j)
//        {
//            while (!busy.isEmpty() && busy.peek().ending <= j)
//                idle.add(busy.poll());
//
//            if (idle.isEmpty())
//            {
//                serverState top = busy.poll();
//                top.ending += tasks[j];
//                ans[j] = top.idx;
//                busy.offer(top);
//            }
//            else
//            {
//                serverState serv = idle.poll();
//                serv.ending = j+ tasks[j];
//                ans[j] = serv.idx;
//                busy.offer(serv);
//            }
//
//        }
//
//        return ans;
//    }

    //超时  改用优先队列，因为要使用堆来做
//    int[] server_busy;
//    public int[] assignTasks(int[] server, int[] tasks)
//    {
//        int len1 = server.length;
//        int len2 = tasks.length;
//
//        int [] ans = new int[len2];
//        server_busy = new int[len1];
//
//        int time = 0;
//        int i=0;
//        while(true){
//
//                for (int j : server_busy)
//                    System.out.print(j+ " ");
//                System.out.println();
//                int index = checkServer(server); // 获取当前空闲服务器中的最小权重的索引值
//                while (time>=i &&  i< len2)
//                {
//                    index = checkServer(server);
//                    if (index != -1){
//                        server_busy[index] = tasks[i];//各选择的服务器分配任务并开始工作计时
//                        System.out.println(index);
//                        ans[i] = index;
//                        i++;
//                    }
//                    else
//                        break;
//                }
//
//
//            serverBusy();//工作的服务器时间衰减
//            if (i>= len2)
//                break;
//            time++;
//        }
//
//        return ans;
//    }
//
//    public void serverBusy()
//    {
//        for (int i=0;i<server_busy.length;i++)
//        {
//            if (server_busy[i] > 0)
//                server_busy[i] -= 1;
//            if (server_busy[i] < 0)
//                server_busy[i]=0;
//        }
//    }
//
//    public int checkServer(int[] s)
//    {
//        int min = 200001;
//        int index = -1;
//        for (int i=0;i<s.length;i++)
//        {
//            if (server_busy[i]==0 && min > s[i])
//            {
//                min = s[i];
//                index = i;
//            }
//        }
//        return index;
//    }

    //周赛第四题 使用dp做
    public int minSkips(int[] dist, int speed, int hoursBefore) {
        int res = 0;
        int sum = 0;
        for(int i: dist)
            sum += i;
        //不休息也赶不到
        if(sum > speed * hoursBefore)
            return -1;

        sum = 0;
        for(int i: dist)
        {
            double temp = 1.0 * i / speed;
            sum += temp;
            if (temp / 1.0 == 0.0)
                continue;

        }

        return res;
    }


    //可以了
    public String maxValue(String n, int x)
    {
        int  pos = 0;
        if(n.charAt(0) != '-')
        {
            while(pos<n.length() && (n.charAt(pos)-'0') >= x)
                pos++;
        }
        else{
            pos++;
            while(pos<n.length() && (n.charAt(pos)-'0') <= x)
                pos++;
        }
//        System.out.println(pos);
//        System.out.println(n.substring(0,pos));
//        System.out.println(n.substring(pos));
        return n.substring(0,pos)+ x + n.substring(pos);
    }

    public boolean isSumEqual(String fw,String sw, String t)
    {
        int n1=0;
        int n2 = 0;
        int ans = 0;
        for(int i: fw.toCharArray())
        {
            n1 = n1*10 + (i-'a');
        }
        for(int i: sw.toCharArray())
        {
            n2 = n2*10 + (i-'a');
        }
        for(int i: t.toCharArray())
        {
            ans = ans*10 + (i-'a');
        }
        return (n1+n2)==ans;
    }


    public boolean isPowerOfTwo(int n) {
        for(int i=30;i>=0;i--)
        {
            if (n>(int)(Math.pow(2,i)))
                break;
            if (n==(int)(Math.pow(2,i)))
                return true;
        }
        return false;
    }


    public int totalHammingDistance(int[] nums)
    {
        int res = 0;

        //因为汉明距离计算的是两个数字的二进制之间不同位置的数量，所以在对比数组内全部数字对应位置，得到整体的汉明距离和
        for (int i=30;i>=0;i--)
        {
            int count = 0;
            for (int j: nums)
            {
                count += ((j>>i)&1);
            }
            res += count*(nums.length-count);
        }

        return res;
    }


    public int  hD(int x, int y)
    {
        int ans = 0;
        while((x|y)!=0)
        {
            ans += (x&1) ^ (y&1);
            x >>= 1;
            y >>= 1;
        }
        return ans;
    }

    public int lowBit(int x)
    {
        System.out.println("lowbit "+ (x&(-x)));
        return x & (-x);
    }

    public int hammingdistance(int x, int y)
    {
        int ans = 0;

        System.out.println(x^y);

        for(int i=x^y;i>0;i-=lowBit(i))
            ans++;
        return ans;
    }

    public int hammingDistance(int x, int y)
    {
        int count = 0;
        for(int i=30;i>=0;i--)
        {
            if((x>>i & 1) != (y>>i & 1))
                count++;
        }
        return count;
    }

    public String reverseParentheses(String s)
    {
        StringBuffer sb = new StringBuffer();
        //存储最终答案
        Deque<Character> deque = new LinkedList<>();
        //辅助计算
        Deque<Character> d = new LinkedList<>();

        //首先把String中的元素依次入栈，遇到)则开始出栈，直至遇到(，然后再入栈
        for(Character ch : s.toCharArray())
        {
            if (ch !=')')
                deque.addLast(ch);
            else
            {
                while(deque.getLast()!='(')
                    d.addLast(deque.pollLast());
                deque.pollLast();
                while(!d.isEmpty())
                    deque.addLast(d.pollFirst());
            }
        }
        while (!deque.isEmpty())
            sb.append(deque.pollFirst());

        return sb.toString();
    }


    public int minChanges(int[] nums, int k) {
        int n = nums.length;
        int inf = 100000000;//这里不能设置Integer.MAX_VALUE，因为在计算过程中会有在此基础上进行相加的操作，如果使用Integer.MAX_VALUE的话会溢出

        //把题目分解为m行或m-1行相同的数据，首行异或值为0即达到题目要求
        //所以每行有k个元素，因为nums[i]的值不超过2的10次方，所以设置为1024
        //dp[i][xor]表示前i列的异或值为xor时，所需要的最小更改数
        int [][] dp = new int[k+1][1024];



        int m = (n+k-1)/k;//获取分组数，注意，最后一组可能是不足k个的
        int sum=0; //记录最小的更改次数
        int minv=inf;

        for(int i=0;i<=k;i++)
            Arrays.fill(dp[i],inf);//把dp数组内的所有元素全部填充为inf

        dp[0][0] = 0;

        for (int i = 1; i <= k; i++) {//按列进行操作
            int len=m;//获取最大行数

            if(n%k!=0&&n%k<i)//如果n不是k的整数倍，检测当前列是否满足最大的行数，不满足的话则行数-1
                len--;

            //情况一
            //因为我们最终的目的是把所有行（或者是除了最后一行外的所有行）变成相同的，为了达到最小改变次数的效果，所以每次根据每列的众数进行修改，从而实现最小的改变次数
            int s[]=new int[1024];
            for (int j = 0; j < len; j++) {
                s[nums[j*k+i-1]]++;//获取当前列中每个数字的出现频率
            }
            int maxv=0;
            for (int j = 0; j < 1024; j++) {
                if(maxv<s[j])
                    maxv=s[j];//获取最大出现频率，最后的s[maxv]即为当前列的众数
            }
            if(minv>maxv)
                minv=maxv;//minv存储的是所有列中众数的最小数量

            sum+=len-maxv;//获取当前列的改变次数（即把当前列全部改为当前列众数所需要的次数）

            //情况二
            for (int j = 0; j < len; j++) {
                int x=nums[j*k+i-1];//获取当前列、当前位置对应的元素
                int cost=len-s[x];//如果把当前列全部改为当前元素所需要的更改次数
                for (int u = 0; u < 1024; u++) {
                    //通过dp，获取前i列的异或值为0-1023时所需要的更改次数
                    //其中dp[i][u]因为前面的初始化填充，此时为inf
                    //因为异或操作的性质a^b=c则b^c=a，所以使用x^u获取前一列对应的异或值，再加上cost即为对应的前一列与x异或得到u，然后把当前列全部改为x 所需要的更改次数
                    dp[i][u]=Math.min(dp[i][u],dp[i-1][x^u]+cost);
                }
            }
        }
        //dp[k][0]前面定义dp时已经说过，是前k列异或值为0的最小更改次数
        //sum是存在的每一列更改为当前列众数所需要的次数，
        // 为什么要加上minv呢？
        // 因为我们在获取sum时只考虑了最小的条件，没有考虑到异或值为0，因为minv保存的是所有列中中众数的最小数量，也就是说当前列更改了len-minv次，加上minv表示当前列全部进行了修改，
        // 假设其余k-1列的异或和为xor_1，我们一定可以找到一个xor_2使得xor_1 ^ xor_2 = 0，因为可以对整列进行修改，也就保证了异或和一定为0
        return Math.min(sum+minv,dp[k][0]);
    }


    public boolean isSubsequence(String s, String t) {
        int index = 0;
        int count = 0;
        for(Character ch : s.toCharArray())
        {
            if(t.indexOf(ch,index)!=-1)
            {
                index = t.indexOf(ch,index)+1;
                if (index>t.length())
                    return false;
                System.out.println(index);
                count++;
            }
            else
                return false;
        }
        if (count!=s.length())
            return false;
        return true;
    }

    public static int strangePrinter(String s)
    {
        int len = s.length();
        int[][]dp  = new int[len][len];

        for (int i=len-1;i>=0;i--)
        {
            dp[i][i] = 1;
            for (int j=i+1;j<len;j++){
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i][j-1];
                else{
                    int val = Integer.MAX_VALUE;
                    for (int k=i;k<j;k++)
                         val = Math.min(val, dp[i][k]+dp[k+1][j]);
                    dp[i][j] = val;
                }
            }
        }
        return dp[0][len-1];
    }




    Trie root1 = new Trie();
    static int HighBit = 30;
    public int[] maximizeXor(int[] nums, int[][] queries)
    {
        int len = queries.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);


        Map<int[], Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
            map.put(queries[i], i);
        // 首先对数字进行排序
        Arrays.sort(nums);
        Arrays.sort(queries,(a,b)->a[1]-b[1]);
        //构建字典树，因为此时的数字是递增的，所以字典树也是有规律的
        int index = 0;
        int x = -1;
        int j=0;
        while(j < nums.length && index < len )
        {
            if (nums[j] <=queries[index][1]){
                add_XOR(nums[j]);
                x = Math.max(x, check_XOR(queries[index][0]));
                j++;
            }
            else {
                x = Math.max(x, check_XOR(queries[index][0]));
                res[map.get(queries[index])] = x;
                x=-1;
                index++;
//                System.out.println("j "+j);
            }
        }
        while (index<len){
            res[map.get(queries[index])] = check_XOR(queries[index][0]);
            index++;
        }


        return res;
    }

    public int check_XOR(int num)
    {
        Trie cur = root1;
        int x = 0;
        for (int k = HighBit; k >= 0; --k) {
            int bit = (num >> k) & 1;
            if (bit == 0) {
                // a_i 的第 k 个二进制位为 0，应当往表示 1 的子节点 right 走
                if (cur.right != null) {
                    cur = cur.right;
                    x = x * 2 + 1;//根据字典树的特性，如果当前位置存在1，因为是从高位开始遍历的，所以先把x*2，然后加1
                } else {
                    cur = cur.left;
                    x = x * 2;//如果当前位置为0，即只存在左子树，则仅仅把x*2
                }
            } else {
                // a_i 的第 k 个二进制位为 1，应当往表示 0 的子节点 left 走
                if (cur.left != null) {
                    cur = cur.left;
                    x = x * 2 + 1;
                } else {
                    cur = cur.right;
                    x = x * 2;
                }
            }
        }
        return x;
    }

    public void add_XOR(int num)
    {
        Trie cur = root1;//获取根节点
        for (int k = HighBit; k >= 0; --k) {
            int bit = (num >> k) & 1;
            if (bit == 0) {//从二进制的第31位开始，逐个检验当前输入的二进制形式在当前位置是否为1，为1则存在右子树，为0存在左子树
                if (cur.left == null) {//如果没有左子树，则进行创建
                    cur.left = new Trie();
                }
                cur = cur.left;
            }
            else {
                if (cur.right == null) {
                    cur.right = new Trie();
                }
                cur = cur.right;
            }
        }
    }


    public boolean xorGame(int[] nums) {
        int[] s = new int[nums.length+1];
        for (int i=1;i<=nums.length;i++)
            s[i] = s[i-1] ^ nums[i-1];

        return s[nums.length]==0 || nums.length % 2 == 0;
    }




    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1+1][len2+1];

        if (nums1[0] == nums2[0])
            dp[1][1] = 1;



        for(int i=1;i<=len1;i++){
            for (int j=i;j<=len2;j++)
            {
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if (nums1[i-1] == nums2[j-1])
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + 1);
            }
        }
        for(int i=0;i<=len1;i++){
            for (int j=0;j<=len2;j++)
                System.out.print(dp[i][j] + " ");
            System.out.println();
        }
        return dp[len1][len2];
    }


        public List<String> topKFrequent(String[] words, int k)
    {
        Map<String,Integer> map = new HashMap<>();
        int len = words.length;
        for (int i=0;i<len;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        // 使用List进行排序
//        List<String> list = new ArrayList<>();
//        for(Map.Entry<String, Integer> i : map.entrySet())
//            list.add(i.getKey());
//
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return map.get(s) == map.get(t1)?s.compareTo(t1):map.get(t1)-map.get(s);
//            }
//        });
//
//        return list.subList(0,k);
        //使用优先队列（堆）
        PriorityQueue<Object[]> p = new PriorityQueue<>(k, (a,b)->{
            int cp1 = (Integer) a[0], cp2 = (Integer) b[0];
            if (cp1 != cp2)
                return cp1-cp2;
            String word1 = (String) a[1], word2 = (String) b[1];
            return word2.compareTo(word1);
        });

        //向优先队列内添加元素
        for (String s : map.keySet())
        {
            int val = map.get(s);
            if (p.size() < k)//若优先队列的大小小于k时，直接入堆
                p.add(new Object[]{val, s});
            else
            {
                Object[] o = p.peek();//获取堆顶元素，即val最小的
                if(val > (Integer)o[0]){//如果当前元素的词频大于堆顶元素，则入堆
                    p.poll();//堆顶元素出堆
                    p.add(new Object[]{val, s});
                }
                else if(val == (Integer)o[0])//如果当前元素的词频与堆顶元素相等，则比较字典序
                {
                    String word = (String) o[1];
                    if (s.compareTo(word) < 0)//如果当前元素的字典序在堆顶元素的前面，则入堆
                    {
                        p.poll();//堆顶元素出堆
                        p.add(new Object[]{val, s});
                    }
                }
            }
        }

        //把优先队列内的元素输出到list中
        List<String> list = new ArrayList<>();
        while (!p.isEmpty())
            list.add((String) (p.poll()[1]));//把优先队列中的元素依次输出到list中
        Collections.reverse(list); //因为优先队列是小根堆，所以要反转一下

        return list;
    }


    public int kthLargestValue(int[][] matrix, int k) {
        int col = matrix[0].length;
        int row = matrix.length;
        System.out.println(row+" "+col );
        int [][] res = new int[row][col];
        res[0][0] = matrix[0][0];

        int [] a = new int[row*col];
        int a_index = 1;
        a[0] = res[0][0];
        //处理边界
        for(int i=1;i<col;i++){
            res[0][i] = res[0][i-1] ^ matrix[0][i];
            a[a_index] = res[0][i];
            a_index++;
        }

        for(int j=1;j<row;j++){
            res[j][0] = res[j-1][0] ^ matrix[j][0];
            a[a_index] = res[j][0];
            a_index++;
        }


        //获取完整的异或后的矩阵
        for(int i=1;i<row;i++)
            for(int j=1;j<col;j++){
                res[i][j] = res[i-1][j-1] ^ res[i-1][j] ^ res[i][j-1] ^ matrix[i][j];
                a[a_index] = res[i][j];
                a_index++;
            }

        Arrays.sort(a);
            for (int i : a)
                System.out.print(i + " ");


        return a[row*col-k];
    }

    public int countTriplets(int [] arr)
    {
        int res = 0;

        int [] s = new int[arr.length+1];

        for(int i=1;i<=arr.length;i++)
            s[i] = s[i-1]^arr[i-1];

//        for (int i=0;i<=arr.length;i++)
//            System.out.println(s[i]);

        for(int i=0;i<arr.length;i++)
            for (int j=i+1;j<arr.length;j++)
                for (int k=j;k<arr.length;k++)
                {
                    if ((s[k+1]^s[j-1]) == (s[i-1]^s[j-1]))
                        res++;
                }

        return res;
    }






    // 字典树的根节点
    Trie root = new Trie();
    // 最高位的二进制位编号为 30
    static final int HIGH_BIT = 30;

    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int x = 0;
        for (int i = 1; i < n; ++i) {
            // 将 nums[i-1] 放入字典树，此时 nums[0 .. i-1] 都在字典树中
            add(nums[i - 1]);
            // 将 nums[i] 看作 ai，找出最大的 x 更新答案
            x = Math.max(x, check(nums[i]));
        }
        return x;
    }

    public void add(int num) {
        Trie cur = root;//获取根节点
        for (int k = HIGH_BIT; k >= 0; --k) {
            int bit = (num >> k) & 1;
            if (bit == 0) {//从二进制的第31位开始，逐个检验当前输入的二进制形式在当前位置是否为1，为1则存在右子树，为0存在左子树
                if (cur.left == null) {//如果没有左子树，则进行创建
                    cur.left = new Trie();
                }
                cur = cur.left;
            }
            else {
                if (cur.right == null) {
                    cur.right = new Trie();
                }
                cur = cur.right;
            }
        }
    }

    public int check(int num) {//模拟异或的过程
        Trie cur = root;
        int x = 0;
        for (int k = HIGH_BIT; k >= 0; --k) {
            int bit = (num >> k) & 1;
            if (bit == 0) {
                // a_i 的第 k 个二进制位为 0，应当往表示 1 的子节点 right 走
                if (cur.right != null) {
                    cur = cur.right;
                    x = x * 2 + 1;//根据字典树的特性，如果当前位置存在1，因为是从高位开始遍历的，所以先把x*2，然后加1
                } else {
                    cur = cur.left;
                    x = x * 2;//如果当前位置为0，即只存在左子树，则仅仅把x*2
                }
            } else {
                // a_i 的第 k 个二进制位为 1，应当往表示 0 的子节点 left 走
                if (cur.left != null) {
                    cur = cur.left;
                    x = x * 2 + 1;
                } else {
                    cur = cur.right;
                    x = x * 2;
                }
            }
        }
        return x;
    }

    public String intToRoman(int num)
    {
        StringBuffer sb = new StringBuffer();
        int[] value = new int[]{     1000,  900, 500,  400,  100,   90,  50,   40,  10,    9,   5,    4,   1};
        String[] roman = new String[]{"M", "CM", "D", "CD",  "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i=0;i<value.length;i++)
        {
            int val = value[i];
            String  rom = roman[i];
            while (num>=val)
            {
                sb.append(rom);
                num -= val;
            }
        }

        return sb.toString();
    }

    public int numWay(int steps, int arrlen)
    {
        if(arrlen == 1)
            return steps;

        int mod = 1000000007;

        int[][] dp = new int[arrlen][steps+1];
        dp[0][1]=1;
        dp[1][1]=1;

        for(int i=2;i<=steps;i++)
        {
            dp[0][i] = (dp[0][i-1] + dp[1][i-1]) % mod;
            for(int j=1;j<arrlen-1;j++)
                dp[j][i] = ((dp[j-1][i-1] + dp[j][i-1]) % mod + dp[j+1][i-1]) % mod;
            dp[arrlen-1][i] = (dp[arrlen-1][i-1] + dp[arrlen-2][i-1]) % mod;


//            for(int s=0;s<arrlen;s++)
//                System.out.print(dp[s][i] + " ");
//            System.out.println();
        }

        return (dp[0][steps])%mod;
    }




    int n;
    int [] c = new int[30005];

    public  int lowbit(int x){
        return x & (-x);
    }

    public  void add(int x, int u)
    {
        for (int i=x; i<=n;i+= lowbit(i))
            c[i] ^= u;
    }
    public  int querry(int x)
    {
        int ans = 0;
        for (int i=x;i>0;i-=lowbit(i))
            ans ^= c[i];
        return ans;
    }

    public  int[] xorQueries(int[] arr, int[][] queries) {
        int len = queries.length;
        n = arr.length;

        int[] result = new int[len];

        for(int i=1;i<=n;i++)
            add(i,arr[i-1]);



      for (int i = 0;i<len;i++)
          System.out.println((querry(queries[i][0]) + " "+querry(queries[i][1]+1)));
            //result[i]= querry(queries[i][0]) ^ querry(queries[i][1]+1);

        return result;
    }

    //前缀和
//    public static int[] xorQueries(int[] arr, int[][] queries) {
//        int len = queries.length;
//        int len2 = arr.length;
//        int[] result = new int[len];
//        int[] s = new int[len2+1];
//        for (int i=1;i<=len2;i++)
//            s[i]=s[i-1]^arr[i-1];//这里的s数组内存储的是下标对应的前i个arr数组元素的异或和
//        for(int j=0;j<len;j++)
//            result[j] = s[queries[j][0]] ^s[queries[j][1]+1];
//
//
//        return result;
//    }

    //暴力解法
//    public static int[] xorQueries(int[] arr, int[][] queries) {
//        int len = queries.length;
//        int[] result = new int[len];
//
//        for(int i=0;i<len;i++)
//        {
//            int temp = 0;
//            for(int j=queries[i][0];j<=queries[i][1];j++){
//               //System.out.println(arr[j]);
//                temp ^= arr[j];
//            }
//            result[i]=temp;
//        }
//        return result;
//    }


    public int[] decode(int[] encoded)
    {
       int n = encoded.length;
       int[] res = new int[n+1];

       for(int i=0;i<n;i+=2)
           res[n] ^= encoded[i];

       for (int i=1;i<=n+1;i++)
           res[n] ^= i;
       for(int i=n-1;i>=0;i--)
           res[i] = encoded[i]^res[i+1];

       return res;
    }



    public static int minDays(int[] bloomDay, int m, int k) {
        //根据示例2，可以知道，如果bloomday的长度不足以满足条件，直接返回-1，所以提前对这种情况进行处理
        int len = bloomDay.length;
        if(len  < m * k)
            return -1;

        int max = (int) 1e9;
        int min = 1;

        //因为对于res而言，若res满足条件，则任意大于res的数都满足，所以需要找到最小的res
        while(min < max)
        {
            int mid = min + max>>1;
            if(checkDay(bloomDay,m,k,mid))//证明此时的mid满足条件，继续找是否有比mid更小的
            {
                max = mid;
            }
            else//此时的mid不满足条件，所以增大mid的值，继续测试
            {
                min = mid+1;
            }
        }
        return min;//因为res的初始值是-1，所以若找不到满足条件的，直接返回其初始值-1

    }

    // 能否在day天内制作m束花，连续k朵花制作一束花
    private static boolean checkDay(int[] bloomDay, int m, int k, int day) {
        int count = 0;
        int cur = 0;
        for(int i: bloomDay)
        {
            if(i<=day)
            {
                cur++;
                if (cur == k)
                {
                    count++;
                    cur = 0;
                    if (count==m)
                        return true;
                }
            }
            else
            {
                cur = 0;
            }
        }
        return false;
    }


    public int minimumTimeRequired(int[] jobs, int k)
    {
        int n = jobs.length;

        //使用状态压缩方法，因为对于n个工作而言，每个工作的状态只有两种——以被分配1 和 未被分配0，所以可以使用状态压缩辅助计算
        int[] sum = new int[1<<n];//因为状态压缩就是使用二进制数辅助计算，为了方便对每个工作的状态进行操作，这里设置了一个2的n次方的数组

        for(int i=1;i<(1<<n);i++)
        {
            //返回i的二进制形式中最后一个1之后0的数量，如果i为0，则返回32
            int x = Integer.numberOfTrailingZeros(i);//x得到的是当前的分配方案
//            System.out.print(x+" ");
            //输入为{1,2,4,7,8}, 2 时，x的值0 1 0 2 0 1 0 3 0 1 0 2 0 1 0 4 0 1 0 2 0 1 0 3 0 1 0 2 0 1 0

            int y = i-(1<<x);//y得到的是上一个分配方案
//            System.out.print(y+" ");
            //输入为{1,2,4,7,8}, 2 时，y的值0 0 2 0 4 4 6 0 8 8 10 8 12 12 14 0 16 16 18 16 20 20 22 16 24 24 26 24 28 28 30

            //sum数组存储的是不同分配方案下，对应的工作时长
            sum[i] = sum[y] + jobs[x];//输入为{1,2,4,7,8}, 2 时，sum数组中的值   0 1 2 3 4 5 6 7 7 8 9 10 11 12 13 14 8 9 10 11 12 13 14 15 15 16 17 18 19 20 21 22
        }

        //因为当对第i个工人分配工作时，分配方案由前i-1个工人的分配方案所决定或者说是限制，所以使用dp算法
        int [][] dp = new int[k][1<<n];//对于dp[i][j]，i表示第几个工人，j表示目前分配的方案（因为使用的是状态压缩，所以j的二进制形式表示不同的工作分配方式）

        for(int i=0; i<(1<<n); i++)//使用sum数组对dp[0]进行初始化
            dp[0][i] = sum[i];

        for(int i=1; i<k; i++)//对于k个工人，逐个分配工作
            for(int j=0; j<(1<<n);j++)//对于(1<<n)种分配方案，逐个尝试
            {
                int min = Integer.MAX_VALUE;
                for (int x = j; x != 0; x = (x-1)&j)//对前j个方案依次进行测试，得到每种分配方案的工作时长最小值
                    min = Math.min(min, Math.max(dp[i-1][j-x], sum[x]));

                dp[i][j] = min;
            }

        return dp[k-1][(1<<n)-1];//返回dp的最后一个值即为答案
    }

//    public int mininumTimeRequired(int[] jobs, int k)
//    {
//        //因为先分配工作时间长的工作会方便后续的分配，为了方便操作，对数组进行逆序
//        Arrays.sort(jobs);
//        //为了减少不必要的计算，设置上限为所有工作之和，下限为时长最大的工作
//        int l = jobs[0], r = Arrays.stream(jobs).sum();
//        while(l<r)
//        {
//            int mid = (l+r)>>1;
//            if(check(jobs, mid, k))//如果把mid作为limit可以成立，那么对于limit>mid均成立
//                r = mid;
//            else
//                l = mid + 1;
//        }
//        return l;
//    }
    public boolean check(int[] jobs, int limit, int k)
    {
        int[] workArrange = new int[k];
        return backTrack(jobs, workArrange, 0 , limit);
    }
    public boolean backTrack(int[] jobs, int[] workArrange, int i, int limit)
    {
        if (i>=jobs.length)
            return true;
        int curWork = jobs[i];
        for(int j=0;j<workArrange.length;j++)
        {
            if(workArrange[j]+curWork <= limit)
            {
                workArrange[j] += curWork;
                if (backTrack(jobs,workArrange,i+1,limit))
                    return true;
                workArrange[j] -= curWork;
            }

            if (workArrange[j] == 0 || workArrange[j]+curWork == limit)
                break;
        }
        return false;
    }

    int [] num=new int[10001];
    public int deleteAndEarn(int [] nums)
    {
        int max = -1;
        for(int i:nums)
        {
            num[i]++;
            max = Math.max(max,i);
        }
        int [] dp = new int[max+1];
        dp[1] = num[1]*1;
        dp[2]=Math.max(dp[1],num[2]*2);
        for(int i=2;i<=max;i++)
            dp[i] = Math.max(dp[i-1],dp[i-2]+num[i]*i);

        return dp[max];
    }



    int INF = Integer.MAX_VALUE/2;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int [][][] dp = new int[m+1][n+1][target+1];

        //边界条件
        for (int i=0;i<=m;i++)
            for (int j=0;j<=n;j++)
                dp[i][j][0] = INF;

        for(int i=1;i<=m;i++)
        {
            int color = houses[i-1];//获取房子的颜色，便于后续分情况判断
            for (int j=1;j<=n;j++)
            {
                for(int k=1;k<=target;k++)
                {
                    if(k>i) {//如果当前分的街区的数量大于房子的数量则该状态无效
                        dp[i][j][k]=INF;
                        continue;
                    }

                    //如果当前的房子已经上色
                    if (color != 0)
                    {
                        if (j==color)//如果当前遍历的颜色与该房子已经涂装的颜色相同，则状态转移
                        {
                            int temp = INF;
                            for(int s=1;s<=n;s++)
                            {
                                if(s!=j)
                                {
                                    temp = Math.min(temp,dp[i-1][s][k-1]);
                                }
                            }
                            dp[i][j][k] = Math.min(temp,dp[i-1][j][k]);
                        }
                        else//否则该状态无效
                        {
                            dp[i][j][k]=INF;
                        }
                    }
                    else{//当前的房子未上色
                        int cost_cur = cost[i-1][j-1];//获取为该房子涂装改颜色所需要的花费
                        int temp = INF;
                        for(int s=1;s<=n;s++)
                            if(s!=j)
                                temp = Math.min(temp,dp[i-1][s][k-1]);
                        dp[i][j][k] = Math.min(temp,dp[i-1][j][k])+cost_cur;
                    }

                }
            }

        }
        int ans = INF;
        for(int j=1;j<=n;j++)
            ans = Math.min(ans, dp[m][j][target]);
        return ans == INF?-1:ans;

    }
        public int reverse(int x) {
            if(x==0)
                return 0;
            int sign = x>0?1:-1;
            int res=0;

            int [] num = new int[10];
            for(int index=9;index>=0;index--)
            {
                num[9-index]= (int) (x / Math.pow(10,index));
                if(num[9-index]!=0)
                    x = (int) (x % (Math.pow(10,index)*num[9-index]));
            }
            for(int index=9;index>=0;index--)
            {
                if(num[index]!=0)
                    res = res*10+num[index];
            }
            return res;
        }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Arrays.sort(nums);
        int length = nums.length;


        return list;
    }
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int height = matrix.length;
        int width = matrix[1].length;

        int max = Integer.MIN_VALUE;
        for(int i=1;i<=height;i++)
        {
            for(int j=1;j<=width;j++)
            {
                int [][] dp = new int[height+1][width+1];
                dp[i][j]=matrix[i-1][j-1];
                for(int t=i;t<=height;t++)
                    for(int l=j;l<=width;l++)
                    {
                        dp[t][l]= dp[t-1][l]+dp[t][l-1]-dp[t-1][l-1]+matrix[t-1][l-1];
                        if (dp[t][l]<=k && dp[t][l]>max)
                            max = dp[t][l];
                    }
            }
        }
        return max;
    }


    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        char [] h = haystack.toCharArray(),n = needle.toCharArray();
        for(int i=0;i<=len1-len2;i++)
        {
            int a=i, b=0;
            while(b<len2 && h[a]==n[b])
            {
                a++;
                b++;
            }
            if (b==len2)
                return i;
        }
        return -1;
    }
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len==0)
            return len;
        if (len==1)
            return nums[0]==val?0:1;

        int pos=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[pos]=nums[i];
                pos++;
            }
            else
                len--;
        }



        return len;
    }
    public int removeDuplicates(int[] nums)
    {
        int len = nums.length;
        if(len==1 || len==0)
            return len;
        int pos = 0;
        int cur = 1;
        int count = 1;

        while(cur < nums.length)
        {
            if(nums[pos] == nums[cur])
            {
                if(count==1)
                {
                    nums[pos+1]=nums[cur];
                    pos++;
                    count=0;
                }
                else {
                    len--;
                }
            }
            else
            {
                nums[pos+1] = nums[cur];
                pos++;
                count=1;
            }
            cur++;
        }
        return len;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s  = new HashSet<>();
        for(int i :nums)
        {
            if(!s.add(i))
                return true;
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int length = nums.length;
        if (length==0)
            return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                if(Math.abs(map.get(nums[i])-i)==k)
                    return true;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> ts = new TreeSet<>();
        int length = nums.length;
        for(int i=0;i<length;i++)
        {
            Long c = ts.ceiling((long)nums[i] - (long)t);
            if(c!=null && c<= ((long)nums[i] + (long)t))
                return true;
            ts.add((long)nums[i]);
            if (i>=k)
                ts.remove((long)nums[i-k]);
        }
        return false;
    }
}