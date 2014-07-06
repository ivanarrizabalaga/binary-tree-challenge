package com.arrizabalaga

/**
 * The challenge says that you need an static method.
 * Since building process requires some state so its better to move this into a builder object.
 */
class BuildTree {
    public static Node reconstructTree(int[][] input) {
        TreeBuilder treeBuilder=new TreeBuilder(input)
        return treeBuilder.build()
    }
}
