class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        bracket_map = {"{": "}", "[": "]", "(": ")"}
        for bracket in s:
            if stack:
                if bracket_map.get(stack[-1]) == bracket:
                    #   nếu stack ko rỗng và bracket là close bracket thì pop top nếu nó là open bracket
                    stack.pop()
                else:
                    # nếu ko phải close bracket thì push bracket vào stack
                    stack.append(bracket)
            else:
                # nếu ko phải top thì bracket sẽ là top
                stack.append(bracket)

        # return liệu stack rỗng
        return len(stack) == 0


if __name__ == "__main__":
    s = Solution()
    print(s.isValid("()"))  # True
    print(s.isValid("()[]{}"))  # True
    print(s.isValid("(]"))  # False
    print(s.isValid("([)]"))  # False
    print(s.isValid("{[]}"))  # True
