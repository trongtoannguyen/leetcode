def validate_row(arr: list[list[int]]) -> bool:
    rows = set()
    for r, c in arr:
        if r in rows:
            return False
        rows.add(r)
    return True


def validate_col(arr: list[list[int]]) -> bool:
    cols = set()
    for r, c in arr:
        if c in cols:
            return False
        cols.add(c)
    return True


def validate_box(arr: list[list[int]]) -> bool:
    boxes = set()
    for r, c in arr:
        box_index = (r // 3, c // 3)
        if box_index in boxes:
            return False
        boxes.add(box_index)
    return True


class Solution:

    def isValidSudoku(self, board: list[list[str]]) -> bool:
        # define hashtable to build
        table = [[], [], [], [], [], [], [], [], [], []]
        for idx, row in enumerate(board):

            for index, num in enumerate(row):
                if num != ".":
                    print(num)
                    table[int(num)].append([idx, index])
                    if not validate_row(table[int(num)]):
                        return False
                    if not validate_col(table[int(num)]):
                        return False
                    if not validate_box(table[int(num)]):
                        return False

        print(table)
        return True


s = Solution()
s.isValidSudoku(
    [
        ["5", ".", ".", ".", "7", ".", ".", ".", "."],
        ["6", ".", ".", "1", "9", "5", ".", ".", "."],
        [".", "9", "8", ".", ".", ".", ".", "6", "."],
        ["8", ".", ".", ".", "6", ".", ".", ".", "3"],
        ["4", ".", ".", "8", ".", "3", ".", ".", "1"],
        ["7", ".", ".", ".", "2", ".", ".", ".", "6"],
        [".", "6", ".", ".", ".", ".", "2", "8", "."],
        [".", ".", ".", "4", "1", "9", ".", ".", "5"],
        [".", ".", ".", ".", "8", ".", ".", "7", "9"],
    ]
)
