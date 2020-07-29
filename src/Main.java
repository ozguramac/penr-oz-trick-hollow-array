class Main {
  public static void main(String[] args) throws Exception {
    // hollow
    testHollow(true, new int[] {1,1,1,0,0,0,1,1,1});
    testHollow(true, new int[] {1,1,1,1,0,0,0,0,1,1,1,1});

    // not hollow
    testHollow(false, new int[] {1,1,0,0,1,1});
    testHollow(false, new int[] {1,0,1,0,0,0,1,1,1});
    testHollow(false, new int[] {1,1,1,0,0,0,1,1,0});
    testHollow(false, new int[] {1,1,0,0,0,1,1});
    testHollow(false, new int[] {0,0,0,1,1,1,1,1,1});

    // test with real numbers
    testHollow(true, new int[] {-55,28,53,24,0,0,0,0,47,-85,46,79});
    
    System.out.println("Your code works!");
  }
  
  private static void testHollow(boolean expectation, int[] sampleArray) throws Exception {
    if(expectation != isHollow(sampleArray)){
      throw new Exception("Your code does not work.");
    }
  }
  
  private static boolean isHollow(int[] sampleArray) {
  /*
    An array is considered hollow when it contains n zeros in the middle
    that are both preceded and followed by n non-zero numbers; n must be
    greater than or equal to 3. 
       
    Implement the isHollow function so that it returns true for arrays that 
    are hollow, otherwise return false.
  */
int zeroCnt=0, nonZeroCnt=0;
for (int i=0; i < sampleArray.length; i++) {
  int x = sampleArray[i];
  if (x == 0) {
    if (i < 3) {
      return false;
    }
    if (nonZeroCnt > 0 && nonZeroCnt < 3) {
      return false;
    }
    nonZeroCnt = 0;
    zeroCnt++;
  }
  else {
    if (zeroCnt > 0 && zeroCnt < 3) {
      return false;
    }
    zeroCnt = 0;
    nonZeroCnt++;  
  }
}

return true;
  }
}
