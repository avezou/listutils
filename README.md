# ListUtils
A library of utils missing in the Java's list interface.
As far as I know they are not available in apache commons either
This will be a growing list

https://github.com/avezou/listutils/workflows/ListUtil%20CI/badge.svg

### ListDiff
Given two lists return a list of elements that are uncommon between them. 
In essence, return (A U B) n (A U B) <==> (A - B) U (B - A)
