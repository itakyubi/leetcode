package com.wa.leetcode;

import com.wa.model.TreeNode;

/**
 * HouseRobberIII
 * 2020-11-17 18:37
 *
 * @author wuao
 */
public class HouseRobberIII {
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[]{0, 0};

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int contain = node.val + left[1] + right[1];
        int notContain = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{contain, notContain};
    }
}
