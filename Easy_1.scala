object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var index = 0
        var retVal = Array.empty[Int]
        while (index < nums.length && retVal.isEmpty) {
            var subIndex = 1
            while (subIndex < nums.length && retVal.isEmpty) {
                if (index != subIndex) {
                    if (nums(index) + nums(subIndex) == target) {
                        retVal = Array(index, subIndex)
                    }
                }
                subIndex += 1
            }
            index += 1
        }
        return retVal
    }
}