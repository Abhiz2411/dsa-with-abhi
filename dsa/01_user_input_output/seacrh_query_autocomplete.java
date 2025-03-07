// Source: https://www.geeksforgeeks.org/problems/search-query-auto-complete/0?category%5B%5D=Strings&problemStatus=unsolved&difficulty%5B%5D=2&page=1&query=category%5B%5DStringsproblemStatusunsolveddifficulty%5B%5D2page1category%5B%5DStr
// Search query autocomplete program in Java
// Last Updated : 08th Feb., 2025
// Abhijit Zende
/*
    Design a search query autocomplete system for a search engine.

    The users will input a sentence ( which may have multiple words and ends with special character '#').

    For each character they type except '#', you need to return the top 3 previously entered and most frequently queried sentences that have prefix the same as the part of sentence already typed.

    Here are the specific rules:

    The frequency for a sentence is defined as the number of times a user typed the exactly same sentence before.
    The returned top 3 sentences should be sorted by frequency (The first is the most frequent).  If several sentences have the same frequency, you need to use ASCII-code order (smaller one appears first).
    If less than 3 valid sentences exist, then just return as many as you can.
    When the input is a special character, it means the sentence ends, and in this case, you need to return an empty list.
    
    Your job is to implement the methods of the AutoCompleteSystem:

    AutoCompleteSystem(String[] sentences, int[] times): This is the constructor. The input is previously used data. Sentences is a string array consists of previously typed sentences. Times is the corresponding times a sentence has been typed. Your system should record these historical sentences.
    Now, the user wants to input a new sentence. The following function will provide the next character the user types:

    String[] input(char c): The input c is the next character typed by the user. The character will only be lower-case letters ('a' to 'z'), blank space (' ') or a special character ('#'). Also, the previously typed sentence should be recorded in your system. The output an array will be the top 3 historical sentences that have prefix the same as the part of sentence already typed.
    
    Example:

    Operation:
    AutoCompleteSystem(["i love you", "island",
    "ironman", "i love geeksforgeeks"], [5,3,2,2])

    The system have already tracked down the 
    following sentences and their corresponding 
    times: 
    "i love you" : 5 times 
    "island" : 3 times 
    "ironman" : 2 times 
    "i love geeksforgeeks" : 2 times 

    Now, the user begins another search: 

    Operation: input('i') 
    Output: 
    ["i love you", "island","i love 
                        geeksforgeeks"] 

    Explanation: 
    There are four sentences that have prefix 
    "i". Among them, "ironman" and "i love 
    geeksforgeeks" have same frequency. Since 
    ' ' has ASCII code 32 and 'r' has ASCII code
    114, "i love geeksforgeeks" should be in 
    front of "ironman". Also we only need to 
    output top 3 most frequent sentences, so 
    "ironman" will be ignored. 

    Operation: input(' ') 
    Output: ["i love you","i love geeksforgeeks"] 
    Explanation: 
    There are only two sentences that have prefix 
    "i ". 

    Operation: input('a') 
    Output: [] 
    Explanation: 
    There are no sentences that have prefix "i a"

    Operation: input('#') 
    Output: [] 
    Explanation: 
    The user finished the input, the sentence 
    "i a" should be saved as a historical 
    sentence in system. And the next input 
    will be counted as a new search.
    Your Task:

    You don't need to take inputs or give outputs . You just have to complete the input() method and the constructor.

    Expected Time Complexity: O(n*max|L|), per input query where n represents the number of historical sentences in the system and L is the maximum length of the words.

    Constraints:

    The input sentence will always start with a letter and end with '#', and at most one blank space will exist between two words.
    The number of complete sentences that to be searched won't exceed 102.
    The length of each sentence including those in the historical data and query data won't exceed 102.

*/
class seacrh_query_autocomplete {
    public static void main(String[] args){
        
    }
}
