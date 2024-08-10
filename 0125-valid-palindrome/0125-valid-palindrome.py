class Solution:
    def isPalindrome(self, s: str) -> bool:
        trimmed_str = ''.join(c.lower() for c in s if c.isalnum())
        return trimmed_str == trimmed_str[::-1]