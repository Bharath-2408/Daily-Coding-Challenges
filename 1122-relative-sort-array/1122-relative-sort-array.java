class Solution
{
public
    int[] relativeSortArray(int[] arr1, int[] arr2)
    {
        int[] frequency = new int[1001];
        int arr1Length = arr1.length;
        int resultIndex = 0;
        int maxElement = 0;
        for (int num : arr1)
        {
            frequency[num]++;
            maxElement = Math.max(num, maxElement);
        }
        int[] sortedArray = new int[arr1Length];
        for (int num : arr2)
        {
            while (frequency[num]-- > 0)
            {
                sortedArray[resultIndex++] = num;
            }
        }
        for (int num = 0; num <= maxElement; num++)
        {
            while (frequency[num]-- > 0)
            {
                sortedArray[resultIndex++] = num;
            }
        }
        return sortedArray;
    }
}