package lab4MyWay;

import java.util.*;

public class HuffmanCode {
	
	public static String[] huffman = new String[256];	// huffman codes go in here
    public static String test = "";		// The string that is getting scanned in
    public static String lengthOfA = "";
    public static String lengthOfH = "";
    
    
    // input is an array of frequencies, indexed by character code
    public static HuffmanTree buildTree(int[] charFreqs) {
        PriorityQueue<HuffmanTree> trees = new PriorityQueue<HuffmanTree>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charFreqs.length; i++) {
        	if (charFreqs[i] > 0) {
        		trees.offer(new HuffmanLeaf(charFreqs[i], (char)i));
        		
        	}
        	
        }	
        assert trees.size() > 0;	// assume there's at least one elemnt int the trees quue
        // loop until there is only one tree left
        while (trees.size() > 1) {
            // two trees with least frequency
            HuffmanTree a = trees.poll();
            
            HuffmanTree b = trees.poll();
            
 
            // put into new node and re-insert into queue
            trees.offer(new HuffmanNode(a, b));
        }
        
        return trees.poll();
    }
    
    
 
    
    public static void printCodes(HuffmanTree tree, StringBuffer prefix) {
        assert tree != null;	// assume the HuffmanTree is not null
        
        if (tree instanceof HuffmanLeaf) {	// if the tree is an instance of HuffmanLeaf
        	
            HuffmanLeaf leaf = (HuffmanLeaf)tree;	// make a huffmanLeaf and cast the value of tree into it
 
            // print out character, frequency, and code for this leaf (which is just the prefix)
//            System.out.println(leaf.value + "\t\t" + prefix);
            
            huffman[(int)(leaf.value)] = prefix.toString();
            
            
            
 
        } else if (tree instanceof HuffmanNode) {
            HuffmanNode node = (HuffmanNode)tree;
 
            // traverse left
            prefix.append('0');
            printCodes(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1); 
 
            // traverse right
            prefix.append('1');
            printCodes(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
            
        }
    }
    
    
    
    public static void main(String[] args) {
    	
    	System.out.println("Please enter the string you want to compress");
    	Scanner scan = new Scanner(System.in);
        test = scan.nextLine();
 
        // we will assume that all our characters will have
        // code less than 256, for simplicity
        int[] charFreqs = new int[256];
        // read each character and record the frequencies
        for (char c : test.toCharArray()) 
            charFreqs[(int)c]++;
        
		
		// Prints out the binary representation of the string
		for(int i = 0; i<test.length(); i++) {
			
				if(Integer.toBinaryString((int)test.charAt(i)).length() == 6) {
					System.out.print("0" + Integer.toBinaryString((int)test.charAt(i)) + " ");
					lengthOfA += "0" + Integer.toBinaryString((int)test.charAt(i));
				} else {
					System.out.print(Integer.toBinaryString((int)test.charAt(i)) + " ");
					lengthOfA += Integer.toBinaryString((int)test.charAt(i));
				}
				
				if((i+1) % 8 == 0) {
					System.out.println("");
				}
		}
		System.out.println("");
		System.out.println("");
        
        // print out how many times the character occurs
        for(int i = 0; i<charFreqs.length; i++) {
			if(charFreqs[i] != 0 ) {
				
				System.out.println("'" + (char)i + "' appeared " + charFreqs[i] + ((charFreqs[i] > 1) ?  " times" : " time"));
			
			}
		}
            
        // build tree
        HuffmanTree tree = buildTree(charFreqs);
        

        // print out results
//        System.out.println("CHARACTER\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
        
        // Print out the huffman code.
        System.out.println("");
        for(int i = 0; i<test.length(); i++) {
			char a = test.charAt(i);
			System.out.print(huffman[(int)a] + " " );
			lengthOfH += huffman[(int)a];
			if((i+1) % 8 == 0) {
				System.out.println("");
			}
		}
        
        // Prints out the compression ratio
        System.out.println("\nCompressed size is " + lengthOfH.length() + " bites /" + lengthOfA.length() + " bits =  " + 100*((double)lengthOfH.length()/(double)lengthOfA.length()) + "%");
        
    }
}
