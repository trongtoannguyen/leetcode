from typing import List

""" 
Link problem: https://leetcode.com/problems/longest-common-prefix/
"""
class Solution:
    # ["flop", "fly", "flower"]
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        
        common_word = min(strs, key=len) #"fly"
        # compare "fly" forward
        for i in range(len(common_word)):
            for word in strs:
                if(common_word[i] != word[i]):
                    return common_word[:i]
        return common_word
            
            
s = Solution()
print(s.longestCommonPrefix(["flower","flow","flight"]))  # Output: "fl"
print(s.longestCommonPrefix([""]))  # Output: ""
print(s.longestCommonPrefix("a"))  # Output: "a"
print(s.longestCommonPrefix(["", "b"]))  # Output: ""