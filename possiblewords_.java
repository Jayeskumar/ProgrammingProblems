import java.util.*;    
class PossibleWordsz{
    /*Identify possible words: Detective Bakshi while solving a case stumbled upon a letter which
had many words whose one character was missing ie. one character in the word was replaced
by an underscore. For e.g. “Fi_ er”. He also found thin strips of paper which had a group of
words separated by colons, for e.g. “Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer”. He could
figure out that the word whose one character was missing was one of the possible words from
the thin strips of paper. Detective Bakshi has approached you (a computer programmer)
asking for help in identifying the possible words for each incomplete word.
You are expected to write a function to identify the set of possible words
The function identity PossibleWords takes two strings as input,
where
input1 contains the incomplete word, and
input2 is the string containing a set of words separated by colons
The function is expected to find all the possible words from input2 that can replace the
incomplete word input1, and then return the final output string in the format specified below
See below examples carefully to understand the format of input1, input2 and output
Example1:
input1= "Fi_er”
input2=”Fever:filer:Filter: Fixer:fiber:fibre:tailor:offer”
output= "FILER:FIXER FIBER”
Note that-
● Output string should contain the set of all possible words that can replace the
incomplete word in input1
● all words in the output string should be stored in UPPER-CASE
● all words in the output string should appear in the order in which they appeared in
input2, i.e. in the above example we have FILER followed by FIXER followed by
FIBER.
● While searching for input1 in input2, the case of the letters are ignored, i.e Fi er
matches with filer as well as Fixer as well as "fiber”.
● IMPORTANT: If none of the words in input2 are possible candidates to replace input1,
the output string should be “ERROR-009”. */
static String identityPossibleWords(String input1, String input2){
   int i,j;
    input1 = input1.toUpperCase();
    input2 = input2.toUpperCase();
    String word="", res="";
    String[] words = input2.split(":");
    for(i=0;i<words.length;i++)
    {
    word = words[i];
    if(input1.length()==word.length())
    {
    for(j=0;j<input1.length();j++)
    {
    if(input1.charAt(j)!='_' && input1.charAt(j)!=word.charAt(j))
    {
    break;
    }
    }
    if(j==input1.length())
    {
    res=res + word+":";
    }
    }
    }
    return res.length()==0?"ERROR-009":res.substring(0,res.length()-1);

    }
    public static void main(String[] args){
        String input1 = "Fi_er";
        String input2 = "”Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
        System.out.println(identityPossibleWords(input1, input2));
    }


    
}