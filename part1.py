def isPalindrome(text):
    text = text.lower()
    i,j = 0,1
    result = True
    while (i < len(text)-j):
        
        while (ord(text[i])<97 and ord(text[i])>122):
            i=i+1
        while (ord(text[-j])<97 and ord(text[-j])>122):
            j=j-1
        print(text[i], text[-j])
        if (text[i] == text[-j]):
            i=i+1
            j=j-1
        else:
            result = False
            
    return(result)
        
def main():
    isPalindrome("Madam, in Eden, I'm Adam")
    #isPalindrome( "Complete the project report")

if __name__ == "__main__":
    main()
      