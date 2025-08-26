"""
You are given a 2D 0-indexed integer array dimensions.

For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.

Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.

Link problem: https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
"""


def rect_diagonal(length: int, width: int) -> float:
    return (length**2 + width**2) ** 0.5


def area(length, width):
    return length * width


from typing import List


class Solution:
    # hint: Diagonal of rectangle is sqrt(length^2 + width^2).
    def area_of_max_diagonal(self, dimensions: List[List[int]]) -> int:
        _max = 0
        for i in range(1, len(dimensions)):
            rect = dimensions[i]
        if rect_diagonal(rect[0], rect[1]) > rect_diagonal(
            dimensions[_max][0], dimensions[_max][1]
        ):
            _max = i
        elif rect_diagonal(rect[0], rect[1]) == rect_diagonal(
            dimensions[_max][0], dimensions[_max][1]
        ):
            # max is one has max area
            _max = (
                i
                if dimensions[i][0] * dimensions[i][1]
                > dimensions[_max][0] * dimensions[_max][1]
                else _max
            )
        return dimensions[_max][0] * dimensions[_max][1]


# test
if __name__ == "__main__":
    s = Solution()
    print(s.area_of_max_diagonal([[1, 2], [2, 3], [1, 4]]))  # 4
    print(s.area_of_max_diagonal([[5, 8], [3, 9], [5, 12]]))  # 60
    print(s.area_of_max_diagonal([[2, 3], [3, 7], [4, 4], [5, 5]]))  # 25
