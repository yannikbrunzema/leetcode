public class LC11ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int currentMax = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while(left < right)
        {
            int minHeight = Math.min(height[left], height[right]);
            int width = right-left;
            int currArea = minHeight * width;

            if (currArea > currentMax)
                currentMax = currArea;

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return currentMax;
    }
}
