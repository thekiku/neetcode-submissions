class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m = sorted(s)
        n = sorted(t)

        if len(m) != len(n):
            return False

        for i in range(len(m)):
            # j is always the same as i when comparing sorted lists
            if m[i] != n[i]:
                return False

        return True
