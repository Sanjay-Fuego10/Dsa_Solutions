class Solution(object):
    def lengthOfLongestSubstring(self, s):
        left = 0
        maxlen = 0
        seen = set()
        for right in range(len(s)):
            ch = s[right]
            while ch in seen:
                seen.remove(s[left])
                left += 1
            seen.add(ch)
            length = right - left +1
            if length > maxlen:
                maxlen = length
        return maxlen

        