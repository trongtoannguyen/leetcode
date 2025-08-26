from typing import List

""" 
Link problem: https://leetcode.com/problems/longest-common-prefix/
"""
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        
        common_word = min(strs, key=len)
        result = ""
        for i in range(len(common_word)):
            c = common_word[i]
            for index, word in enumerate(strs):
                if word[i] == c:
                  if index == len(strs) - 1:
                      result += word[i]
                else:
                    return result
        return result
            
s = Solution()
print(s.longestCommonPrefix(["flower","flow","flight"]))  # Output: "fl"
print(s.longestCommonPrefix([""]))  # Output: ""
print(s.longestCommonPrefix("a"))  # Output: "a"
print(s.longestCommonPrefix(["", "b"]))  # Output: ""