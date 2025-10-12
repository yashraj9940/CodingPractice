class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // Step 2: Put unique elements into an array
        int n = freqMap.size();
        int[] unique = new int[n];
        int idx = 0;
        for (int key : freqMap.keySet()) {
            unique[idx++] = key;
        }

        // Step 3: Quickselect to partition by frequency
        quickSelect(unique, 0, n - 1, n - k, freqMap);

        // Step 4: Collect top k
        return Arrays.copyOfRange(unique, n - k, n);
    }

    private void quickSelect(int[] unique, int left, int right, int kSmallest, Map<Integer, Integer> freqMap) {
        if (left >= right) return;

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        pivotIndex = partition(unique, left, right, pivotIndex, freqMap);

        if (pivotIndex == kSmallest) {
            return;
        } else if (pivotIndex < kSmallest) {
            quickSelect(unique, pivotIndex + 1, right, kSmallest, freqMap);
        } else {
            quickSelect(unique, left, pivotIndex - 1, kSmallest, freqMap);
        }
    }

    private int partition(int[] unique, int left, int right, int pivotIndex, Map<Integer, Integer> freqMap) {
        int pivotFreq = freqMap.get(unique[pivotIndex]);
        swap(unique, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (freqMap.get(unique[i]) < pivotFreq) {
                swap(unique, storeIndex, i);
                storeIndex++;
            }
        }
        swap(unique, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}