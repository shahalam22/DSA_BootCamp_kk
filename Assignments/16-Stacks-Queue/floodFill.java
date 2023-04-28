package StackAndQueue;

import java.util.Arrays;

public class floodFill {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;

        int iColor = image[sr][sc];
        if(iColor!=color) dfs(image, sr, sc, iColor, color);

        for(int i=0; i< image.length; i++){
            System.out.println(Arrays.toString(image[i]));
        }
    }

    public static void dfs(int[][] image, int sr, int sc, int iColor, int color){
        if(image[sr][sc]==iColor) {
            image[sr][sc] = color;
            if (sr >= 1) dfs(image, sr - 1, sc, iColor, color);
            if (sc >= 1) dfs(image, sr, sc - 1, iColor, color);
            if (sr + 1 < image.length) dfs(image, sr + 1, sc, iColor, color);
            if (sc + 1 < image[0].length) dfs(image, sr, sc + 1, iColor, color);
        }
    }
}
