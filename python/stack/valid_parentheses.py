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

    def isValid2(self, s: str) -> bool:
        stack = []
        bracket_map = {")": "(", "}": "{", "]": "["}
        for bracket in s:
            #   if bracket is open -> push on top of stack
            if bracket in bracket_map.values():
                stack.append(bracket)

            # if bracket is close -> pop top if it is open bracket
            elif bracket in bracket_map.keys():
                if stack and bracket_map[bracket] == stack[-1]:
                    stack.pop()
                else:
                    return False
        return len(stack) == 0


if __name__ == "__main__":
    s = Solution()
    print(s.isValid2("()"))  # True
    print(s.isValid2("()[]{}"))  # True
    print(s.isValid2("(]"))  # False
    print(s.isValid2("([)]"))  # False
    print(s.isValid2("{[]}"))  # True
