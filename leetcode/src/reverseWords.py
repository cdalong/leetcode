class Solution(object):
    def reverseWords(self, s):
        
        reverse = list(s)
        
        blah = s.split(" ")
        
        print blah
        
        rever = []
        
        for word in blah:
        
            reverse = list(word)
        
            for letter in range(0, len(word)):
            
                 reverse[letter] = word[len(word) - letter - 1]
            
            rever.append("".join(reverse))
            
        print rever    
        return " ".join(rever)
        """
        :type s: str
        :rtype: str
        """