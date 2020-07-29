Trick
---------

Detect Hollow Arrays:

    An array is considered hollow when it contains n zeros in the middle
    that are both preceded and followed by n non-zero numbers; n must be
    greater than or equal to 3. 
       
    Implement the isHollow function so that it returns true for arrays that 
    are hollow, otherwise return false.

Hollow:

    1,1,1,0,0,0,1,1,1
    1,1,1,1,0,0,0,0,1,1,1,1
    -55,28,53,24,0,0,0,0,47,-85,46,79

Not Hollow:

    1,1,0,0,1,1
    1,0,1,0,0,0,1,1,1
    1,1,1,0,0,0,1,1,0
    1,1,0,0,0,1,1
    0,0,0,1,1,1,1,1,1

